

package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprograms;

public class Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //Reading input number from the user
            System.out.println("value of n"); 
		    String i=args[0];
	        int exp=Integer.parseInt(i); //command line argument
		    double base=2;
	        if(exp<0 || exp>30)
	        {
	            System.out.println("overflow values. Provide valid number");
	        }
	        else
	        	
	        //Method 1- using static function of FunctionalUtilty class
	    	//of com.bridgelabz.util package
	        	Functionalprograms.pow(base, exp); 
	    }
	}


