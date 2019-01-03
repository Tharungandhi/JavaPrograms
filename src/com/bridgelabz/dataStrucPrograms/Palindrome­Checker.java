package com.bridgelabz.dataStrucPrograms;

import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.Deque;

public class Palindrome­Checker {

	public static void main(String[] args) {
		Deque<Comparable> deque=new Deque<Comparable>(100);
	  System.out.println("enter the String to check Palindrome­ or not ");
	  String string=DataStructurePrograms.readString();
	  for(int i=0;i<string.length();i++)
		{
			char c =string.charAt(i);
			deque.addRear(c);
		}
		int flag=0;

		while(deque.size()>1)
		{
			if(deque.removeFront()!=deque.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
}
	}


