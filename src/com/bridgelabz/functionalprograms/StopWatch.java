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
		System.out.println("click to start the watch");		//user defined
		long starttime=(long) Functionalprograms.readdouble(); //storing the value to ref variable
		Functionalprograms.startTime(starttime);   //method calling
		System.out.println("click to stop the watch");  //user defined
		long stoptime=(long) Functionalprograms.readdouble();//storing the value to ref variable
		Functionalprograms.stoptime(stoptime);   //mathod calling
		System.out.println("elapsed time in second is  "+Functionalprograms.getElapsedTime());
		
		

	}

}
