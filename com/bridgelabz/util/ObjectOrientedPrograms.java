package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectOrientedPrograms {
	static Scanner scanner1=new Scanner(System.in); //scanner class declaration

	//method for scanner class of integer type 
	/**
	 * static function to read integers input from the user
	 * @return integer values that are read
	 */
	public static int readInteger() {
		return scanner1.nextInt();}

	//method for scanner class of double type 
	/**
	 * static function to read double input from the user
	 * @return double values that are read
	 */
	public static double readdouble() {
		return scanner1.nextDouble();}

	//method for scanner class of long type 
	/**
	 * static function to read long input from the user
	 * @return double values that are read
	 */
	public static long readlong() {
		return scanner1.nextLong();}
	//method for scanner class of String type 
	/**
	 * static function to read string input from the user
	 * @return strings that are read
	 */
	public static String readString() {
		return scanner1.next();}


	/**
	 * static function to read boolean input from the user
	 * @return boolean values that are read
	 */
	public static boolean userBoolean(){
		return scanner1.nextBoolean();}

	public static String readFile(String message) throws FileNotFoundException {
		FileReader f = new FileReader(message);
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		try {
			String word="";
			while ((word = read.readLine()) != null) {
				line = word;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}
	//Regex

	public static String modifiedMessage(String name,String fullname,String mobileno, String date,String Message) {
		final String Regex_1="<<name>>";
		final String Regex_2="<<fullname>>";
		final String Regex_3="<{2}+x{10}+>{2}";
		final String Regex_4="\\d{2}+/+\\d{2}+/+\\d{4}";			
		

		Pattern p = Pattern.compile(Regex_1);
		Matcher m = p.matcher(Message);
		Message = m.replaceAll(name);

		Pattern p1=Pattern.compile(Regex_2);
		Matcher m1=p1.matcher(Message);
		Message = m1.replaceAll(fullname);

		Pattern p2=Pattern.compile(Regex_3);
		Matcher m2=p2.matcher(Message);
		Message = m2.replaceAll(mobileno);

		Pattern p3=Pattern.compile(Regex_4);
		Matcher m3=p3.matcher(Message);
		Message = m3.replaceAll(date);

		return Message;
	}

	//		

	public static String currentDate()
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate= formatter.format(date);
		return strDate;
	}

	//
	public static Inventory getInventories()
	{
		Inventory inventory = new Inventory();
		System.out.println("Enter name of inventory");
		inventory.setName(ObjectOrientedPrograms.readString());
		System.out.println("Enter weight of inventory in kilograms");
		inventory.setWeight(ObjectOrientedPrograms.readdouble());
		System.out.println("Enter price of inventory in rupees");
		inventory.setPrice(ObjectOrientedPrograms.readdouble());
		return inventory;
	}
	public static InventoryList display(List<InventoryList> list2)
	{
		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				System.out.println("price :" + it.getListOfInventories().get(j).getPrice());
				System.out.println("weight :" + it.getListOfInventories().get(j).getWeight());
				System.out.println();
			}}
		System.out.println("---------------------------------------------");
		return null;
	}


	public static InventoryList insertNewInventory(String inventoryName, List<Inventory> listOfInventories)
	{
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName(inventoryName);
		inventoryList.setListOfInventories(listOfInventories);
		return inventoryList;
	}


	@SuppressWarnings("static-access")
	public static void priceOFInventory(List<InventoryList> originfile)
	{

		for (int i = 0; i < originfile.size(); i++) {
			InventoryList it = originfile.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				double sum=it.getListOfInventories().get(j).getPrice()*it.getListOfInventories().get(j).getWeight();
				System.out.println("total price to be given is :"+sum);
			}
			System.out.println("---------------------------------------------");
		}
	}

	public static void writelist(String json) throws IOException
	{
		FileWriter file = new FileWriter("/home/admin1/Desktop/JSONInventoryDataManagement.json");
		@SuppressWarnings("resource")
		BufferedWriter buffer = new BufferedWriter(file);
		buffer.write(json);
		buffer.flush();
	}

	public static void writeFile(String json,String fileName) throws IOException
	{
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.flush();
	}

	//public stat


 
}

