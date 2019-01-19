package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.StockReport;

public class StockApplication {
 public static void main(String agrs[]) throws JsonGenerationException, JsonMappingException, IOException {
	 int ch=0;
do {
	 System.out.println("1:Stock details");
	 System.out.println("2:Display the Stock");
	 System.out.println("3:Value of each Stock");
	 System.out.println("4:total value of stock");
	 System.out.println("5:Do you want to exit ");
	 int choice=ObjectOrientedPrograms.readInteger();
	 switch(choice) {
	 
	 case 1:
	 {StockReport.addStock();
		 break;
	 }
	 case 2:{
		 StockReport.displayStock();
		 break;
	 }
	 case 3:
	 {
		 StockReport.valueOfEachStock();
		 break;
	 }
	 case 4:
	 {
		 StockReport.totalStockValue();
break;}
	 case 5:{
		 System.exit(0);
		 break;
	 }
	 default:
		 System.out.println("Pls eneter the proper choice");
		 
	 }
	ch++;
}while(ch<100);
}}
