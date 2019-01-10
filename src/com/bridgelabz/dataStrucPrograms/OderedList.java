/******************************************************************************
 *  Compilation:  javac -d bin OrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.OrderedList n
 *  
 *  Purpose: Read .a List of Numbers from a file and arrange it ascending Order in a
 *		 	 Linked List. Take user input for a number, if found then pop the number out of the
 *		 	 list else insert the number in appropriate position
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   1-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStrucPrograms;

import java.io.IOException;

import com.bridgelabz.util.DataStructurePrograms;


	public class OderedList {
	    static String sortFile="/home/admin1/Desktop/OderedList.csv";
	    static String fName="/home/admin1/Desktop/sortedfile.txt";
	    /*
		* The main function is to read from a file and sort the elements
		* in ascending order to find the searched data and write the 
		* result into a file
		*/
	    public static void main(String[] args) throws IOException
	    {
	    	DataStructurePrograms LinkedList=new DataStructurePrograms();
	        LinkedList=DataStructurePrograms.readFile(LinkedList);
	        DataStructurePrograms.printList(LinkedList);
	        while(true)
	        {
	            System.out.println("please select one option");
	            System.out.println("1.Display list 2.to search element 3.Display modified File  ");
	            int option=DataStructurePrograms.readInteger();
	            switch(option) {
	            case 1:DataStructurePrograms.printList(LinkedList);
	            break;
	            case 2:{System.out.println("Enter the key element to be searched");
	            int key=DataStructurePrograms.readInteger();
	            String key1=String.valueOf(key);
	            int k=DataStructurePrograms.delete(LinkedList, key1);
	            System.out.println(k);
	            if(k==0) {
	            	DataStructurePrograms.insert(LinkedList, key1);
	            }
	            int[] fileContent = DataStructurePrograms.toIntConv(LinkedList);   
	            int[] sortedarr=DataStructurePrograms.stringSort(fileContent);
	            String sortedString[]=DataStructurePrograms.intTostring(sortedarr);
	            //String[] sarray=new String[sortedarr.length];
	            DataStructurePrograms.usingFileWriter(LinkedList,sortedString,sortFile);
	            break;}
	            case 3:    DataStructurePrograms.dispFile(sortFile);
	            break;
	            default:System.out.println("Please enter an valid option");
	            break;
	            }
	        }
	    }

	}