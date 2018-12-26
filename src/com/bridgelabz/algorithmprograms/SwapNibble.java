	/******************************************************************************
	 *  Compilation:  javac -d bin anagram.java
	 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
	 *  
	 *  Purpose: Determines whether no is anagram or not.
	 *
	 *  @author  BridgeLabz
	 *  @version 1.0
	 *  @since   06-08-2017
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.Functionalprograms;

public class SwapNibble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		System.out.println("enter the Value of n");
		int x =Functionalprograms.readInteger();
		int c=Algorithmprograms.swapNibbles(x);
		System.out.println(c);
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
