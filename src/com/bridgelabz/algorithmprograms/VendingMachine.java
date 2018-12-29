	/******************************************************************************
	 *  Compilation:  javac -d bin VendingMachine.java
	 *  Execution:    java -cp bin com.bridgelabz.util. VendingMachine n
	 *  
	 *  Purpose: calculate the minimum number of Notes as well as the Notes to be returned 
	 *  by the Vending Machine as a Change.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class VendingMachine {
	
	/*
	* The main function is written to take input from the user and
	* call the vendingMachine function that finds the fewest notes 
	* to be returned to the vending machine
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the money to be drawed"); 
		int money=Algorithmprograms.readInteger();  
		int[] notes = { 2000,500,100,50,10,5,2,1}; //declaring different notes in array
		System.out.println("the remaining change should be given to customer is "); 
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Algorithmprograms.calculate(money, notes);  }}
