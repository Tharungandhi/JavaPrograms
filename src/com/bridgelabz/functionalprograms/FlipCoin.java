/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin n
 *  
 *  Purpose:Computes the prime factorization of N using brute force.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.*;

public class FlipCoin {
	/*
	* The main function is written to take input from the user and
	* call distance function that calculates the euclidean distance
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do {
			//Reading input number from the user
		System.out.println("number of time to flip a coin" );//Reading input number from the user
		int times=Functionalprograms .readInteger(); 
		
		//Method 1- using static function of FunctionalUtilty class
        //of com.bridgelabz.util package
		Functionalprograms .flipCoin(times);   
		}while(i<5);
	}

}
