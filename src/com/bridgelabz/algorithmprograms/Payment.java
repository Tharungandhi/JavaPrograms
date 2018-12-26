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

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the principle amount");
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		System.out.println("enter the rate");
		double r=sc.nextDouble();
		System.out.println("enter the no of year");
		double n=sc.nextDouble();
		a1.monthlyPayment(p, n, r);
	}

}
