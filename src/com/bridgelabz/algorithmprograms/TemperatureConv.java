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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the temperature in celsius"); //user input
		int Celsius=Algorithmprograms.readInteger();  //storing the value to ref variable
		System.out.println("enter the temperature in Fahrenheit"); //user input
		int Fahrenheit=Algorithmprograms.readInteger();  //storing the value to ref variable
		Algorithmprograms.Fahrenheit(Fahrenheit); //method calling
		Algorithmprograms.celsius(Celsius);   //method calling

	}

}
