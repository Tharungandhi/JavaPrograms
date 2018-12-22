package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("value of n");
//		Scanner sc=new Scanner(System.in);
//		double n=sc.nextInt();
//		double k=Math.pow(2.0,n);
//		System.out.println("value="+k);
	      Functionalprograms f1=new Functionalprograms();
		    String i=args[0];
	        int exp=Integer.parseInt(i);
		    double base=2;
	        if(exp<0 || exp>30)
	        {
	            System.out.println("overflow values. Provide valid number");
	        }
	        else
	        f1.pow(base, exp);
	    }
	}


