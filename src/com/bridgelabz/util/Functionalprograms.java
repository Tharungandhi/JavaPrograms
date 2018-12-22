package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Functionalprograms<E> {

	private static final int Count = 0;

	// replace

	public void replace(String str,String uname) 
	{

		if (uname.length() < 3) {
			System.out.println("enter string letter which is greater then 3");
		} else 
		{
		// String str2 = str.replace("<<UserName>>",uname);
      System.out.println(str.replace("<<UserName>>",uname));
			
}
	}

	// leap year

	public void leapYear(int year) {
		while (String.valueOf(year).length() <= 4) {
     //to find leap year
			if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) // leap year formula
			{
				System.out.println("year is leap year");

			} else {
				System.out.println("year is not leap year");
			}
			break;
		}
	}

	// coin
	public static void flipCoin(int times) {

		int head = 0;
		int tail = 0;
		int i = times;
		Random r = new Random();
		    int rn = r.nextInt(2); //random variable to take 0,1
			if (rn == 0) {
				head++;

			} else {
				tail++;
			}
		System.out.println("percentage of head" + head * 100 / i);
		System.out.println("percentage of tail" + tail * 100 / i);
		
	}

	// harmonic

	public void harmonic(float s1) {

		float result = 0;
		for (int i = 0; i <= s1; i++) {
			result = result + 1 / s1;  //harmonic formula

		}

		System.out.println("result is" + result);

	}
	
	
	//2power
	  public void pow(double a, double b) {
	        double c = Math.pow(a, b);
	        System.out.println("value of 2 power " + b + " is " + c);
	    }



	// primenumber

	public void primeFactors(int n) {
		while (n % 2 == 0)   // to check that number is divisible by 2 
		{
			System.out.print(2 + " ");
			n /= 2;
		}

		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				System.out.print(i + " "); // number to print
				n /= i;
			}
		}
		if (n > 2) {
			System.out.println(n);
		}
	}

	// gambler

	public void gambler(int stake, int goal, int r) {

		int wins = 0;
		int loss = 0;
		for (int t = 0; t < r; t++) {
			int c = stake;
			while (c > 0 && c < goal) 
			{
				if (Math.random() < 0.5) {
					c++;
				} else {
					c--;
				}
			}
			if (c == goal) {
				wins++;
			} else {
				loss++;
			}
		}
		System.out.println(wins + " wins of " + r);
		System.out.println("Percent of games won= " + 100.0 * wins / r);
		System.out.println("Percent of loss = " + 100.0 * loss / r);
	}
	
	// coupon

	public int coupon(int n) {
		boolean[] isCollected = new boolean[n];

		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = (int) (Math.random() * n);
			{
				count++;
			}
			if (!isCollected[value]) {
				distinct++;
				System.out.println(distinct);
				isCollected[value] = true;
			}
		}
		return count;
	}

	// 2D Array

	public Integer[][] arrayInt(int row, int column) {
		Integer[][] genericArray = new Integer[row][column];
		int i, j = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = sc.nextInt();
			}
		}
		return genericArray;
	}

	//public void display(int[][] a1,double [][] a2, int row, int column) {

		//PrintWriter th = new PrintWriter(System.out, true);
		//int i, j = 0;
		//th.println("integer array");
		//for (i = 0; i < row; i++) {
			//for (j = 0; j < column; j++) {
				//th.print(a1[i][j] + " ");
			//}
			//th.println();

		//}
		//th.println("double array");
		//for (i = 0; i < row; i++) {
			//for (j = 0; j < column; j++) {
				//th.print(a2[i][j] + " ");
			//}
			//th.println();

		//}
	//}

	// 2darray for double
	public Double[][] arrayDouble(int row, int column) {
		Double[][] genericArray = new Double[row][column];
		int i, j = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = sc.nextDouble();
			}
		}
		return genericArray;
	}
	
	//generic function
	public void display(E[][] genericArray,int row,int column)
	{
		PrintWriter th=new PrintWriter(System.out,true);
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++)
			{
				th.print(genericArray[i][j]+" ");
			   
			}
			th.println();}
	}
	
	//boolean function
	public Boolean[][] arrayBoolean(int row,int column){
		Scanner sc=new Scanner(System.in);
		Boolean[][] genericArray=new Boolean[row][column];
		System.out.println("enter the bollean value");
		System.out.println("enter the value between 0 and 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = sc.nextBoolean();
			}	}
			return genericArray;
		}
	
	
	
	
	
	
	

	// Prints all triplets in arr[] with 0 sum

	public static void sumofthree(int[] arr, int n) {
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
					}
				}
			}
		}

		if (found == false)

		{
			System.out.println(" sum of 3 number is not equal to 0 ");
		}
	}

	//distance
	
	public double distance(int x,int y){
	
	{
		double result=Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
	
	return result;
	}
	
	}


  //Quadratic

public void quadratic(int a,int b,int c)
{
	    double   delta = b*b - 4*a*c;
		double	Root1  = Math.abs(-b + Math.sqrt(Math.abs(delta)))/(2*a);
		double	Root2 =Math.abs (-b - Math.sqrt(Math.abs(delta)))/(2*a);
		System.out.println("first root is "+ Root1);
		System.out.println("second root is "+Root2);
	
}
   

  //StopWatch
   Boolean running=false;
   long startTime;
   long stopTime;
   long elapsed;
   public void startTime(long starttime)
   {
	startTime=System.currentTimeMillis();
	System.out.println(startTime);
	 running=true;
   }

   public void stoptime(long stoptime)
   {
	   stopTime=System.currentTimeMillis();
	   System.out.println(stopTime);
	    running=false;
   }
    
   public long getElapsedTime()
   {
	    
	    if (running) {
	         elapsed = ((System.currentTimeMillis() - startTime)/1000);
	    }
	    else {
	        elapsed = ((stopTime - startTime)/1000);
	    }
		return elapsed;
	   }
   
   //WindSpeed
   
   public void windChill(double t,double s)
	   {
	   double w=35.74+.6215*t+(.4275*t-35.75)*Math.pow(s,0.16);
	   System.out.println("Effective temperature of windchill is"+ w);
	   
	   
   }
  //permutation
   
   public void permute(String Str,int len,int r)
   {
	   if (len == r) 
           System.out.println(Str); 
       else
       { 
           for (int i = len; i <= r; i++) 
           { 
               Str = swap(Str,len,i); 
               permute(Str, len+1, r); 
               Str = swap(Str,len,i); 
           } 
       } 
			   
		   }
	   public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i] ; 
	       charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    }
	   
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

   
   

