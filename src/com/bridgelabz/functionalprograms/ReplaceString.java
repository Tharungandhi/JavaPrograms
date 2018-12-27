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

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello (username here) How are you"); //user input 
		String str="hello <<UserName>>, How are you";  //string declare
		System.out.print("Enter the username ");  //user input
		String uname=Functionalprograms.readString();  //storing the value to ref variable
		Functionalprograms.replace(str,uname);  //method calling
		
		
	}

}
