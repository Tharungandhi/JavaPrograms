/******************************************************************************
 *  Compilation:  javac -d bin SwapNibble.java
 *  Execution:    java -cp bin com.bridgelabz.util.SwapNibble n
 *  
 *  Purpose: Swap nibbles and find the new number.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.Functionalprograms;

public class SwapNibble {
	
	/*
	* The main function is written to take input from the user and
	* calls swapNibble function to find the result after swapping
	* nibbles
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		System.out.println("enter the Value of n"); 
		int x =Functionalprograms.readInteger();  
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		int c=Algorithmprograms.swapNibbles(x);   
		System.out.println(c);
		
		//Method 2- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		int[] d=Algorithmprograms.toNibbleBinary(c);  
		for(int j=7;j>=0;j--)
		{
			System.out.print(d[j]);
		}

		for (int i = 1; i < c; i++) {

			if (Math.pow(2, i) == c)
				flag =1;

		}
		if(flag==1)
			System.out.println("number is power of 2");

		else
			System.out.println("number is not a power of 2");




	}

}
