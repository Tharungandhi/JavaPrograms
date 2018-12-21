package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the money in Rs");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		int[] notes = { 2000,500,100,50,10,5,2,1};
		System.out.println("the different notes present is");
	    a1.calculate(money, notes);
		
		
	}

}
