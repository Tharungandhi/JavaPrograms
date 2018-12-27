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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do {
		System.out.println("number of time to flip a coin" );//user input
		int times=Functionalprograms .readInteger(); //storing the value to ref variable
		Functionalprograms .flipCoin(times);   //method calling 
		}while(i<5);
	}

}
