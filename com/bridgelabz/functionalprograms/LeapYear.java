/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear n
 *  
 *  Purpose:Leap Year.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.*;
public class LeapYear {
	/*
	* The main function is written to take input from the user and
	* to find the leap year that prints leap year
	*/

	public static void main(String[] args) {
		//Reading input number from the user
		System.out.println("enter the year"); 
		int i1=Functionalprograms.readInteger();
		//Method 1- using static function of FunctionalUtilty class
	    //of com.bridgelabz.util package
		Functionalprograms.leapYear(i1);}}
