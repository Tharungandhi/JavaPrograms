package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the money to be drawed");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		//System.out.println("enter the amount customer gaven");
		//int cust=sc.nextInt();
		//int money= cust-bill;
		int[] notes = { 2000,500,100,50,10,5,2,1};
		System.out.println("the remaining change should be given to customer is ");
	    a1.calculate(money, notes);
		
		
	}

}
