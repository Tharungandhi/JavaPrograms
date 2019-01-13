package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class DoctorManagement {
 
 
 public static void doctorDetails()
 {
	 System.out.println(" 1:Do you want to add Doctor");
	 System.out.println(" 2:Do you want to search Doctor");
	 System.out.println(" 3:Do you want to know famous doctor in the clinic");
	 System.out.println(" 4:Do you want to know most famous specialist in clinic");
	 int option=ObjectOrientedPrograms.readInteger();
	 switch(option)
	 {
	 case 1:{
		 DoctorManagementDetails.addDoctor();
		 break;
	 }
	 case 2:{
		 DoctorManagementDetails.searchDoctor();
		 break;
	 }
	 case 3:{
		 break;
	 }
	 case 4:
	 {
		 break;
	 }
	 }
		 
 }}
