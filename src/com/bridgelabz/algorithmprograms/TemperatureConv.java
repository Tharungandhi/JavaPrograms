package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class TemperatureConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("enter the temperature in celsius");
		Scanner sc=new Scanner(System.in);
		int Celsius=sc.nextInt();
		System.out.println("enter the temperature in Fahrenheit");
		int Fahrenheit=sc.nextInt();
		a1.Fahrenheit(Fahrenheit);
		a1.celsius(Celsius);
		
	}

}
