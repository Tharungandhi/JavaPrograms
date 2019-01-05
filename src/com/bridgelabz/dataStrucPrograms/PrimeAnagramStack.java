package com.bridgelabz.dataStrucPrograms;

import java.util.ArrayList;
import com.bridgelabz.util.*;
import java.util.List;

public class PrimeAnagramStack {

	public static void main(String[] args) {
	        List<Integer> primenumber = new ArrayList<Integer>();
            Stack stack=new Stack(1000);
	        primenumber = Algorithmprograms.primeNumbers(0,1000); 
	        stack =  DataStructurePrograms.primeAnagram1(primenumber); 
//	        list1.addAll(set);
//	        int [] intArr=new int[list1.size()];
//	        for(int i=0;i<intArr.length;i++)
//	        {
//	            intArr[i]=list1.get(i);
//	        }
//	        intArr=DataStructurePrograms.sortArray(intArr);
//	        for(int i:intArr)
//	        {
//	            list3.add(i);
//	        }
//	        System.out.println("Is the list of prime numbers :"+list3.size());
//	        System.out.println(list3);
//	        Queue queue=new Queue(1000);
//	        for(int i=0;i<list3.size();i++)
//	        {
//	            queue.insert(list3.get(i));
//	        }
//	        System.out.println(queue.getSize()+" is the size of queue");
//	        System.out.println("Elements in a queue are :");
//	        while(!queue.isEmpty())
//	        {
//	            queue.remove();
//	        }
	        System.out.println("the size of the stack is " + stack.size());
           System.out.println("the elements after sorting is ");
           while(!Stack.isEmpty())
           {
        	   System.out.println(stack.pop() + " " +stack.pop());
           }

	}

}
