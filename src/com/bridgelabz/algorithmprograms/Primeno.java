package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

			for (long i=2;i<=num;i++)
			{
				boolean nu=a1.checkPrimeNo(i);
				if(nu==true)
					System.out.println(i);
			}}


	}


