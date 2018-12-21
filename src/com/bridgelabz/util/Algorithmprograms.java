package com.bridgelabz.util;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Algorithmprograms {

	public void anagram(String str1,String str2)
	{
		//int  len1=str1.length();
		//int len2=str2.length();
		int flag=1;
		char[]  ch1=str1.toUpperCase().toCharArray();
		char[] ch2=str2.toUpperCase().toCharArray();

		if(str1.length()!=str2.length())
		{ 
			System.out.println("enter the string of equal lenght");
		}


		Arrays.sort(ch1);
		Arrays.sort(ch2); 

		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
			{ 
				flag=1;
			}}
		if(flag==1)
			System.out.println("the string is anagram");
		else
			System.out.println("the string is not anagram");


	}	
// PrimeNo
	public boolean checkPrimeNo(long n)
	{
		{
			BigInteger b=new BigInteger(String.valueOf(n));
			return b.isProbablePrime(1);
			
		}
	}


}



