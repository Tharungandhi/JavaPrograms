package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class MergSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int high=0;
        int low = 0;
        String  arr[]=new String[n];
        System.out.println("enter the array element");
     for(int i=0;i<n;i++)
     {
    	arr[i]=sc.next();
     }
     Algorithmprograms a1= new Algorithmprograms();
     a1.mergSort(arr, low, high);
     
     for(int i=0;i<n;i++)
     {
    	 System.out.println(arr[i]+"");
     }
	}

}
