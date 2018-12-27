
/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.util.InsertionSort n
 *  
 *  Purpose: InsertionSort
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/package com.bridgelabz.algorithmprograms;

 import com.bridgelabz.util.Algorithmprograms;

 public class InsertionSort {

	 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.out.println("enter the number of string to be entered");//user input
		 int num=Algorithmprograms.readInteger();  //storing the value to ref variable
		 String[] str=new String[num];              //creating a string of num size
		 for(int i=0;i<str.length;i++)
		 {
			 System.out.println("enter "+(i+1)+" string");
			 str[i]=Algorithmprograms.readString();   //storing the value to ref variable
		 }
		 String[] str2=Algorithmprograms.insertionsortArray(str);   //calling a method storing in ref variable
		 int n=str.length;
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(str2[i]+" in the position " + i);
		 }

	 } 

 }


