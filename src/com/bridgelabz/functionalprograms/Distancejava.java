/******************************************************************************
 *  Compilation:  javac -d bin Distancejava.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distancejava n
 *  
 *  Purpose:Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Distancejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the value of x"); //user input
		int x=Functionalprograms.readInteger();    //storing the value to ref variable
		System.out.println("enter the value of y");  //user input
		int y=Functionalprograms.readInteger();   //storing the value to ref variable
		double result=Functionalprograms.distance(x, y);  //storing the value to ref variable
		System.out.println("eluclidian distance is "+ result);
		
		
		
	}

}