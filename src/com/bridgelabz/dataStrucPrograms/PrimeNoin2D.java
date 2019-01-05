package com.bridgelabz.dataStrucPrograms;

import java.util.List;

import com.bridgelabz.util.Algorithmprograms;

import java.util.ArrayList;

public class PrimeNoin2D {

	public static void main(String[] args) {
		List<List<Integer>> outterlist = new ArrayList<List<Integer>>();
		List<Integer> innerlist= new ArrayList<Integer>();
		System.out.println("prime number of the range 0 to 1000");
		int m=2;
		int n=100;
		
		for(int i=1;i<=10;i++)
		{
		innerlist= Algorithmprograms.primeNumbers(m,n);
		outterlist.add(innerlist);
		System.out.print("prime no between "+ m +" and "+  n);
		System.out.println(innerlist);
		m+=100;
		n+=100;
		}
//		 List<Integer> list=new ArrayList<Integer>();
//		 
//			 for(int i=0;i<innerlist.size();i++)
//		 {
//		     System.out.println(innerlist);
//		}
	 

}}
