package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the decimal number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		a1.convertBinary(num);
	}

}
