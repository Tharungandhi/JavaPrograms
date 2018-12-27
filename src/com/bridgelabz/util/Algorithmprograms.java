/******************************************************************************
 *  Compilation:  javac -d bin Algorithmprograms.java
 *  Execution:    java -cp bin com.bridgelabz.util.Algorithmprograms n
 *  
 *  Purpose: To utilise the different methods present in  Algorithmprograms class
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Algorithmprograms {

	static Scanner scanner=new Scanner(System.in); //scanner class declaration
	       
	//method for scanner class of integer type 
	public static int readInteger() {
		  return scanner.nextInt();}
	
	//method for scanner class of double type 
	public static double readdouble() {
					return scanner.nextDouble();}
		
	//method for scanner class of String type 
	public static String readString() {
					return scanner.next();}
		
	
	// method for anagram  
	public static boolean anagram(String str1, String str2) {
		char[] ch1 = str1.toLowerCase().toCharArray();  //convertion of string1 to char array
		char[] ch2 = str2.toLowerCase().toCharArray();  //convertion of string2 to char array
		if (ch1.length != ch2.length) {
			return false;
		} else {
			Arrays.sort(ch1);   //sorting array
			Arrays.sort(ch2);   //sorting array
			//            for(int i=0;i<ch1.length;i++)
			//            {
			//                System.out.print(ch1[i]);
			//            }
			//            System.out.println();
			//            for(int i=0;i<ch2.length;i++)
			//            {
			//                System.out.print(ch2[i]);
			//            }
			//            for (int i = 0; i < ch1.length; i++) {
			//                if (ch1[i] == ch2[i]) {
			//                    return true;
			//                }
			str1 = String.valueOf(ch1); //ch1 value is converted to string str1
			str2 = String.valueOf(ch2); //ch2 value is converted to string str2
			boolean b = str1.equals(str2);
			{
				if (b == true)
					return true;
			}
		}
		return false;
	}


	// method to find PrimeNo
	
    public static boolean checkPrimeNo(long n)
	{
			BigInteger b=new BigInteger(String.valueOf(n)); //Returns the string representation of the long argument
			return b.isProbablePrime(1);
	}

	// Method to BinaySearch for word

	public static int binarySearchStr(String [] str,String key)
	{
		//int n=str.length;
		int first  = 0;
		int last   = str.length - 1;
		int middle = (first + last)/2;

		while( first <= last )
		{
			if ( str[middle].compareTo(key)<0 )   //middle<key
				first = middle + 1;    
			else if ( str[middle].compareTo(key)==0 ) //middle==key
			{
				return middle;
			}
			else
				last = middle - 1;
			middle = (first + last)/2;
		}
		return -1;
	}
   // Method to Sort the String
	public static String []  sort(String [] str)
	{
		int len=str.length;
		for (int i = 0; i < len; i++){
			for (int j = i+1; j < len; j++) {
				if (str[i].compareTo(str[j])>0) {  //comparing two string 
					String temp;
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}}}
		return str;}

	
	//Method for BubbleSort
	public static void  bubbleSort1(int[] arr) {   
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

	static int i=0;        //static variable declaration
	static int total=0;
	static int money;
	public static  int calculate(int money,int[]notes )  //vending machine method
	{
		int rem;
		if(money==0)
			return -1 ;
		else{
			if(money>=notes[i])
			{
				int calNotes =money/notes[i];   //to find number of notes 
				rem = money%notes[i];           //reducing the money
				money =rem;           
				total += calNotes;              //storing in total   
				System.out.println(notes[i]+   "rs Notes are  " +calNotes );
			}
			i++;
			return calculate(money, notes);     //returning the method 
		}}


	//   Method for insertion Sort
   public static String[] insertionsortArray(String str[])
	{
		int n1 = str.length; 
		for (int i=1; i<n1; i++) 
		{ 
			String key = str[i]; 
			int j = i-1; 
			while (j>=0 && str[j] .compareTo(key)>0) //str>key 
			{ 
				str[j+1] = str[j]; 
				j = j-1; 
			} 
			str[j+1] = key; 
		} 
		return str;
	}


	// Method for  Temperature 
   //Method for Celsius to Fahrenheit
	public static int celsius(int Celsius)
	{
		int F=(Celsius*9/5) + 32; //Celsius to Fahrenheit  
		System.out.println("temperature from Celsius to Fahrenheit is"+ F);
		return F;
	}
    //Method for Fahrenheit to Celsius
	public static int Fahrenheit(int Fahrenheit)
	{
		int C=(Fahrenheit-32) *5/9;  //Fahrenheit to Celsius
		System.out.println("temperature from Fahrenheit to Celsius is "+C);
		return C;
	}
	

	// method for monthly Payement
	public static int monthlyPayment(double p,double n,double r)
	{
		// double	y=12*n;
		double R=r/(12*100); //percent interest compounded monthly
		double payment=p*R/1-Math.pow(1+R,-n);  //formula for payment 
		System.out.println("total payement is "+ payment);
		return (int) payment;
	}
	
	
	// Method for square root of a non negative number
	public static int newtonMethod(double c)
	{
		double t=c;
		double epsilon = 1e-15;  //declaration of epsilon
		if (t>0) {
			while(Math.abs(t-c/t) > epsilon*t)  //condition
			{
				t=((c/t)+t)/2;  //replace t with the average of c/t and t

			}System.out.println("squareroot of a number is "+t);
		}
		else
			System.out.println("enter positive number");
		return (int) t;
	}

	// Method to find DayOfWeek
	public static String dayofWeek(int date,int month,int year)
	{
		int year1= year-(14-month)/12;             //formula for year between 0000 and 9999
		int x = year1+(year1/4)-(year1/100)+year1/400;  //formula for leap year
		int	month1 = month+12*((14-month)/12)-2;    //formula for month between 1 and 12
		int date1= (date+x+31*month1/12)%7;         //formula for date between 1 and 31
		String str []= {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Sunday"}; // declaring string str
		for(int i=0;i<str.length;i++)
		{
			if(i==date1)  
				System.out.println("the day is"+str[i]);
		}
		return str[i];
	}


	// method to convert decimal to Binary
	public static int[] convertBinary(int num){
		 int binary[] = new int[32];   //declaring int to int array
		int i = 0;
		while(num > 0){
			binary[i] = num%2;
			num = num/2;
			i++;}
		//	int [] binary=a1.convertBinary(num);
		int length=binary.length;
		for(int j = length-1;j >= 0;j--){
			System.out.print(binary[j]);}
		return binary;
	}


	//Method for bubble sort
	public  static int[] bubbleSort(int n,int[]array)
	{  

		for(int  i=0;i<n;i++)
		{
			array[i]=Algorithmprograms.readInteger();
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
		return array;



	}

	//FindNumber

	static int range,count,lower,upper,middle;

	public  static int findNumber(int lower,int upper,int middle,int count,String input1,int n)
	{
		@SuppressWarnings("resource")
		Scanner rc=new Scanner(System.in);
		System.out.println("Is your number:"+middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input1=rc.nextLine();
		do
		{
			if (input1.equals("high"))
			{
				lower= middle;
				count++;
				//Algorithmprograms.findNumber(lower,upper,middle,count,input1,n);
			}
			else if (input1.equals("yes"))
			{
				System.out.println("The number you thought was: "+middle);
				int no=count+1;
				System.out.println("It takes "+no+" times to find your exact number");
				break;
			}

			else if(input1.equals("low"))
			{
				upper=middle;
				count++;
				//Algorithmprograms.findNumber(lower,upper,middle,count,input1,n);
			}
			if(count<n)
			{
				middle=(lower+ upper+1)/2;
				System.out.println("Is your number "+middle+":");
				input1=rc.nextLine();
			}
		}
		while(lower<=upper);
		if (count>n)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.exit(0);
		}
		return middle;
	}
	//binarySearch of word

	public static int binarySearch(String [] str,String key)
	{
		//int n=str.length;
		int first  = 0;
		int last   = str.length - 1;
		int middle = (first + last)/2;

		while( first <= last )
		{
			if ( str[middle].compareTo(key)<0 )
				first = middle + 1;    
			else if ( str[middle].equalsIgnoreCase(key) )
			{
				return middle;
			}
			else
				last = middle - 1;

			middle = (first + last)/2;
		}
		return -1;
	}

	//mergsort

	public static int mergSort(String arr[],int low,int high)
	{
		int n=high-low;
		if(n<=1)
			return 0;
		int mid=low+n/2;
		mergSort(arr,low,mid);
		mergSort(arr,mid,high);
		String[] temparr=new String[n];
		int i=low,j=mid;
		for(int k=0;k<n;k++)
		{
			if(i==mid)
				temparr[k]=arr[j++];
			else if(j==high)
				temparr[k]=arr[i++];
			else if(arr[j].compareToIgnoreCase(arr[i])<0)
				temparr[k]=arr[j++];
			else
				temparr[k]=arr[i++];
		}

		for(int k=0;k<n;k++)
		{
			arr[low +k]=temparr[k];
		}
		return middle;
	} 

	//SwapNibble

	public static int swapNibbles(int x)
	{
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

	public static int[] toNibbleBinary(int n) {
		int i=0;
		int binary[]=new int[100];
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}

		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);

		}
		return binary;
	}

	//binarySearch Int
	public static  int binarySearchInt(int arr[], int l, int r, int x) 
	{ 
		if ( r>= l) { 
			int mid = l + (r - l) / 2; 

			// If the element is present at the 
			// middle itself 
			if (arr[mid] == x) 
				return mid; 

			// If element is smaller than mid, then 
			// it can only be present in left subarray 
			if (arr[mid] > x) 
				return binarySearchInt(arr, l, mid - 1, x); 

			// Else the element can only be present 
			// in right subarray 
			return binarySearchInt(arr, mid + 1, r, x); 
		} 
		// We reach here when element is not present 
		// in array 
		return -1; 
	} 


	public static int[]  sortint(int arr[])
	{
		int len=arr.length;
		for (int i = 0; i < len; i++){
			for (int j = i+1; j < len; j++) {
				if (arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;

	}

	//insertion Sort

	public static int[] insertionSortInteger(int arr[])
	{
		int n1 = arr.length; 
		for (int i=1; i<n1; i++) 
		{ 
			int key = arr[i]; 
			int j = i-1; 
			while (j>=0 && arr[j]>=(key)) 
			{ 
				arr[j+1] = arr[j]; 
				j = j-1; 
			} 
			arr[j+1] = key; 
		} 
		return arr;
	}

	//bubble sort for integer
	public static int[] bubbleSortInteger(int array[])
	{
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
		return array;
	}

	// bubble Sort for String

	public static String[] bubbleSortString(String str[])
	{
		for(i=0;i<str.length-1;i++)
		{
			for( int j=1;j<str.length-i;j++)
			{
				if(str[j-1].compareTo(str[j])>0)
				{
					String temp=str[j-1];
					str[j-1]=str[j];
					str[j]=temp;
				}
			}
		}
		return str;
	}

	//angram for primeno

	public static List<String> findPrime(int num) {
		int flag=1;
		int i;
		List<String> arr=new ArrayList<>();
	//	int count=0;

		for( i=2;i<=num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				arr.add(String.valueOf(i));
			}
		}
		System.out.println(arr);
		return arr;
	}

	// anagram

	public static Set<String> primeAnagram(List<String> primeList) {
		Set<String> primeAnagramSet=new HashSet<>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(Algorithmprograms.anagram(primeList.get(i), primeList.get(j)))
				{
					//                    primeAnagramList.add(Integer.toString(i));
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i)+"    "+primeList.get(j) );
				}
			}
		}

		return primeAnagramSet;

	}

	//palindrom

	public static Set<String> primePalindrome(Set<String> primeAnagramSet)
	{
		java.util.Iterator<String> iter = primeAnagramSet.iterator();
		Set<String> resultSet=new HashSet<>();

		String a;
		while (iter.hasNext())
		{
			a=(String) iter.next();
			int a1=Integer.parseInt(a);
			int lk=reverse(a1);

			if(primeAnagramSet.contains(Integer.toString(lk)))

			{
				String b=Integer.toString(lk);
				resultSet.add(b);
			}


		}
		return resultSet;
	}


	public static int reverse(int n)
	{

		int reverse=0;
		while(n!=0)
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		return reverse;
	}




}


