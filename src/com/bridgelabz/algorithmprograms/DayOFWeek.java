package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class DayOFWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the date");
		Scanner sc= new Scanner(System.in);
		int date=sc.nextInt();
		System.out.println("enter the month");
		int month=sc.nextInt();
		System.out.println("enter the year");
		int year=sc.nextInt();
		a1.dayofWeek(date, month, year);
		
	}

}
