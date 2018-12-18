package com.bridgelabz.util;

import java.util.Random;
import java.util.Scanner;

public class Functionalprograms {
	

	private static final int Count = 0;





	// replace
	
	public void replace(String str11)
	{
	
		
		if(str11.length()>3)
		{
		System.out.println("enter 3 letter string");
		}
		else
		{
		System.out.println("hi " +str11+ " how  are you" );
		}
		}
		
	
	
	//leap year
	
	public void leapyear(int i1)
	{
		while(lenght(i1)<=4)
		{
			
			if((i1%400==0)||(i1%4==0)&&(i1%100!=0))
			{
			System.out.println("year is leap year");
		
			}
		    else
	     	{
	       	System.out.println("year is not leap year");	
	     	}
			break;
		}
	}

	private int lenght(int i1) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
	
	
 
	//coin
      public void flipcoin(int rc)
    {
    	  
	int head=0;
	int tail=0;
	int i=rc;
	Random r=new Random();
	while(rc>0)
	{
		int rn=r.nextInt(2);
		if(rn==0)
		{
			head++;
	
	    }
		else
		{
			tail++;
		}
		rc--;
	}
		System.out.println("percentage of head" + head*100/i);
		System.out.println("percentage of tail" + tail*100/i);
	}




//harmonic


    public void harmonic(float s1)
   {
	
	float result=0;
	for(int i=0;i<=s1;i++)
	{
		result=result+1/s1;
		
	}
	
	
	System.out.println("result is"+result);	

   }
    
    
    //factorail
    
    
    public  void primeFactors(int n) 
    { 
        // Print the number of 2s that divide n 
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n); 
    } 
    
    
}