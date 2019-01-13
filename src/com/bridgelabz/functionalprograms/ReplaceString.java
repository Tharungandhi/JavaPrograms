/******************************************************************************
 *  Compilation:  javac -d bin ReplaceString .java
 *  Execution:    java -cp bin com.bridgelabz.util.ReplaceString  n
 *  
 *  Purpose:User Input and Replace String Template “Hello <<UserName>>, How are you?”.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.*;

public class ReplaceString {
	/*
	* The main function is written to take input from the user and
	* call replaceString function that replaces the template with user
	* input
	*/
	public static void main(String[] args) {
		//Reading input number from the user
		String str="hello <<UserName>>, How are you";  
		System.out.print("Enter the username ");  
		String uname=Functionalprograms.readString(); 	
		 //Method 1- using static function of FunctionalUtilty class
	     //of com.bridgelabz.util package
		 String str1=Functionalprograms.replace(str,uname);
		 System.out.println(str1);}}
