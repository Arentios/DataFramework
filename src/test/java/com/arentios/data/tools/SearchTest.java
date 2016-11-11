package com.arentios.data.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;

import com.arentios.tools.Search;

public class SearchTest {

	@Test
	public void binarySearchTest() {
		Random rand = new Random();
		
		Integer ints[] = new Integer[50];
		for(int i=0;i<50;i++){
			ints[i]=rand.nextInt(100)+1;
		}
		//Set a random value to 50 to search for it
		ints[rand.nextInt(50)] =  50;
		Arrays.sort(ints);
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i=0;i<50;i++){
			intArray.add(ints[i]);
		}
		assertTrue(Search.binarySearch(intArray, 50) != null);

	}
	
	@Test
	public void linearSearchTest() {
		Random rand = new Random();
		
		Integer ints[] = new Integer[50];
		for(int i=0;i<50;i++){
			ints[i]=rand.nextInt(100)+1;
		}
		//Set a random value to 50 to search for it
		ints[rand.nextInt(50)] =  50;
		Arrays.sort(ints);
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i=0;i<50;i++){
			intArray.add(ints[i]);
		}
		assertTrue(Search.linearSearch(intArray, 50) != null);

	}
	
}
