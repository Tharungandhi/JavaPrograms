package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any Number:");
			int n=sc.nextInt();
			 int range=(int)(Math.pow(2,n));                //range calculation for the number
			System.out.println("Take number between '0' to "+(range-1));
			 int count=0;
			  String input1 = null;
			 int lower=0;
			 int upper=range;
			 int middle=(lower+upper/2);
			a1.findNumber(lower,upper,middle,count,input1,n);
		}
		 
}
