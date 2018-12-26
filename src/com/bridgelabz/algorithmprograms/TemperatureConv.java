	/******************************************************************************
	 *  Compilation:  javac -d bin anagram.java
	 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
	 *  
	 *  Purpose: Determines whether no is anagram or not.
	 *
	 *  @author  BridgeLabz
	 *  @version 1.0
	 *  @since   06-08-2017
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class TemperatureConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the temperature in celsius");
		Scanner sc=new Scanner(System.in);
		int Celsius=sc.nextInt();
		System.out.println("enter the temperature in Fahrenheit");
		int Fahrenheit=sc.nextInt();
		a1.Fahrenheit(Fahrenheit);
		a1.celsius(Celsius);
		
	}

}
