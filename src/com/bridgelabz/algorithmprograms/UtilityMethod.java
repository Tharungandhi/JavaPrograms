	/******************************************************************************
	 *  Compilation:  javac -d bin anagram.java
	 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
	 *  
	 *  Purpose: Determines whether no is anagram or not.
	 *
	 *  @author  BridgeLabz
	 *  @version 1.0
	 *  @since   06-08-2017
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.Functionalprograms;

public class UtilityMethod {

	public static void main(String[] args) {
		// binary search
		System.out.println("1:binarySearch   2:insertionSort for 3:bubbleSort ");
		int choice=Algorithmprograms.readInteger();
		switch(choice) {
		case 1:{
			
			System.out.println("1:binarySearch in integer 2:binarySearch in String ");
			int choice1=Algorithmprograms.readInteger();
			switch(choice1) {
			case 1:
			{
				System.out.println("enter the array length");
				int len= Algorithmprograms.readInteger();
				System.out.println("enter the array element");
				int arr[]=new int[len];
				for(int i=0;i<len;i++)
					arr[i]= Algorithmprograms.readInteger();
				System.out.println("enter the key element");
				int key= Algorithmprograms.readInteger();
				int r = arr.length; 
				long startTime=System.nanoTime();
				Algorithmprograms.sortint(arr);
				int l=0;
				int result=Algorithmprograms.binarySearchInt(arr, l, r, key);
				long stopTime=System.nanoTime();
				if(result==-1)
					System.out.println("the element not found");
				else
					System.out.println("the element is in the index"+result);

				long elapsedTime=stopTime-startTime;
				System.out.println("the elapsed time is "+elapsedTime);
				break;
			}
			//binarySearch for String
			case 2:
			{
				System.out.println("enter the string length");
				int len=Algorithmprograms.readInteger();
				System.out.println("enter the string element ");
				String str[]= new String[len];
				for(int i=0;i<len;i++)
					str[i]=Algorithmprograms.readString();
				System.out.println("enter the key string");
				String key=Algorithmprograms.readString();
				long startTime=System.nanoTime();
				Algorithmprograms.sort(str);
				int result=Algorithmprograms.binarySearchStr(str, key);
				long stopTime=System.nanoTime();
				if(result==-1)
					System.out.println("the element not found");
				else
					System.out.println("the element is in the index"+result);
				long elapsedTime=stopTime-startTime;
				System.out.println("the elapsed time is "+elapsedTime);
				break;
			}}}

		case 2:
		{
			System.out.println("1:insertionSort for integer 2: insertionSort for String");
			//insertion Sort int
			int choice2=Algorithmprograms.readInteger();
			switch(choice2) {
			case 1:{
				System.out.println("enter the array length");
				int len=Algorithmprograms.readInteger();
				System.out.println("enter the Array element");
				int arr[]=new int[len];
				for(int i=0;i<len;i++)
				{
					System.out.println("enter "+(i+1)+" element");
					arr[i]= Algorithmprograms.readInteger();
				}
				long startTime=System.nanoTime();
				int[] arr2= Algorithmprograms.insertionSortInteger(arr);
				long stopTime=System.nanoTime();
				int n=len;
				for(int i=0;i<n;i++)
					System.out.println(arr[i]+" in the position " + i);
				long elapsedTime=stopTime-startTime;
				System.out.println("the elapsed time is "+elapsedTime);
			}
			//insertion Sort string
			case 2:
			{
				System.out.println("enter the string length");
				int num=Algorithmprograms.readInteger();
				String[] str=new String[num];
				for(int i=0;i<str.length;i++)
				{
					System.out.println("enter "+(i+1)+" string");
					str[i]=Algorithmprograms.readString();
				}
				long startTime=System.nanoTime();
				String[] str2=Algorithmprograms.insertionsortArray(str);
				long stopTime=System.nanoTime();
				int n=str.length;
				for(int i=0;i<n;i++) {
					System.out.println(str2[i]+" in the position " + i); }			
				long elapsedTime=stopTime-startTime;
				System.out.println("the elapsed time is "+elapsedTime);
			}}}
		case 3:{
			System.out.println("1:bubbleSort for integer 2:bubbleSort for String");
			int choice3=Algorithmprograms.readInteger();
			switch(choice3){
			//bubble Sort
			
			case 1:
			{
				System.out.println("How many numbers you want to insert");
				int n=Algorithmprograms.readInteger();
				System.out.println("Enter the integer numbers for the array");
				int[] array=new int[n];
				int i;
				for( i=0;i<n;i++)
					array[i]=Algorithmprograms.readInteger();  
				System.out.println("the original array is:");
				for(i=0;i<n;i++) {
					System.out.println(array[i]);
				}long startTime=System.nanoTime();
				Algorithmprograms.bubbleSortInteger(array);
				long stopTime=System.nanoTime();
				System.out.println("Sorted array list is:");
				for(i=0;i<n;i++)
					System.out.println(array[i]);					
				long elapsedTime=stopTime-startTime;
				System.out.println("the elapsed time is "+elapsedTime);
			}

			case 2:
			{

				System.out.println("How many String you want to insert");
				int n=Algorithmprograms.readInteger();
				System.out.println("Enter the Strings ");
				String[] str=new String[n];
				int i;
				for( i=0;i<n;i++)
					str[i]=Algorithmprograms.readString();  
				System.out.println("the original array is:");
				for(i=0;i<n;i++) {
					System.out.println(str[i]);}
				long startTime=System.nanoTime();
				Algorithmprograms.bubbleSortString(str);
				long stopTime=System.nanoTime();
				System.out.println("Sorted array list is:");
				for(i=0;i<n;i++)
					System.out.println(str[i]);
				long elapsedTime=stopTime-startTime;
				System.out.println("the elapsed time is "+elapsedTime);
			}}

		}}}}