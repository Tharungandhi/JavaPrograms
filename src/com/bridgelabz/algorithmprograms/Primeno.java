	/******************************************************************************
	 *  Compilation:  javac -d bin Primeno.java
	 *  Execution:    java -cp bin com.bridgelabz.util.Primeno n
	 *  
	 *  Purpose:  To Determine the Prime numbers in that range
	 *
	 *  @author  Tharun Kumar 
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.List;
import java.util.ArrayList;

import com.bridgelabz.util.Algorithmprograms;

public class Primeno {

	/*
	* The main function is written to take input from the user and
	* call the primeNumber() function that finds prime numbers
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the range: say m and n");
		System.out.println("Enter m");
		int m=Algorithmprograms.readInteger();
		System.out.println("Enter n");
		int n=Algorithmprograms.readInteger();;
		List<Integer> lst=new ArrayList<>();	
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		lst=Algorithmprograms.primeNumbers(m,n);	
		for(int i:lst)
			System.out.println(i);}}


