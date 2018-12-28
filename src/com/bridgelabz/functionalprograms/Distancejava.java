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
	/*
	* The main function is written to take input from the user and
	* call distance function that calculates the euclidean distance
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//Reading input number from the user
		System.out.println("enter the value of x"); 
		int x=Functionalprograms.readInteger();    
		System.out.println("enter the value of y");  
		int y=Functionalprograms.readInteger(); 

		//Method 1- using non-static function of FunctionalUtilty class
        //of com.bridgelabz.util package
		double result=Functionalprograms.distance(x, y);  
		System.out.println("eluclidian distance is "+ result);
		
		
		
	}

}