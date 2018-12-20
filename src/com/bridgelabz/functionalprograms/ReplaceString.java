package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.util.*;

public class ReplaceString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Functionalprograms f1=new  Functionalprograms();
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello (username here) How are you");
		String str="hello <<UserName>>, How are you";
		System.out.print("Enter the username ");
		String uname=sc.nextLine();
	f1.replace(str,uname);
		
		
	}

}
