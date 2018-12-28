/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConv.java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConv n
 *  
 *  Purpose: temperaturConversion fahrenheit to Celsius or viceversa using the formula.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class TemperatureConv {
	
	/*
	* The main function is written to take input from the user and
	* call the tempConversion function that converts temperature
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the choice to convert to the following:");
		System.out.println("1-Celcius1 2-Fahrenheit");
		
		int choice=Algorithmprograms.readInteger(); //Reading the choice of the user
		System.out.println("Enter the temp");
		
		double temp=Algorithmprograms.readdouble();//Reading the input from the user
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		double conv_temp=Algorithmprograms.temperatureConversion(choice,temp);
         System.out.println(conv_temp);
	}

}
