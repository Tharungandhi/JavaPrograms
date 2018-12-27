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
		System.out.println("enter the string");//user input
		String str=Functionalprograms.readString(); //storing the value to ref variable
		int n = str.length(); 
		Functionalprograms.permute(str, 0, n-1); //method calling
	    } 
	}


