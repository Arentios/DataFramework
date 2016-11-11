package com.arentios.data.datatypes;

import java.util.List;

//Abstract class to represent a class that can be used in searches
public abstract class Searchable implements Comparable<Searchable>{
	
	//Get a list of keys for searching, these are then matched against to see if something matches
	//Not usings equals because something being a match for search purposes doesn't necessarily mean it's equal in all respects
	public abstract List<String> getSearchKeys();

}
