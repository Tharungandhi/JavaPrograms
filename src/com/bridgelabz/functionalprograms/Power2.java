

package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("value of n"); //user input
		    String i=args[0];
	        int exp=Integer.parseInt(i); //command line argument
		    double base=2;
	        if(exp<0 || exp>30)
	        {
	            System.out.println("overflow values. Provide valid number");
	        }
	        else
	        	Functionalprograms.pow(base, exp);  //method calling
	    }
	}


