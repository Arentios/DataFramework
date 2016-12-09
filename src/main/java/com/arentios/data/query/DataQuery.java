package com.arentios.data.query;

import java.util.ArrayList;
import java.util.List;

import com.arentios.data.datatypes.Queryable;

public class DataQuery {

	/**
	 * Run a query against a list, returning all results which match all keys in a given list of keys
	 * @param list
	 * @param queryKeys
	 * @return
	 */
	public static <T extends Queryable> List<T> queryByAllKeys(List<T> list, List<String> queryKeys){
		List<T> results = new ArrayList<T>();
		for(T data : list){
			List<String> keys = data.getQueryKeys();
			if(keys.containsAll(queryKeys)){
				results.add(data);
			}
		}
		return results;
	}

	/**
	 * Run a query against a lit, returning all results which match at least one key in a given list of keys
	 * @param list
	 * @param queryKeys
	 * @return
	 */
	public static <T extends Queryable> List<T> queryByKeys(List<T> list, List<String> queryKeys){
		List<T> results = new ArrayList<T>();
		for(T data : list){
			List<String> keys = data.getQueryKeys();
			for(String queryKey : keys){ //If one key matches add the object to the result set
				if(keys.contains(queryKey)){
					results.add(data);
					break; //No need to keep searching since we only care about matching one key
				}
			}
		}
		return results;
	}

	
}
