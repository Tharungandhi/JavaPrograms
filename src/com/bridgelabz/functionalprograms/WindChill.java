/******************************************************************************
 *  Compilation:  javac -d bin WindChill .java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill  n
 *  
 *  Purpose:WindChill to defines the effective temperature.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class WindChill {
	/*
	* The main function is written to take input from the user and
	* call WindChill function that calculates the effective temperature
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reading input from the user
		System.out.println("enter the temperature");
		double t=Functionalprograms.readdouble();  
		System.out.println("enter the wind speed"); 
		double s=Functionalprograms.readdouble(); 
		if(t<50 && s<120||s>3)
			//Method 1- using static function of FunctionalUtilty class
	    	//of com.bridgelabz.util package
			Functionalprograms.windChill(t,s); 
		else
			System.out.println("enter the valid temperature and speed"); }}
