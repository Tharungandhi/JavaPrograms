/******************************************************************************
 *  Compilation:  javac -d bin Permutation .java
 *  Execution:    java -cp bin com.bridgelabz.util.Permutation  n
 *  
 *  Purpose:Leap Year.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Functionalprograms;

public class Permutation {
	/*
	* The main function is written to take input from the user and
	* call permute function that compares the permutation resulted 
	* by two methods
	*/
		public static void main(String[] args) {
	        System.out.println("enter a string");
	        String str = Functionalprograms.readString();
	        int len = str.length();
	        int fact=1;
	        for(int i=len;i>=1;i--)
	        {
	            fact=fact*i;
	        }
	        System.out.println("Possible combinations are :"+fact);
	        List<String> arr = new ArrayList<String>();
	        System.out.println("recursion of a string is ");
	        //Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
	        List<String> arr1=Functionalprograms.recursionPermutation(str, 0, len,arr);
	        System.out.println(arr1);
	        System.out.println("recursion size is: "+arr1.size());
	        System.out.println("array after sorting :");
	        arr1=Functionalprograms.listSort(arr1);
	        System.out.println(arr1);
	        System.out.println("--------------------------------------------------------------------------------");
	        System.out.println("iteration of a string is ");
	        //Method 2- using static function of FunctionalUtilty class of com.bridgelabz.util package
	        List<String> arr2=Functionalprograms.iterationPermutation(str);
	        System.out.println(arr2);
	        System.out.println("iteration size is: "+arr2.size());
	        System.out.println("array after sorting :");
	        arr2=Functionalprograms.listSort(arr2);
	        System.out.println(arr2);
	        System.out.println();
	        Functionalprograms.compareString(arr2,arr1);
		}}


