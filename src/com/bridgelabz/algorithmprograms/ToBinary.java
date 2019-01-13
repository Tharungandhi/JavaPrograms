
	/******************************************************************************
	 *  Compilation:  javac -d bin ToBinary.java
	 *  Execution:    java -cp bin com.bridgelabz.util.ToBinary n
	 *  
	 *  Purpose: Decimal to Binary.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class ToBinary {

	/*
	* The main function is written to take input from the user and
	* call the toBinary function that converts decimal to binary
	*/

	public static void main(String[] args) {
		System.out.println("enter the decimal number"); 
		int num=Algorithmprograms.readInteger(); 
		//Method 1- using static function of AlgorithmUtility class of
        //com.bridgelabz.util package
		Algorithmprograms.convertBinary(num);}}
