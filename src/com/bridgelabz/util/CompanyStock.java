package com.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.objectorientedprograms.StockAgency;

public class CompanyStock{
	static String file="/home/admin1/Tharun/Filesforjava/StockFiles/CompanyStock.json";
	static String file1="/home/admin1/Tharun/Filesforjava/StockFiles/PersonStock.json" ;
	static List<StockList> stocklist=new ArrayList<StockList>();
	static Set<StockList> set=new HashSet<StockList>();
	static List<StockList> tempstocklist=new ArrayList<StockList>();
	static StockList stock=null;
	static int sbuy;
	static int sbuy1;
	static int index;
	

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
             System.out.println("Entered name found");
             ++index;
             break;
         }
	return index;}
   
   
   public static void displayStock() throws FileNotFoundException {
       String string = ObjectOrientedPrograms.readFile(file);
       try {
       	stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
       } catch (Exception e) {
           System.out.println("File is empty!!! Nothing in data to display");
       }
       for (StockList stock : stocklist) {
    	   System.out.println("Company Details");
           System.out.println("Stock Name               : " + stock.getStockName());
           System.out.println("Total number of Stock    : " + stock.getNumberShares());
           System.out.println("Share Price              : " + stock.getStockPrice());
           System.out.println("Transaction status       : " + stock.getTransaction());
           System.out.println("Time&Date of transaction : " + stock.getDate());
           System.out.println("-------------------------------------------------------");
       }
}
   
   public static List<StockList> displayStock1() throws FileNotFoundException {
       String string = ObjectOrientedPrograms.readFile(file1);
       try {
    	   tempstocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
       } catch (Exception e) {
           System.out.println("File is empty!!! Nothing in data to display");
       }
       for (StockList stock : tempstocklist) {
    	   System.out.println("Person Details");
           System.out.println("Stock Name               : " + stock.getStockName());
           System.out.println("Total number of Stock    : " + stock.getNumberShares());
           System.out.println("Share Price              : " + stock.getStockPrice());
           System.out.println("Transaction status       : " + stock.getTransaction());
           System.out.println("Date&Time of transaction : " + stock.getDate());
           System.out.println("-------------------------------------------------------");
       }
       return tempstocklist;
}
   
   public static void buyStock() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
	 //  String string = ObjectOrientedPrograms.readFile(file);
