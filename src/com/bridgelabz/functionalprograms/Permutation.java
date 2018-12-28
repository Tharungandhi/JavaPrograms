/******************************************************************************
 *  Compilation:  javac -d bin Permutation .java
 *  Execution:    java -cp bin com.bridgelabz.util.Permutation  n
 *  
 *  Purpose:Leap Year.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reading input number from the user
		System.out.println("enter the string");
		String str=Functionalprograms.readString(); 
		int n = str.length(); 
		
		//Method 1- using static function of FunctionalUtilty class
	    //of com.bridgelabz.util package
		Functionalprograms.permute(str, 0, n-1); 
	    } 
	}


