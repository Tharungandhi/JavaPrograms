package com.bridgelabz.dataStrucPrograms;

import com.bridgelabz.util.DataStructurePrograms;
import com.bridgelabz.util.DataStructurePrograms.Calender2DArray;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter month");
		int m = DataStructurePrograms.readInteger();
		System.out.println("enter yaer");
		int y = DataStructurePrograms.readInteger();
     
		
		Calender2DArray.dispCalender(m, y);
	}

}
