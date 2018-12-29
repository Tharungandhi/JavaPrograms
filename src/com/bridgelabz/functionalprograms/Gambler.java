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
	/*
	* The main function is written to take input from the user and
	* call gambler function that calculate win and lose percentage
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reading input number from the user
		System.out.println("enter the stake");  
       int stake=Functionalprograms.readInteger(); 
       System.out.println("enter the goal"); 
       int goal=Functionalprograms.readInteger(); 
       System.out.println("enter the trails"); 
       int r=Functionalprograms.readInteger();  
       //Method 1- using non-static function of FunctionalUtilty class
       //of com.bridgelabz.util package
       Functionalprograms.gambler(stake,goal,r); }}