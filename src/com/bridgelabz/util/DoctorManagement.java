package com.bridgelabz.util;

import java.io.File;
import java.util.List;

public class DoctorManagement {
 
	static String originfile="/home/admin1/Tharun/Bridgelabs/programs/JavaPrograms/";
 public static void doctorDetails()
 { int ch=0;
	 do {
	 System.out.println(" 1:Do you want to add Doctor");
	 System.out.println(" 2:Do you want to search Doctor");
	 System.out.println(" 3:Do you want to know famous doctor in the clinic");
	// System.out.println(" 4:Do you want to know most famous specialist in clinic");
	 int option=ObjectOrientedPrograms.readInteger();
	 switch(option)
	 {
	 case 1:{
		 DoctorManagementDetails.addDoctor();
		 File file = new File(originfile);
		 break;
	 }
	 case 2:{
		 DoctorManagementDetails.searchDoctor();
		 break;
	 }
	 case 3:{
		 DoctorManagementDetails.famousDoctor();
		 break;
	 }
	default :
		System.out.println("PLs eneter the proper choice");
		break;
	 }ch++;}
	 while(ch>50);
		 
 }}
