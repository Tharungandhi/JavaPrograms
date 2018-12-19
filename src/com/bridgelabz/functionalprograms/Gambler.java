package com.bridgelabz.functionalprograms;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import com.bridgelabz.util.Functionalprograms;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the stake");
       Scanner sc=new Scanner(System.in);
       int stake=sc.nextInt();
       System.out.println("enter the goal");
       int goal=sc.nextInt();
       System.out.println("enter the trails");
       int r=sc.nextInt();
	f1.gambler(stake,goal,r);
	}
	

}
