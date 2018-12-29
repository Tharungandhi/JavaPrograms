package com.bridgelabz.algorithmprograms;

public class Example {

	public static void main(String[] args) {
			    try {
			      int[] myNumbers = {1, 2, 3};
			      System.out.println(myNumbers[10]);
return;			    } catch (Exception e) {
			      System.out.println("Something went wrong.");
			      return;	    } finally {
			      System.out.println("The 'try catch' is finished.");
			    }
			  }
			}

