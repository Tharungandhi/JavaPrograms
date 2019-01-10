package com.bridgelabz.dataStrucPrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.Queue;

public class PrimeAnagramQueue {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using queue
	*/
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
			Queue<Integer> queue=new Queue<Integer>(1000);
			List<Integer> list2 = new ArrayList<Integer>();
			list2 = Algorithmprograms.primeNumbers(0,1000); //finding prime
			queue = DataStructurePrograms.primeAnagram2(list2); //finding anagram
			System.out.println(queue.getSize()+" is the size of queue");
			System.out.println("Elements in a queue are :");
			while(!queue.isQueueEmpty())
			{
				queue.removes();
				queue.removes();
				System.out.println();
			}
	}
}
