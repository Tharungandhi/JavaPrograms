package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithmprograms a1= new Algorithmprograms();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of string to be entered");
        int num=sc.nextInt();
        String[] str=new String[num];
        for(int i=0;i<str.length;i++)
        {
            System.out.println("enter "+(i+1)+" string");
            str[i]=sc.next();
        }
        String[] str2=a1.insertionsortArray(str);
        int n=str.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(str2[i]+" in the position " + i);
        }

        } 

	}


