	/******************************************************************************
	 *  Compilation:  javac -d bin DayOFWeek.java
	 *  Execution:    java -cp bin com.bridgelabz.util.DayOFWeek n
	 *  
	 *  Purpose: Determines the day of the date.
	 *
	 *  @author  Tharun Kumar 
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.Algorithmprograms;

public class DayOFWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the date");//user input
		int date=Algorithmprograms.readInteger();//storing the value to ref variable
		System.out.println("enter the month");//user input
		int month=Algorithmprograms.readInteger();//storing the value to ref variable
		System.out.println("enter the year");//user input
		int year=Algorithmprograms.readInteger();//storing the value to ref variable
		Algorithmprograms.dayofWeek(date, month, year);//method calling
		
	}

}
