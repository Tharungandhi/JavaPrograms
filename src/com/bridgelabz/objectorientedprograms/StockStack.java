package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.StackLinkedList;
import com.bridgelabz.util.StockCompanyShare;
import com.bridgelabz.util.StockList;

public class StockStack {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, ClassNotFoundException, IOException {
		 String s=null;
	        System.out.println("Select the option");
	        System.out.println("1.Buy share\n2.Sell\n");
	       StackLinkedList<String> stack=new StackLinkedList<String>();
	       StackLinkedList<?> stack1=new StackLinkedList<Object>();
	        List<StockList> list=new ArrayList<StockList>();
	        int opt=ObjectOrientedPrograms.readInteger();
	        do
	        {
	            switch (opt)
	            {
	            case 1:{
	            	StockCompanyShare.buyStock();
	                System.out.println("Enter the fileName");
	                StringBuffer sb1=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles/");
	                String ss1=ObjectOrientedPrograms.readString();
	                sb1.append(ss1);
	                list=StockCompanyShare.displayStock1(sb1.toString());
	                for(StockList stock:list) {
	                	stack.push(stock.getDate());
	                	stack1.pop();      
	                }
	                StockCompanyShare.displayStackLinkedList(sb1.toString());
	                break;
	            }
	            case 2:
	            { 
	            	    StockCompanyShare.sellStock();
	                    System.out.println("Enter the fileName");
		                StringBuffer sb1=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles/");
		                String ss1=ObjectOrientedPrograms.readString();
		                sb1.append(ss1);
		                list=StockCompanyShare.displayStock1(sb1.toString());
		                for(StockList stock:list) {
		                	stack.push(stock.getDate());
		                	stack1.pop();
		                	}
		                	 StockCompanyShare.displayStackLinkedList(sb1.toString());
		 	                break;  }
	            default:
	            {
	            	System.out.println("Pls enter proper choice");
	                break;
	            }}
	            System.out.println("Do you want to continue? Y/N");
	            s=ObjectOrientedPrograms.readString();
	        
	        } 
	        while(s.compareToIgnoreCase("y")==0);
	        }}


