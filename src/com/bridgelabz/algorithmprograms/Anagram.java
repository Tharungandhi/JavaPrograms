	/******************************************************************************
	 *  Compilation:  javac -d bin anagram.java
	 *  Execution:    java -cp bin com.bridgelabz.util.Anagram n
	 *  
	 *  Purpose: Determines whether no is anagram or not.
	 *
	 *  @author   Tharun Kumar M B
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class Anagram {
	/*
	* The main function is written to take input from the user and and 
	* call the isAnagram function that checks anagram of two strings
	*/

	public static void main(String[] args) {
		System.out.println("eneter the string1");
		String str1=Algorithmprograms.readString();
		str1=str1.toLowerCase();
		System.out.println("eneter the string2");
		String str2=Algorithmprograms.readString();
		str2=str2.toLowerCase();
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
	    boolean a1=	Algorithmprograms.isAnagram(str1, str2);
		if(!a1) {
		System.out.println("String is not a anagram");}
		else
			System.out.println("strings are anagram");}}
