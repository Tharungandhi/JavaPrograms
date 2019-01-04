package com.bridgelabz.dataStrucPrograms;

import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.DataStructurePrograms.BinaryTree;

public class BinayTree {

	public static void main(String[] args) {
		System.out.println("enter the number of nodes ");
		int nodes=DataStructurePrograms.readInteger();
        int count1;
        
        // find count of BST and  
        count1 = BinaryTree.countBST(nodes); 
      
        // print count of BST  with n nodes
        System.out.println("Count of BST with "+ nodes +" nodes is "+ count1);
    }

}
