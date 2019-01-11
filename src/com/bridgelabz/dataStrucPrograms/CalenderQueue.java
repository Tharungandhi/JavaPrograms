
/******************************************************************************
		 *  Compilation:  javac -d bin CalenderQueue.java
		 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.CalenderQueue n
		 *  
		 *  Purpose: Create the Week Object having a list of WeekDay objects each 
		 *  			storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . 
		 *  			The WeekDay objects are stored in a Queue implemented using 
		 *  			Linked List. Further maintain also a Week Object in a Queue to
		 *  			finally display the Calendar
		 *
		 *  @author  Tharun Kumar
		 *  @version 1.0
		 *  @since   5-12-2018
		 *
		 ******************************************************************************/

	package com.bridgelabz.dataStrucPrograms;

import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.QueueLinkedList;

public class CalenderQueue {
			/*
			* The main function is to take the input from the user 
			* and printing the calendar by using queue 
			*/
			public static void main(String[] args) {
				int month = Integer.parseInt(args[0]);
				int year = Integer.parseInt(args[1]);
				String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
						"October", "November", "December" };
				int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				if (month == 2 && DataStructurePrograms.isLeapYear(year)) {
					days[month] = 29;
				}
				System.out.println("\t\t " + months[month] + " " + year);
				System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");
				int dayofWeek = DataStructurePrograms.dayWeek(month, 1, year);
				QueueLinkedList<QueueLinkedList<Integer>> queue=new QueueLinkedList<QueueLinkedList<Integer>>();
				QueueLinkedList<Integer> refqueue=new QueueLinkedList<Integer>();
				
				
				for (int i = 1; i <= days[month]; i++) {
					refqueue.insert(i);
					if (((i + dayofWeek) % 7 == 0 || i==days[month]) ) {
						queue.insert(refqueue);
						refqueue=new QueueLinkedList<Integer>();
						continue;
					}
				}	
				for (int i = 0; i < dayofWeek; i++)
				System.out.print("\t");
				for(int i=0;i<=queue.getSize();i++)
				{
					QueueLinkedList<Integer> week=queue.remove();
					for(int j=0;j<week.getSize();j++)
					{
						System.out.print(week.remove()+"\t");
					}
					System.out.println();
				}

	}

}
