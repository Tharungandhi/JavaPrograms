package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n = str.length(); 
	    f1.permute(str, 0, n-1); 
	    } 
	}


