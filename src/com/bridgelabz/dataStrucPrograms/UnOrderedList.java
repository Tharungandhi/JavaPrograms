package com.bridgelabz.dataStrucPrograms;

import java.io.IOException;

import com.bridgelabz.util.DataStructurePrograms;

public class UnOrderedList {
	public static void main(String[] args) throws IOException {
		DataStructurePrograms LinkedList=new DataStructurePrograms();
	        
	        LinkedList=DataStructurePrograms.readFileStr(LinkedList);
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
	            if(k==0)
	            	DataStructurePrograms.insert(LinkedList, key);
	            System.out.println("the " + key + " element doesnot found and it is added to the list ");
	            DataStructurePrograms.usingFileWriter(LinkedList);
	            break;
	            case 3:    
	                String fName="/home/admin1/Desktop/UnOderedList.csv";                
	                DataStructurePrograms.dispFile(fName);
	                break;
	            default:System.out.println("Please enter an valid option");
	            break;
	            }
	        }
	    }
     }
