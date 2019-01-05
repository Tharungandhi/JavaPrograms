package com.bridgelabz.dataStrucPrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.Queue;

public class PrimeAnagramQueue {

	public static void main(String[] args) {
		Queue queue= new Queue(100);
		 List<Integer> primenumber = new ArrayList<Integer>();
		primenumber = Algorithmprograms.primeNumbers(0,1000);
		queue =  DataStructurePrograms.primeAnagram2(primenumber); 
		System.out.println("The numbers which are prime and anagram are");
		System.out.println( "The size of the queue " +queue.getSize());
	}

}
