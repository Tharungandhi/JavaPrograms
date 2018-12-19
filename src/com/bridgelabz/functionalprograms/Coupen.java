package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Coupen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the n distinct coupen");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=f1.coupon(n);
		f1.coupon(n);
		System.out.println(count);
		
	}
	
	
	
}