//	   try { 
//			stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
//		    System.out.println("File is not empty!");
//		    System.out.println("You can buy the stock");
//		  //  displayStock();
//			} 
//			catch (Exception e) {
//		    System.out.println("File is empty!");
//		    System.out.println("First you should add the Stock details to buy it");
//		    addStock();
//		    } 
	   StockList s=new StockList(); 
	//   System.out.println("List of files present to buy the stock");
	   
	   String fileArray[]=listFilesInsideDirectory();
	   System.out.println(fileArray);
	    String accName=searchFile(fileArray);
	    System.out.println(accName);
	  //  stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
	    displayStock();
       System.out.println("Enter the name of the stock which you want to Buy");
       String s1=ObjectOrientedPrograms.readString();
       s.setStockName(s1);
       int flag=checkStockName(s1);
       System.out.println(flag);
       if(flag<0) {
           System.out.println("Stock name not found");
           String[] str= {};
           StockAgency.main(str);
       }
       else {
           System.out.println("Enter the amount of share you whish to buy which is less then available");
           s=stocklist.get(index);
           s.setDate("Date is Set");
           double amount=ObjectOrientedPrograms.readInteger();
           if(s.getNumberShares()>amount && amount>0) {
               System.out.println("Present shares=="+s.getNumberShares());
               double temp=s.getNumberShares();
               amount=s.getNumberShares()-amount;
               s.setNumberShares(amount);
               System.out.println("share remaining is =="+s.getNumberShares());
               s.setNumberShares(amount);
               tempstocklist.add(s);
               String json = ObjectOrientedPrograms.userWriteValueAsString( tempstocklist);
               ObjectOrientedPrograms.writeFile(json, accName);
               System.out.println("Successfully updated in the buyer file");               
               s.setNumberShares(temp-amount);      
               s.setTransaction("Completed");
               stocklist.add(s);
               set.addAll(stocklist);
               String json1 = ObjectOrientedPrograms.userWriteValueAsString1(set);
               ObjectOrientedPrograms.writeFile(json1, "/home/admin1/Tharun/Filesforjava/StockFiles/ComapnyStock.json");
               System.out.println("Successfully updated in seller file");
           }
           else
               System.out.println("Please enter a stock less than "+s.getNumberShares());
       }
   }
   public static void sellStock() throws JsonGenerationException, JsonMappingException, IOException {
       StockList s=new StockList();
       String string = ObjectOrientedPrograms.readFile(file);
       String string1 = ObjectOrientedPrograms.readFile(file1);
       try {
    	   stocklist = ObjectOrientedPrograms.userReadValue(string, StockList.class);
    	   tempstocklist = ObjectOrientedPrograms.userReadValue(string1, StockList.class);
           System.out.println("File is not empty!");
           System.out.println(tempstocklist);
           displayStock();
         displayStock1();
       } catch (Exception e) {
           System.out.println("File is empty!");
           System.out.println("Please Add data.....");
           addStock();
       }
      
       String fileArray[]=listFilesInsideDirectory();
       String accName=searchFile(fileArray);
       System.out.println("Enter the name of the Stock  which you want to Sell");
       String s1=ObjectOrientedPrograms.readString();
       int flag=checkStockName(s1);
       if(flag<0)System.out.println("Stock name not found");
       else {
           double shareInCompany=stocklist.get(flag).getNumberShares();
           stocklist.remove(flag);
       System.out.println("Enter the amount of share you wish to sell");
       s=tempstocklist.get(0);
       double share1=ObjectOrientedPrograms.readInteger();
       if(s.getNumberShares()>share1 && share1>0) {
           System.out.println("Person share  is "+s.getNumberShares());
           s.getNumberShares();
           tempstocklist.remove(s);
            double share=s.getNumberShares()-share1;
         System.out.println("Company Share is "+shareInCompany);
           s.setNumberShares(share);
           tempstocklist.clear();
           tempstocklist.add(s);
           s.setDate("Date is Set");
           String json = ObjectOrientedPrograms.userWriteValueAsString(tempstocklist);
           ObjectOrientedPrograms.writeFile(json, "/home/admin1/Tharun/Filesforjava/StockFiles/PersonStock.json");
           s.setNumberShares(shareInCompany+share1);
           System.out.println("Company Share = "+s.getNumberShares());
           s.setTransaction("Completed");
           stocklist.add(s);
           String json1 = ObjectOrientedPrograms.userWriteValueAsString(stocklist);
           ObjectOrientedPrograms.writeFile(json1, "/home/admin1/Tharun/Filesforjava/StockFiles/CompanyStock.json");
       }
       else
           System.out.println("Please enter a stock less than "+s.getNumberShares());
   }  }
   
   public static String[] listFilesInsideDirectory()
   {
       File dir = new File("/home/admin1/Tharun/Filesforjava/StockFiles/");
       String[] children = dir.list();

       if (children == null) {
           System.out.println("does not exist or is not a directory");
       } else {
           for (int i = 0; i < children.length; i++) {
               String filename = children[i];
               System.out.println(filename);
           }
       }
	return children;
       
   }

public static String searchFile(String[] strings) {
       System.out.println("Enter your account name");
       String str=ObjectOrientedPrograms.readString();
       for(String s:strings) {
           if(s.compareToIgnoreCase(str)==0) {
               System.out.println("Account found");
               break;
           }
           else {
               str=creatAccount();
               break;
           }
       }
       return str;
   }

public static String creatAccount() {
    System.out.println("Enter the account name with json extent");
    StringBuffer sb=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles/");
    String ffname=ObjectOrientedPrograms.readString();
    sb.append(ffname);
    File stockFile = new File(sb.toString());
    boolean flag=false;

    try {
        flag = stockFile.createNewFile();

    } catch (IOException ioe) {
        System.out.println("Error while Creating File in Java" + ioe);
    }

  //  System.out.println("stock file" + stockFile.getPath() + " created ");
    System.out.println("File is Succesfully created");
    return ffname;
}



}
