/******************************************************************************
 *  Compilation:  javac -d bin SimpleBalancedParentheses.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.SimpleBalancedParentheses n
 *  
 *  Purpose: Simple Balanced Parentheses
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.dataStrucPrograms;


import com.bridgelabz.util.DataStructurePrograms;

public class SimpleBalancedParentheses {
	/*
	* The main function is written to take input from the user and and 
	* call the isBalanced function that checks if the parantheses of 
	* the entered arithmetic expression
	*/
	@SuppressWarnings("unused")
	public static void  main(String[] args)  
	{
		System.out.println("Enter the experssion like (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
		String str = DataStructurePrograms.readString();
		char[] exp = str.toCharArray();
		boolean a1= DataStructurePrograms.simpleBalancedParentheses(exp);
		System.out.println(a1);
	}

}
