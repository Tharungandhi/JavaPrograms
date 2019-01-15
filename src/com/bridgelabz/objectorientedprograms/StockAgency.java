package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.BuyStock;
import com.bridgelabz.util.ObjectOrientedPrograms;

public class StockAgency {
  static int ch=0;
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
		System.out.println("----welcome to Stock Agency--------");
		do {
		System.out.println("1:DO you want to Buy a Stock");
		System.out.println("2: Do you want to Sell the Stock");
		System.out.println("3: Do you want to Display the list");
		int choice=ObjectOrientedPrograms.readInteger();
		switch(choice){
		case 1:
		{
			BuyStock.buy();
			break;}
		
		case 2:
		{BuyStock.sellStock();
		break;
			}
		default:
			System.out.println("Pls enter proper choice");
			
		
	}ch++;}while(ch<100);}}
	


       

