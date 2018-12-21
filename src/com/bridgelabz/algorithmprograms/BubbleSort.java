package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the array");
		Scanner sc=new Scanner(System.in);
		double arr = (double) sc.nextDouble();
		System.out.println("Array Before Bubble Sort");

		 for(double i = 0; i < arr.length; i++) {
			    System.out.print(arr[i] + " ");
			  }
			  System.out.println();
			  a1.bubbleSort(arr);
			    System.out.println("Array After Bubble Sort");

			   for(int i = 0; i < arr.length; i++) {
			   System.out.print(arr[i] + " ");
			   }
			   }
	}

}
