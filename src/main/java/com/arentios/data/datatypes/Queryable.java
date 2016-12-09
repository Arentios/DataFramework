package com.arentios.data.datatypes;

import java.util.List;

//Abstract class to represent a class that can be used in queries
public abstract class Queryable{
	
	//Get a list of keys for searching, these are then matched against to see if something matches
	public abstract List<String> getQueryKeys();
	
	/**
	 * Default search implementation
	 * Simply check the search keys for the target and return true if found
	 * More complex search criteria can be implemented by inheriting classes
	 * @param o
	 * @return
	 */
	public Boolean checkForKey(String key) {
		List<String> keys = this.getQueryKeys();
		if(keys == null){ //If this contains no keys, don't even try to query
			return false;
		}
		if(this.getQueryKeys().contains(key)){ //The query keys contain the target return true
			return true;
		}
		//Otherwise return null
		return false;
		
		
	}

}
