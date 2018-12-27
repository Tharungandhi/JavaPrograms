	/******************************************************************************
	 *  Compilation:  javac -d bin MergSort.java
	 *  Execution:    java -cp bin com.bridgelabz.util.MergSort n
	 *  
	 *  Purpose: MergSort.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class MergSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	        System.out.println("Merge sort");
	        int i;
	        System.out.println("Enter the size of your array"); //user input
	        int n=Algorithmprograms.readInteger(); //storing the value to ref variable
	        String arr[]=new String[n];
	        System.out.println("Enter the elements"); //user input

	        for( i=0;i<n;i++)
	        {   
	            arr[i]=Algorithmprograms.readString();  //storing the value to ref variable
	        }
	        Algorithmprograms.mergSort(arr,0,n);  //method calling
	        System.out.println("Elements after sorting");
	        for(i=0;i<n;i++)
	        {
	            System.out.println(arr[i]+"");
	        }

	    }

}
