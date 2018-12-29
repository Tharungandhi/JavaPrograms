/******************************************************************************
 *  Compilation:  javac -d bin FindNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.FindNumber n
 *  
 *  Purpose: Question to find your number
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class FindNumber {
	/*
	* The main function is written to take input from the user and
	* calls findNumber function to guess the answer with n questions
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any Number:"); 
		int n=Algorithmprograms.readInteger();  
		int range=(int)(Math.pow(2,n-1));      //range calculation for the number
		System.out.println("Take number between '0' to "+(range-1));
		int count=0;
		String input1 = null;
		int lower=0;
		int upper=range;
		int middle=(lower+upper/2);
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Algorithmprograms.findNumber(lower,upper,middle,count,input1,n); }}
