	/******************************************************************************
	 *  Compilation:  javac -d bin BubbleSort.java
	 *  Execution:    java -cp bin com.bridgelabz.util.BubbleSort n
	 *  
	 *  Purpose: BubbleSort.
	 *
	 *  @author  Tharun Kumar M B
	 *  @version 1.0
	 *  @since   10-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class BubbleSort {
	/*
	* The main function is written to take input from the user and and 
	* call the bubbleSort function that sorts array of integers
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many numbers you want to insert");
		int n=Algorithmprograms.readInteger();
		System.out.println("Enter the array elements");
		int[] array=new int[n];
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Algorithmprograms.bubbleSort(n, array); }}
