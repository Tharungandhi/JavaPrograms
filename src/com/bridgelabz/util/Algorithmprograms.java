package com.bridgelabz.util;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

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
			return b.isProbablePrime(0);

		}
	}

	// BinaySearch for word

	//	public int binarySearchString(String [] names, String key) 
	//	{
	//    	int first = 0;
	//    	int last  = names.length;
	// 
	//    	while (first < last) {
	//        	int mid = (first + last) / 2;
	//        	if (key.compareTo(names[mid]) < 0) {
	//           			last = mid;
	//        	} else if (key.compareTo(names[mid]) > 0) {
	//            		first = mid + 1;
	//        	} else {
	//            		return mid;
	//        	}
	//    	}		
	//return -1;
	//	
	//	}

	//BubbleSort

	public void  bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;

		for(int i = 0; i < n; i++) {
			for(int j=1; j < (n-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}}}
	// vending Machine



	int i=0;
	int total=0;
	int[] notes = { 1000,500,100,50,10,5,2,1};
	int money;
	public  int calculate(int money,int[]notes )
	{
		int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+   "rs Notes are  " +calNotes );
			}
			i++;
			return calculate(money, notes);

		}
	}


	//   insertion

    public String[] sortArray(String str[])
    {
        String temp;
        for (int i = 0; i < str.length; i++) {
            for(int j = i+1 ; j <str.length; j++){
                if((str[i].compareTo(str[j]))>0){
                    temp = str[j];
                    str[j] = str[j-1];
                    str[j-1] = temp;
                }
            }
        }
        return str;
    }
	
	
	
	
	
}








