package com.bridgelabz.util;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithmprograms {
	//anagram
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
			if(ch1[i]!=ch2[i])
			{ 
				flag=1;
			}}
		if(flag==1)
			System.out.println("the string is not anagram");
		else
			System.out.println("the string is anagram");


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



	static int i=0;
	static int total=0;
	static int money;
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

	public String[] insertionsortArray(String str[])
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
	// Temperature 

	public void celsius(int Celsius)
	{
		int F=(Celsius*9/5) + 32;
		System.out.println("temperature from Celsius to Fahrenheit is"+ F);
	}

	public void Fahrenheit(int Fahrenheit)
	{
		int C=(Fahrenheit-32) *5/9;
		System.out.println("temperature from Fahrenheit to Celsius is "+C);
	}

	//Payement

	public void monthlyPayment(double p,double n,double r)
	{
		double	y=12*n;
		double R=r/(12*100);
		double payement=p*R/1-Math.pow(1+R,-n);
		System.out.println("total payement is "+ payement);
	}
	// NewtonMethod
	public void newtonMethod(double c)
	{
		double t=c;
		double epsilon = 1e-15;
		if (t>0) {
			while(Math.abs(t-c/t) > epsilon*t)
			{
				t=((c/t)+t)/2;
				
			}System.out.println("squareroot of a number is "+t);
		}
		else
			System.out.println("enter positive number");
	}

	// DayOfWeek
	public void dayofWeek(int date,int month,int year)
	{
		//		if(date>0 || date<31)
		//		{ if(month>0 ||month<12)
		//		{if(year>0000 || year>9999)
		//			{
		int year1= year-(14-month)/12;
		int x = year1+(year1/4)-(year1/100)+year1/400;
		int	month1 = month+12*((14-month)/12)-2;
		int date1= (date+x+31*month1/12)%7;
		//			}
		String str []= {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Sunday"};
		for(int i=0;i<str.length;i++)
		{
			if(i==date1)  
				System.out.println("the day is"+str[i]);
		}
	}


	//toBinary
	
	public void convertBinary(int num){
		int binary[] = new int[100];
		int i = 0;
		while(num > 0){
			binary[i] = num%2;
			num = num/2;
			i++;}
		for(int j = i-1;j >= 0;j--){
			System.out.print(binary[j]);
		}
	}


	//bubble sort
	public void bubbleSort()
    {  
        Scanner s=new Scanner(System.in);
        System.out.println("How many numbers you want to insert");
        int n=s.nextInt();
        System.out.println("Enter the integer numbers for the array");
        int[] array=new int[n];
        int i;
        for( i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }   
        System.out.println("the original array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        for(i=0;i<array.length-1;i++)
        {
            for( int j=1;j<array.length-i;j++)
            {
                if(array[j-1]>array[j])
                {
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Sorted array list is:");
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }



    }


	
	

}












