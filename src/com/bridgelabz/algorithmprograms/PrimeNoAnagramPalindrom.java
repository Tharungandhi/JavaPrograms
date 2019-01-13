/******************************************************************************
 *  Compilation:  javac -d bin AnagramPalindrom.java
 *  Execution:    java -cp bin com.bridgelabz.util.AnagramPalindrom n
 *  
 *  Purpose: Determines whether no is prime number and anagram and palindrom.
 *
 *  @author   Tharun Kumar M B
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.util.Algorithmprograms;

public class PrimeNoAnagramPalindrom {
	/*
	* The main function is written to take input from the user and
	* call the anagramPalindrom function that finds prime numbers 
	* that are anagram and palindrome
	*/

	public static void main(String[] args) {
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		System.out.println("The prime numbers between 0-1000 are");
		int num=Algorithmprograms.readInteger();//storing the value to ref variable
		List<String> primeList=new ArrayList<>();//declaration
		primeList=Algorithmprograms.findPrime(num);//method call

		//Method 2- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Set<String> primeAnagramSet=new HashSet<>();//declaration
		System.out.println("The prime numbers which are anagrams are");
		primeAnagramSet=Algorithmprograms.primeAnagram(primeList);//method call

		//Method 3- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		Set<String> primePalindromeSet=new HashSet<>();//Set declaration
		System.out.println("The prime numbers which are anagram and palindrome are");
		primePalindromeSet=Algorithmprograms.primePalindrome(primeAnagramSet);//method call
		System.out.println(primePalindromeSet);}}
