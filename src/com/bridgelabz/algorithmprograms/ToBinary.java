
	/******************************************************************************
	 *  Compilation:  javac -d bin ToBinary.java
	 *  Execution:    java -cp bin com.bridgelabz.util.ToBinary n
	 *  
	 *  Purpose: Decimal to Binary.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the decimal number"); //user input 
		int num=Algorithmprograms.readInteger(); //storing the value to ref variable
		Algorithmprograms.convertBinary(num);  //method calling
	}

}
