/******************************************************************************
 *  Compilation:  javac -d bin BinaryTree.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BinaryTree n
 *  
 *  Purpose: Number of Binary Search Tree
 *
 *  @author  Tharun Kumar
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStrucPrograms;

import com.bridgelabz.util.DataStructurePrograms;

public class BinayTree {
	/*
	* The main function is written to take input from the user
	* and to find how many binary search trees can be formed
	* from the entered number of nodes
	*/
	  public static void main(String[] args) { 
	        System.out.println("Enter the number of nodes");
	        int nodes=DataStructurePrograms.readInteger();
	        int[] intArr=new int[nodes];
	        for(int i=0;i<intArr.length;i++)
	        {
	        	System.out.println("Enter the "+i+" th number:");
	        	intArr[i]=DataStructurePrograms.readInteger();
	        }
	        double [] numbertimes=new double[intArr.length];
	        for(int i=0;i<intArr.length;i++)
	        {
	        	//Method 1- using function of Utility class of com.bridgelabz.util package
	        	numbertimes[i] = DataStructurePrograms.binaryCount(intArr[i]);
	        }
	         for(int i=0;i<numbertimes.length;i++)
	         {
	        	 System.out.println("Count of BST possibilities for "+  intArr[i] +" nodes is "+numbertimes[i]);
	         }
	} 

}
