
/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.util.InsertionSort n
 *  
 *  Purpose: InsertionSort
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/package com.bridgelabz.algorithmprograms;

 import com.bridgelabz.util.Algorithmprograms;

 public class InsertionSort {
	    /*
		* The main function is written to take input from the user and calls 
		* the function insertionSort that sorts the array
		*/
	 public static void main(String[] args) {
		 System.out.println("enter the number of string to be entered");
		 int num=Algorithmprograms.readInteger();  
		 String[] str=new String[num];              
		 for(int i=0;i<str.length;i++){
			 System.out.println("enter "+(i+1)+" string");
			 str[i]=Algorithmprograms.readString();   }
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		 String[] str2=Algorithmprograms.insertionsortArray(str);   //calling a method storing in ref variable
		 int n=str.length;
		 for(int i=0;i<n;i++)
			 System.out.println(str2[i]+" in the position " + i); }}


