
package com.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.QueueLinkedList;
import com.bridgelabz.util.StockCompanyShare;
import com.bridgelabz.util.StockList;

public class StockQueue {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException
    {
        String s=null;
        System.out.println("Select the option");
        System.out.println("1.Buy share\n2.Sell\n");
        QueueLinkedList<String> queue=new QueueLinkedList<String>();
        List<StockList> list=new ArrayList<StockList>();
        int opt=ObjectOrientedPrograms.readInteger();
        do
        {
            switch (opt)
            {
            case 1:
                System.out.println("Enter the fileName");
                StringBuffer sb1=new StringBuffer("/home/admin1/Tharun/Filesforjava/StockFiles/");
                String ss1=ObjectOrientedPrograms.readString();
                sb1.append(ss1);
                list=StockCompanyShare.displayStock1(sb1.toString());
                for(StockList stock:list) {
                    queue.insert(stock.getDate());
                    queue.insert(stock.getStockName());

                   
                }
                StockCompanyShare.displayStackQueueLinkedList(sb1.toString());
                break;

            default:
                break;
            }
            System.out.println("Do you want to continue? Y/N");
            s=ObjectOrientedPrograms.readString();
        }while(s.compareToIgnoreCase("y")==0);
    }
}
