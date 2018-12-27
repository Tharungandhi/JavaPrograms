/******************************************************************************
	 *  Compilation:  javac -d bin Array2D.java
	 *  Execution:    java -cp bin com.bridgelabz.util. Array2D n
	 *  
	 *  Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from
     *            standard input and printing them out to standard output.
	 *
	 *  @author  Tharun Kumar
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionalprograms<Object> f1=new Functionalprograms<Object>();
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=Functionalprograms.readInteger();
		System.out.println("enter the no column");
		int column=Functionalprograms.readInteger();
		System.out.println("1:Interger 2:Double 3:Boolean");
		 int choice=Functionalprograms.readInteger();
		 
		switch(choice)
		{
		case 1:
		
			Integer[][]a1=f1.arrayInt(row,column);
			f1.display(a1,row,column);
			break;
		
		case 2:
		{
			Double[][]a2=f1.arrayDouble(row,column);
			f1.display(a2,row,column);
			break;
		}
		case 3:
		{
			Boolean[][]a3=f1.arrayBoolean(row,column);
					f1.display(a3,row,column);
			break;
		}
		default: System.out.println("set choice");
		break;
		
		}
		
		

}

}
