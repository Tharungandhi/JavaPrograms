
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
	 ******************************************************************************/package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the decimal number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		a1.convertBinary(num);
//		int [] binary=a1.convertBinary(num);
//		int length=binary.length;
//		for(int j = length-1;j >= 0;j--){
//			System.out.print(binary[j]);
	}

}
