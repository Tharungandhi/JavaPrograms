	/******************************************************************************
	 *  Compilation:  javac -d bin Primeno.java
	 *  Execution:    java -cp bin com.bridgelabz.util.Primeno n
	 *  
	 *  Purpose:  To Determine the Prime numbers in that range
	 *
	 *  @author  Tharun Kumar 
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");  //user input
		int num=Algorithmprograms.readInteger();  //storing the value to ref variable
			for (long i=2;i<=num;i++)
			{
				boolean nu=Algorithmprograms.checkPrimeNo(i); //method calling
				if(nu==true)
					 System.out.println("prime numbers are " +i);
			}

	}}


