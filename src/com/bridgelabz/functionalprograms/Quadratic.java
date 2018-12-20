package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the value of a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the value of c");
		int c=sc.nextInt();
		f1.quadratic(a,b,c);
		
		

	}

}
