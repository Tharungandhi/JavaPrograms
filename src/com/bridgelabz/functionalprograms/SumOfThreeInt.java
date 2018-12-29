/******************************************************************************
 *  Compilation:  javac -d bin SumOfThreeInt .java
 *  Execution:    java -cp bin com.bridgelabz.util.SumOfThreeInt  n
 *  
 *  Purpose:Sum of three Integer adds to ZERO.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class SumOfThreeInt {
	/*
	* The main function is written to take input from the user and
	* call sumZero function that counts the 
	* number of triples that sum to exactly 0.
	*/

	public static void main(String[] args) {
		//Reading input from the user
		System.out.println("enter the number of array element"); 
		int r=Functionalprograms.readInteger(); 
		int []arr=new int[r];  
		for(int i=0;i<r;i++){
			System.out.println("enter "+i+" element of an array"); 
			arr[i]=Functionalprograms.readInteger();}
		int n=arr.length;
		//Method 1- using static function of FunctionalUtilty class
    	//of com.bridgelabz.util package
		Functionalprograms.sumOfThree(arr,n); }}
