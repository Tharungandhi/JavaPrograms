package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functionalprograms f1=new Functionalprograms();
		System.out.println("Number to find the prime factor");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		f1.primeFactors(n);
	}

}
