package com.bridgelabz.dataStrucPrograms;

import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.Queue;

public class BankingCashCounter {

	public static void main(String[] args) {
		System.out.println("--------Welcome to banking counter--------");
	   Queue<Object> banking=new Queue<Object>(100);
	   long totalcash=100000;
	   int ch = 0;
	do {
	   System.out.println("the money available in cash counter is " + totalcash);
    System.out.println("1:Do you want to add the customer to Queue");
    System.out.println("2:Do you want to know the number of people in the Queue");
    System.out.println("3:Do you want to exit from the banking counter");
  	int choice=DataStructurePrograms.readInteger();
  	switch (choice) {
  	case 1:
  	     System.out.println("1.Do you want to Deposit amount");
      	 System.out.println("2.Do you want to Withdraw amount");
  	int choice1=DataStructurePrograms.readInteger();;
  	switch (choice1) 
  	{	
  	
  	case 1:
	   		System.out.println("Enter the amount you want to Deposit");
	   		int cashDepsoited = DataStructurePrograms.readInteger();
	   		 totalcash += cashDepsoited;
	   		System.out.println("total cash available after deposition is " +totalcash);
	   		System.out.println();
	   		break;
  	case 2:
	   		System.out.println("Enter the amount you want to Withdraw ");
	   		int cashWithdraw=DataStructurePrograms.readInteger();
	   		totalcash-=cashWithdraw;
	   		System.out.println("The available balance in the counter after withdraw is  "+ totalcash);
	   		System.out.println();
	   		break;
	    default: 
   		System.out.println("You entered wrong choice");
   		break;
   		}
  	break;
	case 2:  System.out.println("the customer is removed and");
			int j=banking.getSize();
			System.out.println("The Number of People in Queue is: "+j);	
			System.out.println();
			break;
  	case 3:
	   		System.exit(0);
	   		break;
  	default: 
	   		System.out.println("You entered wrong choice");
	   		break;
  	}
  	ch++;}
	
	    while(ch<5);

	}}
