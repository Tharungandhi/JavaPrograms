/******************************************************************************
 *  Compilation:  javac -d bin Harmonic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Harmonic n
 *  
 *  Purpose:Harmonic Number.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.*;


public class Harmonic {
	/*
	* The main function is written to take input from the user and
	* call harmonicValue function that prints harmonic value
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reading input number from the user
		System.out.println("enter the value of n");
		int s1=Functionalprograms.readInteger();
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		Functionalprograms.harmonic(s1);}}
