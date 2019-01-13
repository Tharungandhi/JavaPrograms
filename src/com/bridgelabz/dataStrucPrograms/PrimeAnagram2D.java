/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagram2D.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeAnagram2D n
 *  
 *  Purpose: 2D Array the numbers that are Anagram and numbers that are not 
 *  			Anagram
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStrucPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.DataStructurePrograms;

public class PrimeAnagram2D {

	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 that anagram and not anagram
	*/
	public static void main(String[] args) {
	    List<List<Integer>> totalprime = new ArrayList<List<Integer>>();
        List<Integer> primenumbers= new ArrayList<Integer>();
        Set<Integer> PrimeAnagram=new HashSet<Integer>();
        List<Integer> list= new ArrayList<Integer>();
        System.out.print("Prime numbers between 0 to 1000 are");
        primenumbers= Algorithmprograms.primeNumbers(0,1000);
     	System.out.println(primenumbers);
        PrimeAnagram=DataStructurePrograms.primeAnagram(primenumbers);
        System.out.print("The size of Prime number which are Anagram  is "+PrimeAnagram.size()+ " And the numbers are" );
        System.out.println(PrimeAnagram);
        list.addAll(PrimeAnagram);
        for(int j=0;j<list.size();j++) 
        {
           if (primenumbers.contains(list.get(j))) {
        	   primenumbers.remove(list.get(j));}
        }
        System.out.print("Total prime number which are not anagram is "+primenumbers.size() +" and the numbers are");
        System.out.print(primenumbers);
        totalprime.add(primenumbers);
    }
	
}
