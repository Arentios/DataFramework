package com.arentios.data.cache;

import java.util.ArrayList; 
import java.util.Set;

import org.apache.commons.jcs.JCS;
import org.apache.commons.jcs.access.CacheAccess;
import org.apache.commons.jcs.engine.control.CompositeCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.arentios.data.datatypes.Searchable;

/**
 * Basic JCS cache manager system for data framework objects
 * @author Arentios
 *
 */
public class DataCacheManager {

	
	private static final String DATA_CACHE = "dataCache";
	
	private static CacheAccess<Integer, Searchable> dataCache;
	private static Logger LOGGER = LoggerFactory.getLogger(DataCacheManager.class);
	private static DataCacheManager instance;
	
	private DataCacheManager(){
		
		dataCache = JCS.getInstance(DATA_CACHE);
	}
	
	public static DataCacheManager getInstance(){
		if (instance == null){
			instance = new DataCacheManager();
		}
		return instance;
	}
	
	public boolean putPerson(Searchable data){
		try{
			//Clear out any old entry for this key
			if(data != null){
				dataCache.remove(data.hashCode());
			}
			dataCache.put(data.hashCode(), data);
		}catch(Exception e){
			LOGGER.error(e.getMessage());
			return false;
		}
		return true;
	}
	
	public Searchable getData(Integer hashCode){
		try{
			Searchable data = dataCache.get(hashCode);
			return data;
		}catch(Exception e){
			LOGGER.error(e.getMessage());
			return null;
		}

	}
	
	/**
	 * Return an array list of all keys from the cache
	 * @return
	 */
	public ArrayList<Long> getAllDataKeys(){
		Set<Object> rawKeys = CompositeCacheManager.getInstance().getCache(DATA_CACHE).getMemoryCache().getKeySet();
		ArrayList<Long> results = new ArrayList<Long>();
		for(Object o : rawKeys){
			results.add((Long) o);
		}	
		return results;
		
		
	}

}
