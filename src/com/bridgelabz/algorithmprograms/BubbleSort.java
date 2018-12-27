	/******************************************************************************
	 *  Compilation:  javac -d bin BubbleSort.java
	 *  Execution:    java -cp bin com.bridgelabz.util.BubbleSort n
	 *  
	 *  Purpose: BubbleSort.
	 *
	 *  @author  Tharun Kumar M B
	 *  @version 1.0
	 *  @since   10-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many numbers you want to insert");//user input
		int n=Algorithmprograms.readInteger();//storing the value to ref variable
		System.out.println("Enter the array elements");//user input
		int[] array=new int[n];//storing the value to ref variable
		
		Algorithmprograms.bubbleSort(n, array);//method calling
	}}
