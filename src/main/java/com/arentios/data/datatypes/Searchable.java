package com.arentios.data.datatypes;

import java.util.List;

//Abstract class to represent a class that can be used in searches
public abstract class Searchable{
	
	//Get a list of keys for searching, these are then matched against to see if something matches
	//Not usings equals because something being a match for search purposes doesn't necessarily mean it's equal in all respects
	public abstract List<String> getSearchKeys();
	
	/**
	 * Default search implementation
	 * Simply check the search keys for the target and return this is found
	 * More complex search criteria can be implemented by inheriting classes
	 * @param o
	 * @return
	 */
	public Searchable searchKeys(String target) {
		List<String> keys = this.getSearchKeys();
		if(keys == null){ //If this contains no keys, don't even try to search
			return null;
		}
		if(this.getSearchKeys().contains(target)){ //The search keys contain the target, return the object
			return this;
		}
		//Otherwise return null
		return null;
		
		
	}

}
