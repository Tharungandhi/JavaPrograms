package com.bridgelabz.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.objectorientedprograms.StockAgency;

public class BuyStock {
	static String file="/home/admin1/Tharun/Filesforjava/BuyStock.json";
	static String file1="/home/admin1/Tharun/Filesforjava/addedStock.json" ;
	static List<StockList> stocklist=new ArrayList<StockList>();
	static Set<StockList> set=new HashSet<StockList>();
	static List<StockList> tempstocklist=new ArrayList<StockList>();
	static StockList stock=null;
	static int sbuy;
	static int sbuy1;
	static int index;
	public static void buyStock() throws JsonGenerationException, JsonMappingException, IOException
	{
		//String string = ObjectOrientedPrograms.readFile(file);
		try { 
		//stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
			stocklist=displayStock1();
	    System.out.println("File is not empty!");
	    System.out.println("You can buy the stock");

		} 
		catch (Exception e) {
	    System.out.println("File is empty!");
	    System.out.println("First you should add the Stock details to buy it");
	    addStock();
	    } 
		//displayStock();
	    StockList s=new StockList();
	     System.out.println("Buy the stock By enetering the Stock name");
	     String sname=ObjectOrientedPrograms.readString(); 
//	     s.setStockName(sname);
//	     int flag=checkStockName(sname);
//	     if(flag==0)System.out.println("Stock name not found");
//	     else{
	     for(StockList s11:stocklist)
	     if(s11.getStockName().equals(sname))
	     {
	    	  s=new StockList();
	    	 System.out.println("Stock Name Found");
	    	 System.out.println("Enter the amount of stock you want to buy");
	    	  sbuy=ObjectOrientedPrograms.readInteger();
	    	  s = stocklist.get(index);
	    	  System.out.println("Total no of shares present are  "+s.getNumberShares());
	    	 System.out.println(sbuy + " Stock are succesfully buyed");
	    	 s.setNumberShares(sbuy);
	    	 tempstocklist.add(s);
	    	 String json1=ObjectOrientedPrograms.userWriteValueAsString(tempstocklist);
	    	 ObjectOrientedPrograms.writeFile(json1,file1);
			double sbuy1 = stock.getNumberShares()-sbuy; 
	    	  reWrite(sbuy1);
	    	 
	     }}

 public static List<StockList> addStock() throws JsonGenerationException, JsonMappingException, IOException
 {
	 stock=new StockList();
		System.out.println("Enter the Stock Name ");
		String cname=ObjectOrientedPrograms.readString();
		stock.setStockName(cname);
		System.out.println("Enter the Number of Stock");
		int nstock=ObjectOrientedPrograms.readInteger();
		stock.setNumberShares(nstock);
		System.out.println("Enter the Stock price");
		int Sprice=ObjectOrientedPrograms.readInteger();
		stock.setStockPrice(Sprice);
		stocklist.add(stock);
	     System.out.println("Stock is succesfully added to the list");
	     String json = ObjectOrientedPrograms.userWriteValueAsString(stocklist);
	     ObjectOrientedPrograms.writeFile(json, file);
	     return stocklist;
	     
	   
 }

