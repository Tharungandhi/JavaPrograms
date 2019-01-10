/******************************************************************************
 *  Compilation:  javac -d bin UnOrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.UnOrderedList n
 *  
 *  Purpose: Reads the text from a file, split it into words and arrange it as Linked List.
 *  		 Takes a user input to search a Word in the List. If the Word is not found then 
 *  		 add it to the list, and if it found then remove the word from the List.
 *  		 In the end save the list into a file
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStrucPrograms;

import java.io.IOException;

import com.bridgelabz.util.DataStructurePrograms;

public class UnOrderedList {
	static String fname="/home/admin1/Desktop/UnOderedList.csv";
	/*
	* The main function is read a file and add to customized linked 
	* list to find the searched word
	*/
	public static void main(String[] args) throws IOException {
		DataStructurePrograms LinkedList=new DataStructurePrograms();
	        
	        LinkedList=DataStructurePrograms.readFile(LinkedList);
	        DataStructurePrograms.printList(LinkedList);

	        while(true)
	        {
	            System.out.println("please select one option");
	           System.out.println("1.Display list 2.to search element 3.Display modified File  ");
	            int option=DataStructurePrograms.readInteger();
	            switch(option) {
	            case 1:
	            	DataStructurePrograms.printList(LinkedList);
	            break;
	            case 2:
	            	System.out.println("Enter the key element which should be searched and deleted");
	            String key=DataStructurePrograms.readString();
	            int k=DataStructurePrograms.delete(LinkedList, key);
	            System.out.println(k);
	            if(k==0) {
	            	DataStructurePrograms.insert(LinkedList, key);}
	            String[] fileContent=DataStructurePrograms.toStrinConv(LinkedList);
	            System.out.println("the " + key + " element doesnot found and it is added to the list ");
	            DataStructurePrograms.usingFileWriter(LinkedList,fileContent,fname);
	            break;
	            case 3:    
	              //  String fName="/home/admin1/Desktop/UnOderedList.csv";                
	                DataStructurePrograms.dispFile(fname);
	                break;
	            default:System.out.println("Please enter an valid option");
	            break;
	            }
	        }
	    }
     }
