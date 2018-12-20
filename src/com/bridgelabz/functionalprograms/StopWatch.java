package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionalprograms f1=new Functionalprograms();
		System.out.println("click to start the watch");
		Scanner sc=new Scanner(System.in);
		long starttime=sc.nextLong();
		f1.startTime(starttime);
		System.out.println("click to stop the watch");
		long stoptime=sc.nextLong();
		f1.stoptime(stoptime);
		System.out.println("elapsed time in second is  "+f1.getElapsedTime());
		
		

	}

}
