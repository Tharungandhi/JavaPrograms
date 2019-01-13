
/******************************************************************************
 *  Compilation:  javac -d bin PalindromeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PalindromeChecker n
 *  
 *  Purpose: A palindrome is a string that reads the same forward and backward.
 *  		 	To construct an algorithm to input a string of characters and 
 *  			check whether it is a palindrome.
 *
 *  @author  Tharun kumar
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStrucPrograms;

import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.Deque;

public class Palindrome­Checker {
	/*
	* The main function is to read the input from the user
	* and checking whether the entered string is palindrome 
	* or not
	*/
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Deque<Comparable> deque=new Deque<Comparable>(100);
	  System.out.println("enter the String to check Palindrome­ or not ");
	  String string=DataStructurePrograms.readString();
	  for(int i=0;i<string.length();i++)
		{
			char cha =string.charAt(i);
			deque.addRear(cha);
		}
		int flag=0;

		while(deque.size()>1)
		{
			if(deque.removeFront()!=deque.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
}
	}


