package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class PatientManagement {
 static List<PatientDetails> patientlist=new ArrayList<PatientDetails>();
 static PatientDetails patient=null;
 
 public static void patientMang() {
	System.out.println("1:Do you want to add Patient");
	System.out.println("2: Do you want to search a Patient");
	int option=ObjectOrientedPrograms.readInteger();
	switch(option)
	{
	case 1:
	{
		addPatient();
		System.out.println("The Patient is sucessfully added ");
		display();
		break;
	}
	case 2:
	{
		searchpatient();
		System.out.println();
	}
	default:
		System.out.println("Pls Enter the correct choice");
	}

}
 public static void addPatient()
 {
	 patient=new PatientDetails();
	 System.out.println("Enter the Patient id");
	 int pid=ObjectOrientedPrograms.readInteger();
	 patient.setPatientid(pid);
	 System.out.println("Enter the Patient name");
	 String pname=ObjectOrientedPrograms.readString();
	 patient.setPatientname(pname);
	 System.out.println("Enter the Patient age");
	 int page=ObjectOrientedPrograms.readInteger();
	 patient.setPatientage(page);
	 System.out.println("Enter the Phone No");
	 String phoneno=ObjectOrientedPrograms.readString();
	 patient.setPhoneno(phoneno);
	 patientlist.add(patient);
}
 
 public static void searchpatient()
 {
	 System.out.println("1: Search Patient by Patient ID" );
	 System.out.println("2: Search Patient by Phone no");
	 int choice=ObjectOrientedPrograms.readInteger();
	 switch (choice)
	 {
	 case 1:
	 {
		 searchByID();
		 break;
	 }
	 case 2:
	 {
		 searchByPhoneno();
		 break;
		
	 }
	 default:
		 System.out.println("Pls eneter the correct choice");
		 
	 }
 }
 public static void searchByID() {

     System.out.println("Enter the patient's id to be searched");
     int patid = ObjectOrientedPrograms.readInteger();
     try {
         for (PatientDetails patient : patientlist) {
             if (patid == patient.getPatientid()) {
                 System.out.println("patient of id " + patid + " is present");
             }
         }
     } catch (Exception e) {
         System.out.println("patient of id " + patid + " is not present");
     }
 }
 
 
 
 public static void searchByPhoneno()
 {
	 System.out.println("enter the patient's phone no to be searched");
	 String ppn=ObjectOrientedPrograms.readString();
	 try {
		 for(PatientDetails patient : patientlist) {
			 if(ppn==patient.getPhoneno()) {
				 System.out.println("patient of phone number" + ppn+"is present");
			 }
		 }
	 }catch(Exception e) {
		 System.out.println("patient of phone number" + ppn+"is not present");
	 }
 }
 public static void display()
 {
	 if(!patientlist.isEmpty())
	 {
		 for(PatientDetails pd :patientlist)
		 {
			 System.out.println("PatientID :" + pd.getPatientid());
			 System.out.println("Patient Name :" + pd.getPatientname());
			 System.out.println("Patient Age :" + pd.getPatientage());
			 System.out.println("Patient PhoneNo :" + pd.getPhoneno());
			 System.out.println("------------------------------");
		 } }
	 else
		 System.out.println("There are No Patient to display");
 }
 
}
