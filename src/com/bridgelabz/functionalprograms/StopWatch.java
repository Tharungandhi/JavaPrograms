/******************************************************************************
 *  Compilation:  javac -d bin StopWatch .java
 *  Execution:    java -cp bin com.bridgelabz.util.StopWatch  n
 *  
 *  Purpose:Simulate Stopwatch Program.
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/ 
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reading input from the user
		System.out.println("click to start the watch");		
		long starttime=(long) Functionalprograms.readdouble();
		//Method 1- using static function of FunctionalUtilty class
    	//of com.bridgelabz.util package
		Functionalprograms.startTime(starttime); 
		//Reading input from the user
		System.out.println("click to stop the watch");  
		long stoptime=(long) Functionalprograms.readdouble();
		//Method 2- using static function of FunctionalUtilty class
    	//of com.bridgelabz.util package
		Functionalprograms.stoptime(stoptime);   
		System.out.println("elapsed time in second is  "+Functionalprograms.getElapsedTime());
		}}
