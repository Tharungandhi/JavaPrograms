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

		String i=args[0];
		int num=Integer.parseInt(i);

		int range=(int)(Math.pow(2, num-1));
		System.out.println("Take number between 0 to "+(range-1));
		System.out.println();
		System.out.println("Is the number selected");
		Algorithmprograms.userBoolean();
		int first=0;
		int last=range-1;
		int middle=(first+last)/2;
		int count=0; 
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Algorithmprograms.findNumber(first,last,middle,count,num); 
		}}