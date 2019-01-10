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
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Algorithmprograms {

	/**
	 * static object is created for Scanner class to avoid
	 * multiple object creations of the same class.
	 */
	static Scanner scanner=new Scanner(System.in); //scanner class declaration

	//method for scanner class of integer type 
	/**
	 * static function to read integers input from the user
	 * @return integer values that are read
	 */
	public static int readInteger() {
		return scanner.nextInt();}

	//method for scanner class of double type 
	/**
	 * static function to read double input from the user
	 * @return double values that are read
	 */
	public static double readdouble() {
		return scanner.nextDouble();}

	//method for scanner class of String type 
	/**
	 * static function to read string input from the user
	 * @return strings that are read
	 */
	public static String readString() {
		return scanner.next();}
	

	/**
	 * static function to read boolean input from the user
	 * @return boolean values that are read
	 */
	public static boolean userBoolean(){
			return scanner.nextBoolean();}
	


	// method for anagram  
	/**
	 *Static function to check if the two strings are anagram or not.
	 * 
	 * @param str1 the string to be checked for anagram
	 * @param str2 the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            //int wordLength = FunctionalUtility.readInteger();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }
	// Method to BinaySearch for word
	/**
	 * static function that search for the given key in a array using 
	 * binary search algorithm
	 * 
	 * @param array the array of integers or strings from which key is to
	 * 				be found
	 * @param key the key to be searched in the array
	 * @return index the index of the key, found in the array
	 */
	public static int binarySearchStr(String [] str,String key)
	{
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
	/**
	 * 
	 * @param notes the array of possible notes in integers
	 * @param amt the amount that you need change for
	 * @return integer the minimum changes needed for the amount entered
	 */
	public static  int calculate(int money,int[]notes )  //vending machine method
	{
	     int i=0;        //static variable declaration
		 int rem;
		if(money==0)
			return -1 ;
		else{
			if(money>=notes[i])
			{
				int numberofNotes =money/notes[i];   //to find number of notes 
				rem = money%notes[i];           //reducing the money
				money =rem;           
				System.out.println(notes[i]+   "rs Notes are  " +numberofNotes );
			}
			i++;
			return calculate(money, notes);     //returning the method 
		}}


	//   Method for insertion Sort
	/**
	 * static function to sort the given array of strings using insertion sort
	 * 
	 * @param array the array of strings that is to be sorted 
	 * @param num the number of strings to be sorted
	 * @return array the array of strings that are sorted
	 */
	public static String[] insertionsortArray(String str[])
	{
		int n1 = str.length; 
		for (int i=1; i<n1; i++) 
		{ 
			String key = str[i]; 
			int j = i-1; 
			//Since the contents of the array are strings, we
			//use compareTo function of the String class to 
            //compare the strings
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
	/**
	 * static function that converts given temperature from celcius to fahrenheit 
	 * and vice versa
	 * 
	 * @param choice the choice to which temperature the user wants to convert to
	 * @param temp the temperature to be converted
	 * @return temperature that is converted
	 */
	public static double temperatureConversion(int choice,double temp) {
		double f_temp,c_temp;
		switch(choice){
		case 1: System.out.println("Your input is in celcius so your fahrenheit temp is:");
		f_temp=(temp*(9/5))+32;
		return f_temp;

		case 2: System.out.println("Your input is in fahrenheit then your celcius temp is:");
		c_temp=(temp-32)*(5/9);
		return c_temp;

		default: return 0;
		}
	}
	
	//prime numbers
	/**
	 *static function to print the prime numbers for the given range
	 * 
	 * @param num the integer that represents the range
	 * @return list of integers that are prime numbers between the range
	 */
	    public static List<String> findPrime(int num) {
	        int flag = 1;
	        int i;
	        List<String> arr = new ArrayList<>();
//	        int count = 0;
	        for ( i = 2; i <= num; i++) {
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    flag = 0;
	                    break;
	                } else
	                    flag = 1;
	            }
	            if (flag == 1) {
	                arr.add(String.valueOf(i));
	            }
	        }
	        System.out.println(arr);
			return arr;
	       
	    }

	// method for monthly Payement
	    /**
		 * static function that calculates the monthly payment
		 * 
		 * @param principle the principle amount taken loan 
		 * @param year the years to pay off
		 * @param rate the interest rate 
		 * @return monthly payment 
		 */
	public static int monthlyPayment(double p,double n,double r){
		double R=r/(12*100); //percent interest compounded monthly
		double payment=p*R/1-Math.pow(1+R,-n);  //formula for payment 
		System.out.println("total payement is "+ payment);
		return (int) payment;}


	// Method for square root of a non negative number
	/**
	 * static function that calculates the square root of a given number
	 * 
	 * @param num the number whose square root is to be found
	 */
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
	/**
	 * static function that finds the day of the week provided date 
	 * 
	 * @param month the numeric representation the of month
	 * @param date the numeric representation the of date
	 * @param year the numeric representation the of year
	 * @return integer the numeric representation of the day 
	 */
	static int i=0;
	public static String dayofWeek(int date,int month,int year){
		int year1= year-(14-month)/12;             //formula for year between 0000 and 9999
		int x = year1+(year1/4)-(year1/100)+year1/400;  //formula for leap year
		int	month1 = month+12*((14-month)/12)-2;    //formula for month between 1 and 12
		int date1= (date+x+31*month1/12)%7;         //formula for date between 1 and 31
		String str []= {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Sunday"}; // declaring string str
		for(int i=0;i<str.length;i++)	{
			if(i==date1)  
				System.out.println("the day is "+str[i]);}
		return str[i];}


	// method to convert decimal to Binary
	/**
	 * static function that converts decimal to binary 
	 * 
	 * @param num the number that is to be converted to binary
	 * @return array the array of integers that contains binary bits of the number
	 */
	public static int[] convertBinary(int num){
		int binary[] = new int[32];   //declaring int to int array
		int i = 0;
		while(num > 0){
			binary[i] = num%2;
			num = num/2;
			i++;}
		int length=binary.length;
		for(int j = length-1;j >= 0;j--){
			System.out.print(binary[j]);}
		return binary;
	}


	//Method for bubble sort
	/**
	 * static function to sort the array using bubble sort algorithm
	 * 
	 * @param array the array of integers that is to be sorted
	 * @param n the number of integers in the array
	 * @return integer array the array that is sorted
	 */
	public  static int[] bubbleSort(int n,int[]array)
	{  

		for(int  i=0;i<n;i++)
		{
			array[i]=Algorithmprograms.readInteger();
		}   
		System.out.println("the original array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		//iterating through the whole array and swapping the adjacent 
		//elements only if the former one is greater than latter one
		for(int i=0;i<array.length-1;i++)
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
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		return array;



	}

	//FindNumber
	/**
	 * static function that finds the number N that is guessed between the 
	 * range of numbers such that the range is 2 to the power of N 
	 * 
	 * @param low the lower bound among the range of the numbers 
	 * @param high the upper bound among the range of the numbers
	 * @return number the number that is guessed among the range of numbers
	 */

	static int range,count,lower,upper,middle;

	public static void findNumber(int first, int last, int middle, int count, int num) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("is your number " + middle);
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		String temp = readString();
		do {
			if (temp.equals("low")) {
				last = middle - 1;
				count++;
				middle = (first + last) / 2;
				findNumber(first, last, middle, count, num);

			} else if (temp.equals("high")) {
				first = middle + 1;
				count++;
				middle = (first + last) / 2;
				findNumber(first, last, middle, count, num);
			} else {
				System.out.println("your number is " + middle);
				System.out.println("Total number of times it took to find your number is " + (count + 1));
				break;
			}
			break;
		} while (first < last);

	}
		
	//binarySearch of word
  
	public static int binarySearchFile(String [] str,String key)
	{
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
	/**
	 * static function that sorts the array of strings by dividing the
	 * array into sub arrays 
	 * 
	 * @param array the array of strings that are needed to be sorted
	 * @param low the lower bound of the array 
	 * @param mid the mid index of the array
	 * @param high the higher bound of the array
	 */
	public static int mergSort(String arr[],int low,int high){
		int n=high-low;
		if(n<=1)
			return 0;
		int mid=low+n/2;
		mergSort(arr,low,mid);
		mergSort(arr,mid,high);
		String[] temparr=new String[n];
		int i=low,j=mid;
		for(int k=0;k<n;k++){
			if(i==mid)
				temparr[k]=arr[j++];
			else if(j==high)
				temparr[k]=arr[i++];
			else if(arr[j].compareToIgnoreCase(arr[i])<0)
				temparr[k]=arr[j++];
			else
				temparr[k]=arr[i++];}

		for(int k=0;k<n;k++)
			arr[low +k]=temparr[k];
		return middle;} 

	//SwapNibble
	
	/**
	 * static function that used to swap nibble of a byte
	 * 
	 * @param number number to be swapped
	 * @return integer integer that is swapped
	 */

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

	/**
	 * static function that search for the given key in a array using 
	 * binary search algorithm
	 * 
	 * @param array the array of integers or strings from which key is to
	 * 				be found
	 * @param key the key to be searched in the array
	 * @return index the index of the key, found in the array
	 */
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
	
	/**
	 * static function that is used to sort the array
	 * 
	 * @param array the array that is needed to be sorted
	 */

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

	/**
	 * static function that sorts the given array using insertion sort
	 * 
	 * @param array the array of integers  that is to be sorted
	 * @param num the number of integers to be sorted
	 */

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
	/**
	 * static function to sort the array using bubble sort algorithm
	 * 
	 * @param array the array of integers that is to be sorted
	 * @param n the number of integers in the array
	 * @return integer array the array that is sorted
	 */
	public static int[] bubbleSortInteger(int array[])
	{
		for(int i=0;i<array.length-1;i++)
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
	/**
	 * static function that sorts the given array using bubble sort algorithm
	 * 
	 * @param array the array of strings to be sorted
	 */

	public static String[] bubbleSortString(String str[])
	{
		for(int i=0;i<str.length-1;i++)
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

	// primeno

	/**
	 *static function to print the prime numbers for the given range
	 * 
	 * @param m the integer that represents the lower bound of the range
	 * @param n the integer that represents the upper bound of the range
	 * @return list of integers that are prime numbers between the range
	 */
	public static List<Integer> primeNumbers(int m,int n) {
		List<Integer> lst=new ArrayList<Integer>();
		int temp;

		//swapping of bounds if the given lower bound is greater than upper bound
		if(m>n) {
			temp=m;
			m=n;
			n=temp;}
		int flag=1;
		//try all the possible values from lower bound to upper bound
		//if the number has the factor then it must be checked within lower bound
		for(int i=m;i<=n;i++){
			for(int j=2;j<i;j++){
				//If the number is divisible by any of the number then 
				//initializing flag to zero and break
				//else flag is initialized to one
				if(i%j==0){
					flag=0;
					break;}
				else
					flag=1;}
			//If the number is prime which is indicated by the flag,
			//then adds the number into an ArrayList.
			if(flag==1)
				lst.add(i);}
		return lst;}
	
	
	// anagram
	/**
	 * static function that is used to add prime numbers that are
	 * anagram 
	 * 
	 * @param new_lst the list of prime numbers 
	 * @return set of prime numbers that are anagram
	 */ 
	public static Set<String> primeAnagram(List<String> primeList) {
		Set<String> primeAnagramSet=new HashSet<>();
		for(int i=0;i<primeList.size();i++) {
			for(int j=i+1;j<primeList.size();j++){
				if(Algorithmprograms.isAnagram(primeList.get(i), primeList.get(j))) {
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i)+"    "+primeList.get(j) ); }}}
		return primeAnagramSet;}

	//palindrom
	/**
	 * static function that is used to add prime numbers that are 
	 * anagram and palindrom
	 * 
	 * @param set the set of prime numbers that are anagram
	 * @return set the set of prime numbers that are anagram and palindrom
	 */
	public static Set<String> primePalindrome(Set<String> primeAnagramSet){
		java.util.Iterator<String> iter = primeAnagramSet.iterator();
		Set<String> resultSet=new HashSet<>();
		String a;
		while (iter.hasNext()){
			a=(String) iter.next();
			int a1=Integer.parseInt(a);
			int lk=reverse(a1);
			if(primeAnagramSet.contains(Integer.toString(lk))) {
				String b=Integer.toString(lk);
				resultSet.add(b);		}}
		return resultSet;}


	public static int reverse(int n){
		int reverse=0;
		while(n!=0){
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;}
		return reverse;}
	
	
	
	
	//mapping method 
	public static Map<String,Double> mapCall(Map<String,Double> map){
		Map<String ,Double> sortMap=new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEachOrdered(x -> sortMap.put(x.getKey(), x.getValue()));
		return sortMap;}

	
	}
	