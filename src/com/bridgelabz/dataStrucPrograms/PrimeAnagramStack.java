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


