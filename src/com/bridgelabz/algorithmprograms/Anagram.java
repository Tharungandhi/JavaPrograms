package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
		System.out.println("eneter the string1");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("eneter the string2");
		String str2=sc.nextLine();
		a1.anagram(str1, str2);
	}

}
