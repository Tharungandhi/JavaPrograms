/******************************************************************************
 *  Compilation:  javac -d bin Functionalprograms.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms n
 *  
 *  Purpose: To utilise the different methods present in Functionalprograms class
 *
 *  @author  Tharun Kumar 
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Functionalprograms<E> {

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


	// replace
	/**
	 * static function that is used to replace a string in a given template
	 * 
	 * @param str the string template whose substring is to be replaced
	 * 			  with the another string
	 * @param uname the string with which the string in the template
	 * 		  is replaced
	 * @return string the string template that is modified.
	 */
	public static String replace(String str,String uname) 
	{	if (uname.length() < 3)
			System.out.println("enter string letter which is greater then 3");
		else {
			String message;
			final String REGEX_NAME="<<UserName>>";
			Pattern p = Pattern.compile(REGEX_NAME);
			Matcher m = p.matcher(str);
			message = m.replaceAll(uname);
			return message;}
		return uname;
	}

	// leap year
	/**
	 *  static function to check if the given year is a leap year or not
	 * 
	 * @param year the year to be checked whether it is a leap year or not
	 * @return true if leap year else false
	 */
	public static void leapYear(int year) {
		while (String.valueOf(year).length() <= 4) {
			//to find leap year
			if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) // leap year formula
				System.out.println("year is leap year");
				else 
				System.out.println("year is not leap year");
			break;
		}}

	// coin
	/**
	 * static function to find the head vs tail percentage after 
	 * flipping the coin n times
	 * 
	 * @param n the number of times to flip a coin
	 */
	public static void flipCoin(int times) {
		int head = 0;
		int tail = 0;
		int i = times;
		Random r = new Random();
		int rn = r.nextInt(2); //random variable to take 0,1
		if (rn == 0)
			head++;
			else 
			tail++;
		System.out.println("percentage of head" + head * 100 / i);
		System.out.println("percentage of tail" + tail * 100 / i);
      }

	// harmonic
	/**
	 * static function to print the harmonic value of the float value 
	 * @param n
	 * @return
	 */

	public static float harmonic(float s1) {
		float result = 0;
		for (int i = 0; i <= s1; i++) 
			result = result + 1 / s1;  //harmonic formula
		System.out.println("result is" + result);
		return result;}


	//2power
	/**
	 * static function to print all the values of the 2 power of N
	 * 
	 * @param n the number that is taken to the power of 2
	 */
	public static double pow(double a, double b) {
		double c = Math.pow(a, b);
		System.out.println("value of 2 power " + b + " is " + c);
		return c;
	}



	// primenumber
	/**
	 * 
	 * @param n the number whose prime factors are to be found
	 */
	public static int primeFactors(int n) {
		while (n % 2 == 0)   // to check that number is divisible by 2 
		{
			System.out.print(2 + " ");
			n /= 2;
		}
		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				System.out.print(i + " "); // number to print
				n /= i;
			}}
		if (n > 2) 
			System.out.println(n);
		return n;}

	// gambler
	/**
	 * static function to gamble 
	 * 
	 * @param stake the amount that is at stake
	 * @param goal the amount to be obtained
	 * @param no_of_times the number of times gambled
	 */
	public static void gambler(int stake, int goal, int r) {
		int wins = 0;
		int loss = 0;
		for (int t = 0; t < r; t++) {
			int c = stake;
			while (c > 0 && c < goal) 
			{
				if (Math.random() < 0.5)
					c++;
					else 
					c--;
			}
			if (c == goal) 
				wins++;
				else 
				loss++;}
		System.out.println(wins + " wins of " + r);
		System.out.println("Percent of games won= " + 100.0 * wins / r);
		System.out.println("Percent of loss = " + 100.0 * loss / r);
	}

	// coupon
	/**
	 * static function to generate distinct coupon numbers
	 * 
	 * @param num the number of coupon numbers to be generated
	 * @return the count of random numbers of generated to obtain 
	 * 			distinct coupon numbers
	 */
	public static int coupon(int n) {
		boolean[] isCollected = new boolean[n];

		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = (int) (Math.random() * n);
				count++;
			if (!isCollected[value]) {
				distinct++;
				System.out.println(distinct);
				isCollected[value] = true;
			}}
		return count;}

	// 2D Array
	/**
	 * static function that returns a generic array of integer type
	 * @param row
	 * @param column
	 * @return
	 */
	public  static Integer[][] arrayInt(int row, int column) {
		Integer[][] genericArray = new Integer[row][column];
		int i, j = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = sc.nextInt();
			}}
		return genericArray;}

	// 2darray for double
	/**
	 * static function that returns a generic array of double type
	 * @param row
	 * @param column
	 * @return
	 */
	public  Double[][] arrayDouble(int row, int column) {
		Double[][] genericArray = new Double[row][column];
		int i, j = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = sc.nextDouble();
			}}
		return genericArray;}
	
	//boolean function
	/**
	 * static function that returns a generic array of boolean type
	 * @param row
	 * @param column
	 * @return
	 */
	
		public static Boolean[][] arrayBoolean(int row,int column){
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			Boolean[][] genericArray=new Boolean[row][column];
			System.out.println("enter the bollean value");
			System.out.println("enter the value between 0 and 1");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.println("row[" + i + "]column[" + j + "]");
					genericArray[i][j] = sc.nextBoolean();
				}	}
			return genericArray;}
	//generic function
	/**
	 * static function that prints the array of generic type
	 * 
	 * @param genericArray array of any data type 
	 */
	public void display(E[][] genericArray,int row,int column)
	{
		PrintWriter th=new PrintWriter(System.out,true);
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++)
				th.print(genericArray[i][j]+" ");
			th.println();}}

	// Prints all triplets in arr[] with 0 sum
	/**
	 * static function to obtain triplet integers that gives 0 upon addition
	 * 
	 * @param num the number of integers in an array
	 */
	public static void sumOfThree(int[] arr, int n) {
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						found = true;
					}}}}

		if (found == false)
			System.out.println(" sum of 3 number is not equal to 0 ");
	}

	//distance
	/**
	 * static function that calculates the distance between the
	 * two points (x,y)
	 * 
	 * @param x the integer that represents a point
	 * @param y the integer that represents a point 
	 * @return distance the distance between the two points
	 */
	public static double distance(int x,int y){{
			double result=Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
			return result;}}


	//Quadratic
	/**
	 * static function that is used to find the roots of a 
	 * given quadratic equation 
	 * 
	 * @param a the number of x*x
	 * @param b the number of x
	 * @param c the constant of the equation
	 */
	public static void quadratic(int a,int b,int c){
		double   delta = b*b - 4*a*c;
		double	Root1  = Math.abs(-b + Math.sqrt(Math.abs(delta)))/(2*a);
		double	Root2 =Math.abs (-b - Math.sqrt(Math.abs(delta)))/(2*a);
		System.out.println("first root is "+ Root1);
		System.out.println("second root is "+Root2);}


	//StopWatch
	/**
	 * static function to program a stop watch 
	 * 
	 * @param start_end the boolean value to stop or start the watch
	 * @param end the integer value to end the watch when started
	 */
	static Boolean running=false;
	static long startTime;
	static long stopTime;
	static long elapsed;
	public static void startTime(long starttime){
		startTime=System.currentTimeMillis();
		System.out.println(startTime);
		running=true;}

	public static void stoptime(long stoptime){
		stopTime=System.currentTimeMillis();
		System.out.println(stopTime);
		running=false;}

	public static long getElapsedTime(){
		if (running) 
			elapsed = ((System.currentTimeMillis() - startTime)/1000);
		else 
			elapsed = ((stopTime - startTime)/1000);
		return elapsed;}

	//WindSpeed
	/**
	 * static function that calculates the efficient temperature 
	 * 
	 * @param temp the temperature
	 * @param wind_speed the speed of the wind
	 * @return efficient temperature calculated
	 */
	public static double  windChill(double t,double s)
	{
		double w=35.74+.6215*t+(.4275*t-35.75)*Math.pow(s,0.16);
		System.out.println("Effective temperature of windchill is"+ w);
		return w;


	}
	//permutation
	
	/**
     * static method is used to possible recursion we can do it for a string
     * @param str string value
     * @param initial first element
     * @param last element
     * @param array list
     * @return array list
     */
    public static List<String> recursionPermutation(String str, int initial, int last,List<String> arr) {
       
        if (initial == last) {
            arr.add(str);
        } else {
            for (int i = initial; i < last; i++) {
                str = swap(str, initial, i);
                recursionPermutation(str, (initial + 1), last,arr);}
        }
        return arr;
    }
    public static String swap(String a, int i, int j) { 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); }

	   /**
     * static method is used to possible iterations we can do it for a string
     * @param s is the string value
     * @return arr array of string
     */
    public static List<String> iterationPermutation(String str) {
        List<String> arr = new ArrayList<>();
        arr.add(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            for (int j = arr.size() - 1; j >= 0; j--) {
                String s = arr.remove(j);
                for (int k = 0; k <= s.length(); k++) {
                    arr.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }
        return arr;
    }
   
    /**
     * static method is used to sort the array list
     * @param arr is arraylist
     * @return arraylist
     */
    public static List<String> listSort(List<String> arr)
    {
        Collections.sort(arr);
        return arr;
    }
    
    
    public static void compareString(List<String> arr2,List<String> arr1) {
    int flag=1;
    for(int i=0;i<arr2.size();i++)
    {
        if(arr2.get(i).compareTo(arr1.get(i))==0)
            flag=1;
        else
            flag=0;
    }
    if(flag==1)
    System.out.println("arrays returned by two string functions are equal");
    else
    System.out.println("arre not same");
}
    

 // tic tack toe
 	/**
 	 * static data member of boolean type is used
 	 */
 	static boolean isEmpty = true;
 	/**
 	 * @param BOARD
 	 */
 	public static void initialBoard(int [][] BOARD) {
 		System.out.println("CROSS GAME\nComputer is o     &     Player  is x ");
 		for (int i = 0; i < BOARD.length; i++) {
 			for (int j = 0; j < BOARD[i].length; j++) {
 				BOARD[i][j] = -6;
 			}
 		}
 		System.out.println("Demo board is this :");
 		displayBoard(BOARD);
 	}
 	/**
 	 * @param BOARD
 	 */
 	public static void displayBoard(int [][] BOARD) {
 		int count = 0;
 		for (int i = 0; i < BOARD.length; i++) {
 			System.out.println("-----------------");
 			System.out.print("||");
 			for (int j = 0; j < BOARD[i].length; j++) {
 				if (BOARD[i][j] == 0) {
 					count++;
 					System.out.print(" o ||");
 				} else if (BOARD[i][j] == 1) {
 					count++;
 					System.out.print(" x ||");
 				} else
 					System.out.print("   ||");
 			}
 			System.out.println(" ");
 		}
 		if (count == 9) {
 			isEmpty = false;
 		}
 		System.out.println("-----------------");
 	}
 	/**
 	 * @param player
 	 * @param BOARD
 	 * @return
 	 */
 	public static boolean checkWinner(int player,int [][] BOARD) {
 		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
 				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
 				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
 				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
 				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
 				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
 				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
 				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
 	}
 	/**
 	 * @param player
 	 * @param BOARD
 	 */
 	public static void putVal(int player,int [][] BOARD) {
 		try {
 		int i=0;
 		int j=0;
 		if (player % 2 == 1) {
 			i = (int) (Math.random() * 10) % 3;
 			j = (int) (Math.random() * 10) % 3;
 		} else {
 			@SuppressWarnings("resource")
 			Scanner s = new Scanner(System.in);
 			System.out.println("enter value of row and column by space");
 			if(i<=2 && j<=2)
 			{
 			i = s.nextInt();
 			j = s.nextInt();
 			}
 			else
 			{
 				System.out.println("choose according to board matrix ");
 			}
 		}
 		if (BOARD[i][j] == -6) {
 			if (player % 2 == 0) {
 				BOARD[i][j] = 0;
 			} else {
 				BOARD[i][j] = 1;
 				System.out.println("Coumputer Choosing " + i + " th row & " + j+" th column ");
 			}
 		} else
 			putVal(player,BOARD);
 		}
 		catch(Exception e){
 			System.out.println("Please choose according to board matrix");
 			putVal(player,BOARD);
 		}

 }
	}



























