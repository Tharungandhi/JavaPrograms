package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class DoctorManagementDetails {
	static List<DoctorDetails> doctorlist=new ArrayList<DoctorDetails>();
	 static DoctorDetails doctor=null;
	 static int dfam=1;
	 
	public static  void addDoctor() {
		 doctor = new DoctorDetails();
		System.out.println("Enter the Doctor Name");
		String dname=ObjectOrientedPrograms.readString();
		doctor.setDoctorname(dname);
		
		System.out.println("Enter the Doctor ID");
		int did=ObjectOrientedPrograms.readInteger();
		doctor.setDoctorid(did);
		
		System.out.println("Enter the Doctor Specalization");
		String dspecial=ObjectOrientedPrograms.readString();
		doctor.setDoctorSpeciality(dspecial);
		
		System.out.println("Enter the Doctor Availability");
		String davl=ObjectOrientedPrograms.readString();
		doctor.setAvailabilty(davl);
		
		System.out.println("Is the Doctor Famous all around the word (1 or 0)");
	    int dfam=ObjectOrientedPrograms.readInteger();
		doctor.setFamous(dfam);
		
		doctorlist.add(doctor);
	}
	
	 public static void searchDoctor()
	 {
		 System.out.println("How do you want to search Doctor By");
	     System.out.println("1: Search Doctor By Doctor id");
	     System.out.println("2: Search Doctor By Name");
	     System.out.println("3: Search Doctor By Specialization");
	     System.out.println("4: Search Doctor By Availabilty");
	     int choice=ObjectOrientedPrograms.readInteger();
	     switch(choice)
	     {
	     case 1:{
	    	 searchByName();
	    	 break;  
	    	 }
	     case 2:
	     {
	    	 searchById();
	    	 break;
	     }
	     case 3:
	     {
	    	 searchBySpecialization();
	    	 break;
	    	 
	     }
	     case 4:
	     {
	    	 searchByAvailability();
	    	 break;
	     }
	     default:
	    	 System.out.println("Pls enter the correct choice");
	     }
	     }
	 
	 
	     
	 public static void searchByName() {
	     System.out.println("Enter the doctor's name to be searched");
	     String docName = ObjectOrientedPrograms.readString();
	     try {
	         for (DoctorDetails doctor : doctorlist) {
	             if (docName.equals(doctor.getDoctorname())) {
	                 System.out.println("entered "+docName + " is present");
	             }
	         }
	     } catch (Exception e) {
	         System.out.println("entered "+docName + " not found");
	     }}
	         
	 
	         public static void searchById()
	         {
	        	   
	        	        System.out.println("Enter the doctor's id to be searched");
	        	        int docid = ObjectOrientedPrograms.readInteger();
	        	        try {
	        	            for (DoctorDetails doctor : doctorlist) {
	        	                if (docid == doctor.getDoctorid()) {
	        	                    System.out.println("Doctor of id " + docid + " is present");
	        	                }
	        	            }
	        	        } catch (Exception e) {
	        	            System.out.println("Doctor of id " + docid + " is not present");
	        	        }
	        	 }
	         
	         
	         public static void searchBySpecialization() {
	             System.out.println("Enter the doctor's specialization to be searched");
	             String docspec = ObjectOrientedPrograms.readString();
	             try {
	                 for (DoctorDetails doctor : doctorlist) {
	                     if (docspec.equals(doctor.getDoctorSpeciality())) {
	                         System.out.println("Doctor of the " + docspec + " specialization is present");
	                     }
	                 }
	             } catch (Exception e) {
	                 System.out.println("Doctor of the " + docspec + " specialization is not present");
	             }
	         }
	         
	         
	         public static void searchByAvailability() {
	             System.out.println("Enter when you need the doctor (eg: am/pm)");
	             String docavl = ObjectOrientedPrograms.readString();
	             try {
	                 for (DoctorDetails doctor : doctorlist) {
	                     if (docavl.equals(doctor.getAvailabilty())) {
	                         System.out.println(doctor.getDoctorname() + " of id " + doctor.getDoctorid() + " is available");
	                     }
	                 }
	             } catch (Exception e) {
	                 System.out.println("No doctors are available at this hour");
	             } }
	         
	         
	         public static void famousDoctor()
	         {
	        	 try {
	        	 System.out.println("The Famous doctor present in the clinic");
	        	 for (DoctorDetails doctor : doctorlist) {
	        		 if(dfam==(doctor.getFamous())) {
	        			 System.out.println(doctor.getDoctorname() + "are famous doctors");
	        		 }
	        	 }
	        	 }
	         catch (Exception e) {
	        	 System.out.println("There are no famous doctor");
	         }}

	         
	         public static void famousSpecial() {
	        	 
	         }
}
