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

	public static void main(String[] args) throws FileNotFoundException, IOException {
		DataStructurePrograms LinkedList=new DataStructurePrograms();
      
        LinkedList=DataStructurePrograms.readFileInt(LinkedList);
        DataStructurePrograms.printList(LinkedList);
        System.out.println("Given linked list"); 
        DataStructurePrograms.printList(LinkedList); 
        int len=LinkedList.size();
     int [] a1=	DataStructurePrograms.toIntConv(LinkedList);
 // System.out.println(a1);
  int [] a2=DataStructurePrograms.sortArray(a1);
  System.out.println(a2);
    } 
       
	
}
