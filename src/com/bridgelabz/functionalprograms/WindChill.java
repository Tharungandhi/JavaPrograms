package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class WindChill {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the temperature");
		Scanner sc=new Scanner(System.in);
		double t=sc.nextDouble();
		System.out.println("enter the wind speed");
		double s=sc.nextDouble();
		if(t<50 && s<120||s>3)
		{
		f1.windChill(t,s);
		}
		else
		{
			System.out.println("enter the valid temperature and speed");
		}

	}

}
