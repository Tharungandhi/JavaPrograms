	/******************************************************************************
	 *  Compilation:  javac -d bin MergSort.java
	 *  Execution:    java -cp bin com.bridgelabz.util.MergSort n
	 *  
	 *  Purpose: MergSort.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class MergSort {
	/*
	* The main function is written to take input from the user and
	* call mergeSort functions that sorts the given array.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	        System.out.println("Merge sort");
	        int i;
	        System.out.println("Enter the size of your array"); 
	        int n=Algorithmprograms.readInteger(); 
	        String arr[]=new String[n];
	        System.out.println("Enter the elements"); 

	        for( i=0;i<n;i++)
	            arr[i]=Algorithmprograms.readString();  
	       //Method 1- using static function of AlgorithmUtility class of
	       //com.bridgelabz.util package
	        Algorithmprograms.mergSort(arr,0,n);  
	        System.out.println("Elements after sorting");
	        for(i=0;i<n;i++)
	            System.out.println(arr[i]+"");}}
