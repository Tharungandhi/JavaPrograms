package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.Functionalprograms;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functionalprograms f1=new Functionalprograms();
		System.out.println("enter the no of rows");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("enter the no column");
		int column=sc.nextInt();
		System.out.println("1:Interger 2:Double 3:Boolean");
		 int choice=sc.nextInt();
		 
		switch(choice)
		{
		case 1:
		
			Integer[][]a1=f1.arrayInt(row,column);
			f1.display(a1);
			break;
		
		case 2:
		{
			Double[][]a2=f1.arrayDouble(row,column);
			f1.display(a2);
			break;
		}
		case 3:
		{
			Boolean[][]a3=f1.arrayBoolean(row,column);
					f1.display(a3);
			break;
		}
		default: System.out.println("set choice");
		break;
		
		}
		
		

}

	private static void Switch(int choice) {
		// TODO Auto-generated method stub
		
	}}
