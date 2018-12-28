/******************************************************************************
 *  Compilation:  javac -d bin Coupen.java
 *  Execution:    java -cp bin com.bridgelabz.util.Coupen n
 *  
 *  Purpose:Given N distinct Coupon Numbers, how many random numbers do you
        need to generate distinct coupon number
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Coupen {

	/*
	* The main function is written to take input from the user and
	* calls couponNumber function that generates distinct coupon
	*  numbers
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the n distinct coupen"); 
		int n=Functionalprograms.readInteger(); 
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		int count=Functionalprograms.coupon(n); 
		System.out.println(count);
		
	}
	
	
	
}


