package com.bridgelabz.dataStrucPrograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.util.DataStructurePrograms;

public class OrderedList {
   
	    static String sortFile="/home/admin1/Desktop/Files/sorted.txt";
	    static String fName="/home/admin1/Desktop/Files/num.txt";
	    public static void main(String[] args) throws IOException
	    {
	    	DataStructurePrograms LinkedList=new DataStructurePrograms();
	        LinkedList=DataStructurePrograms.readFileInt(LinkedList);
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
	            String[] fileContent1 = DataStructurePrograms.toStrinConv(LinkedList);
	            int[] arr=DataStructurePrograms.stringSort(fileContent);
	            String[] sarray=new String[arr.length];
	            //int[] arry = DataStructureUtility.toIntConv(LinkedList);
	            for(int i=0;i<arr.length;i++) {
	                if(arr[i]!=0) {
	                     sarray[i]=String.valueOf(arr[i]);
	                    i++;
	                }
	            }
	            DataStructurePrograms.usingFileWriter(LinkedList,sarray,sortFile);
	            //DataStructureUtility.writeIntFile(fName,arr);
	            break;}
	            case 3:    DataStructurePrograms.dispFile(sortFile);
	            break;
	            default:System.out.println("Please enter an valid option");
	            break;
	            }
	        }
	    }

	}
	

