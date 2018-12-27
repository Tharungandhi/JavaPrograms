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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the n distinct coupen"); //user input
		int n=Functionalprograms.readInteger(); //storing the value to ref variable
		int count=Functionalprograms.coupon(n); //storing the value to ref variable
		System.out.println(count);
		
	}
	
	
	
}


