/******************************************************************************
 *  Compilation:  javac -d bin WindChill .java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill  n
 *  
 *  Purpose:WindChill to defines the effective temperature.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class WindChill {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter the temperature");//user input 
		double t=Functionalprograms.readdouble();  //storing the value to ref variable
		System.out.println("enter the wind speed"); //user input
		double s=Functionalprograms.readdouble(); //storing the value to ref variable
		if(t<50 && s<120||s>3)
			Functionalprograms.windChill(t,s); //method calling
		else
			System.out.println("enter the valid temperature and speed");

	}

}
