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

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class MergSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	        System.out.println("Merge sort");
	        int i;
	        System.out.println("Enter the size of your array");
	        int n=sc.nextInt();
	        String arr[]=new String[n];
	        System.out.println("Enter the elements");

	        for( i=0;i<n;i++)
	        {   
	            arr[i]=sc.next();
	        }
	        //String temparr[]=new String[n];
	        //int mid = low + (high - low) / 2;
	        Algorithmprograms a1= new Algorithmprograms();
	        a1.mergSort(arr,0,n);
	        System.out.println("Elements after sorting");
	        for(i=0;i<n;i++)
	        {
	            System.out.println(arr[i]+"");
	        }

	    }

}
