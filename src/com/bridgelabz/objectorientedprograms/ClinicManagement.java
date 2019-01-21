package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.util.DoctorDetails;
import com.bridgelabz.util.ManagementDetail;
import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.PatientDetails;

public class ClinicManagement {
	String originfile="/home/admin1/Tharun/Bridgelabs/programs/JavaPrograms/";
	static List<DoctorDetails> doctorlist1=new ArrayList<DoctorDetails>();
	static List<PatientDetails> patientlist1=new ArrayList<PatientDetails>();
	static PatientDetails patient=new PatientDetails();
	static DoctorDetails doctor =new DoctorDetails();
	static ObjectMapper objectmapper=new ObjectMapper();
	static int ch=0;
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("-----Welcome to Clinical Management------");
		System.out.println("Do you want Details of ");
		do {
		System.out.println("1: Add Doctor");
	    System.out.println("2: Add Patient");
	    System.out.println("3: Take Appointment");
	    System.out.println("4: Search Doctor");
	    System.out.println("5: Search patient");
	    System.out.println("6: Famous doctor");
	    System.out.println("7: Famous Specialist");
	    System.out.println("8: Exit from the clinic");
	    int choice=ObjectOrientedPrograms.readInteger();
	    switch (choice)
	    {
	    case 1:{
	    	ManagementDetail.addDoctor();
         	break;
	    }
	    case 2:
	    {
	    	 ManagementDetail.addPatient();
	    	break;
	    }
	    case 3:
	    {
	    	
	    	ManagementDetail.takeAppointment();	
	    	break;
	    }
	    case 4:
	    {
	    	ManagementDetail.searchDoctor();
	    	break;
	    }
	    case 5:
	    {
	    	ManagementDetail.searchpatient();
	    	break;
	    	
	    }
	    case 6:
	    {
	    	ManagementDetail.famousDoctor();
	     break;
	    }
	    case 7:
	    {
	    	ManagementDetail.famousSpecialist();
	    }
	    case 8:
	    {
	    	System.exit(0);
	    	break;
	    }
       default:
    	   System.out.println("Pls Enter the correct choice");
    	   break;}
	    ch++;
	    }
	while(ch<100);
	}}
