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

import com.bridgelabz.objectorientedprograms.StockApplication;
import com.bridgelabz.util.LinkedList;
import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.QueueLinkedList;
import com.bridgelabz.util.StackLinkedList;
import com.bridgelabz.util.StockList;

public class StockCompanyShare {
	static List<StockList> stockList = new ArrayList<StockList>();
	static Set<StockList> set = new HashSet<StockList>();
	static List<StockList> tempList =new ArrayList<StockList>();
	static final String str = "/home/admin1/Tharun/Filesforjava/StockFiles/ComapnyStock.json";
	static StockList s=null;
	static int index=-1;
	static StackLinkedList<String> stack=new StackLinkedList<String>();
	static QueueLinkedList<String> queue=new QueueLinkedList<String>();
	static LinkedList<String> linkedList=new LinkedList<String>();   
	public static <T> void buyStock() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
		StockList s=new StockList();
		stockList = new ArrayList<StockList>();
		System.out.println("Files/Persons present are ");
		System.out.println();
		String fileArray[]=listFilesInsideDirectory();
		String accName=searchFile(fileArray);
		stockList=displayStock1("/home/admin1/Tharun/Filesforjava/StockFiles/ComapnyStock.json");  
		System.out.println("Enter the name of the stock which you want to Buy");
		String s1=ObjectOrientedPrograms.readString();
		s.setStockName(s1);
		int flag=checkStockName(s1);
		System.out.println(flag);
		if(flag<0) {
			System.out.println("Stoke name not found");
			String[] str1= {};
			StockApplication.main(str1);
		}
		else {
			System.out.println("Enter the amount of share you wish to buy");
			s=stockList.get(index);
			s.setDate("date Set");
			double share=ObjectOrientedPrograms.readInteger();
			if(s.getNumberShares()>share && share>0) {
				System.out.println("Present share=="+s.getNumberShares());
				double temp=s.getNumberShares();
				share=s.getNumberShares()-share;
				s.setTransaction("added");
				queue.insert(s.getDate());
				stack.push(s.getTransaction());
				linkedList.add(s.getStockName());
				s.setNumberShares(share);
				System.out.println("Company share=="+s.getNumberShares());
				tempList.add(s);
				String json = ObjectOrientedPrograms.userWriteValueAsString( tempList);
				StringBuffer sb11=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles//");
				sb11.append(accName);
				ObjectOrientedPrograms.writeFile(json, sb11.toString());
				System.out.println("Written successfully");               
				s.setNumberShares(temp-share);               
				stockList.add(s);
				set.addAll(stockList);
				String json1 = ObjectOrientedPrograms.userWriteValueAsString1( set);
				ObjectOrientedPrograms.writeFile(json1, "/home/admin1/Tharun/Filesforjava/StockFiles/ComapnyStock.json");
				System.out.println("Written successfully");
			}
			else
				System.out.println("Please enter a stock less than "+s.getNumberShares());
		}
	}
	
	public static int checkStockName(String s1) {
		index=-1;
		for(StockList ss:stockList)
		{
			++index;
			if(ss.getStockName().equals(s1)) {
				System.out.println("found");
				break;
			}
		}
		return index;
	}


	public static void sellStock() throws JsonGenerationException, JsonMappingException, IOException {
		StockList s=new StockList();
		tempList=new ArrayList<StockList>();
		String fileArray[]=listFilesInsideDirectory();
		String accName=searchFile(fileArray);
		System.out.println("Enter the name of the Stoke which you want to Sell");
		String s1=ObjectOrientedPrograms.readString();
		int flag=0;
		flag=checkStockName(s1);
		System.out.println(flag);
		if(flag<0)System.out.println("Stoke name not found");
		else {
			double shareInCompany=stockList.get(flag).getNumberShares();
			System.out.println("Enter the amount of share you wish to sell");
			s=tempList.get(0);
			double share1=ObjectOrientedPrograms.readInteger();
			if(s.getNumberShares()>share1 && share1>0) {
				System.out.println("Present shares=="+s.getNumberShares());
				double share=s.getNumberShares()-share1;
				System.out.println("share=="+s.getNumberShares());
				s.setNumberShares(share);
				s.setDate("date");
				s.setTransaction("sold");
				queue.insert(s.getDate());
				stack.push(s.getTransaction());
				linkedList.add(s.getStockName());
				tempList.clear();
				tempList.add(s);
				String json = ObjectOrientedPrograms.userWriteValueAsString(tempList);
				StringBuffer sb11=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles//");
				sb11.append(accName);
				ObjectOrientedPrograms.writeFile(json, sb11.toString());
				System.out.println("Written successfully");
				s.setNumberShares(shareInCompany+share1);
				System.out.println("Company Share = "+s.getNumberShares());
				stockList.add(s);
				String json1 = ObjectOrientedPrograms.userWriteValueAsString(stockList);
				ObjectOrientedPrograms.writeFile(json1, "/home/admin1/Tharun/Filesforjava/StockFiles/ComapnyStock.json");
				System.out.println("Written successfully");
			}
			else
				System.out.println("Please enter a stock less than "+s.getNumberShares());
		}
	}

	public static void save() {
		System.out.println("File successfully saved");

	}
	public static void printStock() throws FileNotFoundException {
		try{
			System.out.println("Share details of the company");
			stockList=displayStock1("/home/admin1/Tharun/Filesforjava/StockFiles/ComapnyStock.json");   
			System.out.println("///////////////////////////////////////");
			System.out.println("Shares details of the person");
			tempList=displayStock1("/home/admin1/Tharun/Filesforjava/StockFiles/PersonStock.json");
			System.out.println("Stack/Queue elements are");

		}
		catch(FileNotFoundException e){
			System.out.println("Please enter the valid file name/path");
		}
	}


	public static String[] listFilesInsideDirectory()
	{
		File dir = new File("/home/admin1/Tharun/Filesforjava/StockFiles//");
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
	public static String searchFile(String[] strings) throws FileNotFoundException {
		System.out.println("Enter your account name to search");
		String str=ObjectOrientedPrograms.readString();
		int flag=0;
		for(String s:strings) {
			if(s.compareToIgnoreCase(str)==0) {
				System.out.println("Account found");
				displayStock1(str);
				flag=1;
				break;
			}
		}
	
	if (flag==0) {
		System.out.println("Account details doesnot exist pls create account first");
		str=creatAccount();}
	return str;
}

public static void displayQueueLinkedList(String string) throws FileNotFoundException {
	try {
		linkedList.printNew();
		System.out.println("Last Transaction Time/Date  : "+ queue.remove());
		System.out.println("-------------------------------------------------------");
	}
	catch(Exception e) {
		System.out.println();
	}
}
public static void displayStackLinkedList(String fName) throws FileNotFoundException {
	try {
		linkedList.printNew();
		System.out.println("Last Transaction status     : " + stack.pop());
		System.out.println("-------------------------------------------------------");
	}
	catch(Exception e) {
		System.out.println();
	}
}
public static List<StockList> displayStock1(String fName) throws FileNotFoundException {

	try {
		stockList = ObjectOrientedPrograms.convertJsonToPOJO(fName,  StockList.class);
	} catch (Exception e) {
		System.out.println("File is empty!!! Nothing in data to display");
	}
	for (StockList stock : stockList) {
		System.out.println("Stock Name               : " + stock.getStockName());
		System.out.println("Total number of Stock    : " + stock.getNumberShares());
		System.out.println("Share Price              : " + stock.getStockPrice());
		System.out.println("Last Transaction Time/Date  : " + stock.getDate());
		System.out.println("Last Transaction status     : " + stock.getTransaction());
		System.out.println("-------------------------------------------------------");
	}
	return stockList;

}
public static String creatAccount() {
    System.out.println("Enter the new  account name");
    StringBuffer sb=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles//");
    String ffname=ObjectOrientedPrograms.readString();
    sb.append(ffname);
    File stockFile = new File(sb.toString());
    @SuppressWarnings("unused")
	boolean flag=false;

    try {
        flag = stockFile.createNewFile();

    } catch (IOException ioe) {
        System.out.println("Error while Creating File in Java" + ioe);
    }

    System.out.println("stock file" + stockFile.getPath() + " created ");
    return ffname;
}
}

