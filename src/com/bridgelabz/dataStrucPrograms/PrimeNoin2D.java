/******************************************************************************
 *  Compilation:  javac -d bin PrimeNoin2D.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeNoin2D n
 *  
 *  Purpose: Store the prime numbers in a 2D Array, the first dimension 
 *  represents the range 0�100,100�200, and so on. While the second dimension 
 *  represents the prime numbers in that range
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStrucPrograms;

import java.util.List;

import com.bridgelabz.util.Algorithmprograms;

import java.util.ArrayList;

public class PrimeNoin2D {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000
	*/
	public static void main(String[] args) {
		List<List<Integer>> outterlist = new ArrayList<List<Integer>>();
		List<Integer> innerlist= new ArrayList<Integer>();
		System.out.println("prime number of the range 0 to 1000");
		int m=2;
		int n=100;
		
		for(int i=1;i<=10;i++)
		{
		innerlist= Algorithmprograms.primeNumbers(m,n);
		outterlist.add(innerlist);
		System.out.print("prime no between "+ m +" and "+  n);
		System.out.println(innerlist);
		m+=100;
		n+=100;
		}
}}
