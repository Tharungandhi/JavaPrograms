package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class SumOfThreeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the number of array element");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int []arr=new int[r];
		for(int i=0;i<r;i++)
		{
			System.out.println("enter "+i+" element of an array");
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		f1.sumOfThree(arr,n);
		

	}

}
