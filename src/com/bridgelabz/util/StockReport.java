package com.bridgelabz.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockReport {
	static String file="/home/admin1/Tharun/Filesforjava/stock.json";
	
	static List<StockList> stocklist=new ArrayList<StockList>();
	 static StockList stock = new StockList();
	  
		public static void addStock() throws JsonGenerationException, JsonMappingException, IOException {
			 String string = ObjectOrientedPrograms.readFile(file);
			 try {
				 stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
		            System.out.println("File is not empty!");
		            System.out.println("Adding data.....");
		        } catch (Exception e) {
		            System.out.println("File is empty!");
		            System.out.println("Adding data.....");
		        }
			stock=new StockList();
			System.out.println("Enter the stock name");
			String sname=ObjectOrientedPrograms.readString();
			stock.setStockName(sname);
			
			System.out.println("Enter the Stock price");
		   int sprice=ObjectOrientedPrograms.readInteger();
		   stock.setStockPrice(sprice);
		   
		   System.out.println("Enter the stock Number of share");
		   int snumber=ObjectOrientedPrograms.readInteger();
		   stock.setNumberShares(snumber);
		   stocklist.add(stock);
		   System.out.println("Stock added successfully!!!");
	        String json = ObjectOrientedPrograms.userWriteValueAsString(stocklist);
	        ObjectOrientedPrograms.writeFile(json, file);
	    
		   }
		
		public static void displayStock() throws FileNotFoundException {
	        String string = ObjectOrientedPrograms.readFile(file);
	        try {
	        	stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
	        } catch (Exception e) {
	            System.out.println("File is empty!!! Nothing in data to display");
	        }
	        for (StockList stock : stocklist) {
	            System.out.println("Stock Name               : " + stock.getStockName());
	            System.out.println("Total number of Stock    : " + stock.getNumberShares());
	            System.out.println("Share Price              : " + stock.getStockPrice());
	            System.out.println("-------------------------------------------------------");
	        }
	    }
		public static void valueOfEachStock() throws FileNotFoundException {
	        String string = ObjectOrientedPrograms.readFile(file);
	        try {
	        	stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
	        } catch (Exception e) {
	            System.out.println("File is empty!!! Nothing in data to display");
	        }
	        for (StockList stock : stocklist) {
	            System.out.println("Stock Name               : " + stock.getStockName());
	            System.out.println("Value of this stock is           :" + stock.getNumberShares() * stock.getStockPrice());
	            System.out.println("------------------------------------------------------");
	        }
	    }
		 public static void totalStockValue() throws FileNotFoundException {
		        String string = ObjectOrientedPrograms.readFile(file);
		        try {
		        	stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
		        } catch (Exception e) {
		            System.out.println("File is empty!!! Nothing in data to display");
		        }
		        double sum = 0;
		        for (StockList stock : stocklist) {
		            sum += (stock.getNumberShares() * stock.getStockPrice());
		        }
		        System.out.println("Total value of stock is :" + sum+"\n");

		    }
}
