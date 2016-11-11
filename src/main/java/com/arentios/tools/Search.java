package com.arentios.tools;

import java.util.List;

//Class to implement binary searches
public class Search {

	/**
	 * Basic binary search
	 * Assume lists is already sorted
	 * @param list
	 * @param target
	 * @return
	 */
	public static <T extends Comparable<T>> T binarySearch(List<T> list, T target){
		if (list == null || list.size() == 0){ //Do not attempt to search a null or empty list, just return null
			return null;
		}
		int i = list.size() / 2;
		if(list.get(i).compareTo(target) == 0){
			return list.get(i);
		}
		else{
			if(list.get(i).compareTo(target) < 0 ){ //Greater than, go upwards
				return binarySearch(list.subList(i+1, list.size()), target);
			}
			else{ //Not equal, not greater, must be less, go down
				return binarySearch(list.subList(0, i), target);
			}
			
		}		
	}
	
	/**
	 * Fully naive linear search
	 * @param list
	 * @param target
	 * @return
	 */
	public static <T extends Comparable<T>> T linearSearch(List<T> list, T target){
		if (list == null || list.size() == 0){ //Do not attempt to search a null or empty list, just return null
			return null;
		}
		for(T i : list){
			if (i.compareTo(target)==0){
				return i;
			}
		}
		return null; //If we pass all the way through the list and don't find the element, return null
	}
	

	
	
}
