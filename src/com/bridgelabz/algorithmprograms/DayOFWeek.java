	/******************************************************************************
	 *  Compilation:  javac -d bin DayOFWeek.java
	 *  Execution:    java -cp bin com.bridgelabz.util.DayOFWeek n
	 *  
	 *  Purpose: Determines the day of the date.
	 *
	 *  @author  Tharun Kumar 
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class DayOFWeek {
	/*
	* The main function is written to take input from the user and and 
	* call the dayOfWeek function that returns the integer 
	* representation of the week
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the date");
		int date=Algorithmprograms.readInteger();
		System.out.println("enter the month");
		int month=Algorithmprograms.readInteger();
		System.out.println("enter the year");
		int year=Algorithmprograms.readInteger();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Algorithmprograms.dayofWeek(date, month, year);}}
