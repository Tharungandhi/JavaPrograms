package com.bridgelabz.dataStrucPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.Queue;

public class PrimeAnagramStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     List<Integer> list1 = new ArrayList<Integer>();
	        List<Integer> list2 = new ArrayList<Integer>();
	        List<Integer> list3 = new ArrayList<Integer>();
	        Set<Integer> set = new HashSet<Integer>();
	        list2 = Algorithmprograms.primeNumbers(0,1000); //finding prime
	        set = DataStructurePrograms.primeAnagram(list2); //finding anagram
	        list1.addAll(set);
	        int [] intArr=new int[list1.size()];
	        for(int i=0;i<intArr.length;i++)
	        {
	            intArr[i]=list1.get(i);
	        }
	        intArr=DataStructurePrograms.sortArray(intArr);
	        for(int i:intArr)
	        {
	            list3.add(i);
	        }
	        System.out.println("Is the list of prime numbers :"+list3.size());
	        System.out.println(list3);
	        Queue queue=new Queue(1000);
	        for(int i=0;i<list3.size();i++)
	        {
	            queue.insert(list3.get(i));
	        }
	        System.out.println(queue.getSize()+" is the size of queue");
	        System.out.println("Elements in a queue are :");
	        while(!queue.isEmpty())
	        {
	            queue.remove();
	        }


	}

}
