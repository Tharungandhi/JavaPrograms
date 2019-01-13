/******************************************************************************
	 *  Compilation:  javac -d bin Array2D.java
	 *  Execution:    java -cp bin com.bridgelabz.util. Array2D n
	 *  
	 *  Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from
     *            standard input and printing them out to standard output.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Array2D {
	/*
	* The main function is written to take input from the user and
	* call displayArray function that displays array of any type
	*/

	public static void main(String[] args) {
		Functionalprograms<Object> func = new Functionalprograms<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input total row : ");
		//Reading the input from the user
		int row = sc.nextInt();
		System.out.print("Input total column : ");
		//Reading the input from the user
		int column = sc.nextInt();
		System.out.println("1:Integer Array\n" + "2:Double Array\n" + "3:Boolean Array");
		//Reading the input from the user
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
			Integer[][] arr1 = Functionalprograms.arrayInt(row, column);
			func.display(arr1,row,column);
			break;
		case 2:
			//Method 2- using static function of FunctionalUtilty class of com.bridgelabz.util package
			Double[][] arr2 = func.arrayDouble(row, column);
			func.display(arr2,row,column);
			break;
		case 3:
			//Method 3- using static function of FunctionalUtilty class of com.bridgelabz.util package
			Boolean[][] arr3 = Functionalprograms.arrayBoolean(row, column);
			func.display(arr3,row,column);
			break;
		default:
			System.out.println("Please select any option between 1, 2 and 3");
			break;
		}
		sc.close();

		// func.display(arr1,arr2,arr3,0 row, column);
}}
