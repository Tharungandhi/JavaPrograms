/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramStack.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeAnagramStack n
 *  
 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 � 1000 in 
 *  			a Stack using the Linked List and Print the Anagrams in the 
 *  			Reverse Order.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   5-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.dataStrucPrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.Stack;

public class PrimeAnagramStack {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using stack
	*/
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		List<Integer> primenumber = new ArrayList<Integer>();
	        primenumber = Algorithmprograms.primeNumbers(0,1000); 
	        stack =  DataStructurePrograms.primeAnagram1(primenumber); 
	        System.out.println(stack.size()+" is the size of the stack");
	    	System.out.println("Printing the elements in reverse order using pop function of stack");
	    	while(!stack.isEmpty())
	    	{
	    		System.out.println(stack.pop()+" "+stack.pop());
	    	}
	    }

	}


