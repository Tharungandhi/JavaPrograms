/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin com.bridgelabz.util.Gambler n
 *  
 *  Purpose:Simulates a gambler who start with $stake and place fair $1 bets until
 *       he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
 *       times he/she wins and the number of bets he/she makes
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the stake");  //user input
       int stake=Functionalprograms.readInteger(); //storing the value to ref variable
       System.out.println("enter the goal"); //user input
       int goal=Functionalprograms.readInteger(); //storing the value to ref variable
       System.out.println("enter the trails"); //user input
       int r=Functionalprograms.readInteger(); //storing the value to ref variable
       Functionalprograms.gambler(stake,goal,r); //method calling
	}
	

}
