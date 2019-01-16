package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.StockCompanyShare;

public class StockShare{

	
		 public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
			        boolean run=true;
			        while(run==true)
			        {
			            System.out.println(" 1: Buy Share\n 2: Sell share\n 3: Save\n 4: Print ");
			            System.out.println("\n");
			            switch (ObjectOrientedPrograms.readInteger()) {
			            case 1:StockCompanyShare.buyStock();
			            break;
			            case 2:StockCompanyShare.sellStock();
			            break;
			            case 3:StockCompanyShare.save();
			            break;
			            case 4:StockCompanyShare.printStock();
			            break;
//			            case 5:System.out.println("Enter the fileName");
//			            StringBuffer sb1=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles/");
//			            String ss1=ObjectOrientedPrograms.readString();
//			            sb1.append(ss1);
//			            Example.displayStackQueueLinkedList(sb1.toString());
//			            break;
			            default:System.out.println("Please enter the valid option");
			            break;
			            }
			            run=true;break;	}}
}
