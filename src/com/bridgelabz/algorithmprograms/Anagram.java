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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("eneter the string1");//user input
		String str1=Algorithmprograms.readString();//storing the value to ref variable
		System.out.println("eneter the string2");//user input 
		String str2=Algorithmprograms.readString();//storing the value to ref variable
		Algorithmprograms.anagram(str1, str2);//method call
	}

}
