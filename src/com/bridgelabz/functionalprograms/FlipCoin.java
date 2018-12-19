package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

		Functionalprograms f1=new  Functionalprograms();
		System.out.println("number of time to flip a coin" );
		Scanner sc=new Scanner(System.in);
		int times=sc.nextInt();
		f1.flipCoin(times);
		
	}

}