   public static int checkStockName(String sbuy) {
	   
	   index=-1;
     for(StockList ss:stocklist)
        
         if(ss.getStockName().equals(sbuy)) {
             System.out.println(" entered name found");
             ++index;
             break;
         }
	return index;}
   public static void reWrite(double sbuy12) throws JsonGenerationException, JsonMappingException, IOException
   {StockList s1=new StockList();
	   s1.setNumberShares(sbuy12);
	   stocklist.add(s1);
	   String json=ObjectOrientedPrograms.userWriteValueAsString(stocklist);
  	 ObjectOrientedPrograms.writeFile(json,file);
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
   public static void sellStock() throws JsonGenerationException, JsonMappingException, IOException {
	   StockList s=new StockList();
	   String string = ObjectOrientedPrograms.readFile(file);
	   String string1 = ObjectOrientedPrograms.readFile(file1);
           try {
        	  stocklist= ObjectOrientedPrograms.convertJsonToPOJO("/home/admin1/Tharun/Filesforjava/BuyStock.json", StockList.class);
        	   tempstocklist = ObjectOrientedPrograms.convertJsonToPOJO("/home/admin1/Tharun/Filesforjava/addedStock.json", StockList.class);
        	  // stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
        	   //tempstocklist=ObjectOrientedPrograms.userReadValue(string1,StockList.class);
               System.out.println("File is not empty!");
               System.out.println(stocklist);
           } catch (Exception e) {
               System.out.println("File is empty!");
               System.out.println("Please Add data.....");
           }
           displayStock();
           System.out.println("Enter the name of the Stock  which you want to Sell");
           String s1=ObjectOrientedPrograms.readString();
System.out.println(tempstocklist);
           int flag=checkStockName(s1);
           if(flag<0)System.out.println("Stock name not found");
           else {
              
               double shareInCompany=stocklist.get(flag).getNumberShares();
               stocklist.remove(flag);
               displayStock();
           System.out.println("Enter the amount of share you wish to sell");
         //  s=tempstocklist.get(0);
           double share1=ObjectOrientedPrograms.readInteger();
           if(s.getNumberShares()>share1 && share1>0) {
               System.out.println("Present shares=="+s.getNumberShares());
               s.getNumberShares();
               stocklist.remove(s);
                double share=s.getNumberShares()-share1;
               System.out.println("share=="+s.getNumberShares());
               s.setNumberShares((int) share);
               tempstocklist.clear();
               tempstocklist.add(s);
               String json = ObjectOrientedPrograms.userWriteValueAsString(tempstocklist);
               ObjectOrientedPrograms.writeFile(json, "/home/admin1/Tharun/Filesforjava/addedStock.json");
               System.out.println("Written successfully");
               s.setNumberShares(shareInCompany+share1);
               System.out.println("Company Share = "+s.getNumberShares());
               stocklist.add(s);
               String json1 = ObjectOrientedPrograms.userWriteValueAsString(stocklist);
               ObjectOrientedPrograms.writeFile(json1, "/home/admin1/Tharun/Filesforjava/BuyStock.json");
               System.out.println("Written successfully");
           }
           else
               System.out.println("Please enter a stock less than "+s.getNumberShares());
       }   

   }
   public static List<StockList> displayStock1() throws FileNotFoundException {
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
       return stocklist;
}
   
   public static void buy() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
	   try { 
		    System.out.println("File is not empty!");
		    System.out.println("You can buy the stock");

			} 
			catch (Exception e) {
		    System.out.println("File is empty!");
		    System.out.println("First you should add the Stock details to buy it");
		    addStock();
		    } 
	   StockList s=new StockList();
       stocklist=displayStock1();   
       System.out.println("Enter the name of the stock which you want to Buy");
       String s1=ObjectOrientedPrograms.readString();
       s.setStockName(s1);
       int flag=checkStockName(s1);
       System.out.println(flag);
       if(flag<0) {
           System.out.println("Stoke name not found");
           String[] str= {};
           StockAgency.main(str);
       }
       else {
           System.out.println("Enter the amount of share you whish to buy");
           //System.out.println(flag);
           s=stocklist.get(index);
           //tempList.add(s);
           double share=ObjectOrientedPrograms.readInteger();
           if(s.getNumberShares()>share && share>0) {
               System.out.println("Present shares=="+s.getNumberShares());
               double temp=s.getNumberShares();
               share=s.getNumberShares()-share;
               s.setNumberShares(share);
               System.out.println("share=="+s.getNumberShares());
               s.setNumberShares(share);
               //System.out.println("Share price is equals to"+s.getSharePrice());
               tempstocklist.add(s);
               @SuppressWarnings("unchecked")
			String json = ObjectOrientedPrograms.userWriteValueAsString((List<StockList>) tempstocklist);
               ObjectOrientedPrograms.writeFile(json, "/home/admin1/Tharun/Filesforjava/addedStock.json");
               System.out.println("Written successfully");               
               s.setNumberShares(temp-share);               
               stocklist.add(s);
              // .addAll(stocklist);
               String json1 = ObjectOrientedPrograms.userWriteValueAsString((List<StockList>) stocklist);

               ObjectOrientedPrograms.writeFile(json1, "/home/admin1/Tharun/Filesforjava/BuyStock.json");
               System.out.println("Written successfully");
           }
           else
               System.out.println("Please enter a stock less than "+s.getNumberShares());
       }
   }













}
