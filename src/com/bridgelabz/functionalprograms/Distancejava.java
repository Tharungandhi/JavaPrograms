package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Distancejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the value of x");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("enter the value of y");
		int y=sc.nextInt();
		double result=f1.distance(x, y);
		System.out.println("eluclidian distance is "+ result);
		
		
		
	}

}