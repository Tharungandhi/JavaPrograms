/******************************************************************************
 *  Compilation:  javac -d bin SumOfThreeInt .java
 *  Execution:    java -cp bin com.bridgelabz.util.SumOfThreeInt  n
 *  
 *  Purpose:Sum of three Integer adds to ZERO.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class SumOfThreeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of array element"); //user input
		int r=Functionalprograms.readInteger(); //storing the value to ref variable
		int []arr=new int[r];  //storing the element in array
		for(int i=0;i<r;i++)
		{
			System.out.println("enter "+i+" element of an array"); //user input
			arr[i]=Functionalprograms.readInteger();  //storing the value to ref variable
		}
		int n=arr.length;
		Functionalprograms.sumOfThree(arr,n);  //method calling
		

	}

}
