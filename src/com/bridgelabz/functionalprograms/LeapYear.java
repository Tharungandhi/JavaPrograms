/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear n
 *  
 *  Purpose:Leap Year.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the year"); //user input 
		int i1=Functionalprograms.readInteger();//storing the value to ref variable
		Functionalprograms.leapYear(i1);//method calling
	}

}
