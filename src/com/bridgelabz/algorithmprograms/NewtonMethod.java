package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class NewtonMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		double c=sc.nextDouble();
		a1.newtonMethod(c);
		
	}

}
