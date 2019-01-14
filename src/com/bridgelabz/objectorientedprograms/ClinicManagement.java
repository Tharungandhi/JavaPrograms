package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.util.AddressBook;
import com.bridgelabz.util.DoctorDetails;
import com.bridgelabz.util.DoctorManagement;
import com.bridgelabz.util.ManagementDetail;
import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.PatientDetails;
import com.bridgelabz.util.PatientManagement;

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
	    System.out.println("4: Print Appointment");
	    System.out.println("5: Do you want to search Doctor");
	    System.out.println("6: Do you want to search patient");
	    System.out.println("7: Do you want to known famous doctor");
	    System.out.println("8: Display Doctorlist or Patientlist");
	    System.out.println("5:Exit from the clinic");
	    int choice=ObjectOrientedPrograms.readInteger();
	    switch (choice)
	    {
	    case 1:{
	    	 doctorlist1= (List<DoctorDetails>) ManagementDetail.addDoctor();
	    	ManagementDetail.displayDoctor();
	    	String json = objectmapper.writeValueAsString(doctorlist1);
         	ManagementDetail.writelistDoctor(json);
         	break;
	    }
	    case 2:
	    {
	    	 patientlist1=(List<PatientDetails>) ManagementDetail.addPatient();
	    	ManagementDetail.displayPatient();
	    	String json = objectmapper.writeValueAsString(patientlist1);
         	ManagementDetail.writelistPatient(json);
	    	break;
	    }
	    case 3:
	    {
	    	doctorlist1=ManagementDetail.displayDoList();
	    	ManagementDetail.takeAppointment(doctorlist1);
	    	
	    	break;
	    }
	    case 4:
	    {
	    	ManagementDetail.printAppointment();
	    break;
	    }
	    case 5:
	    {
	    	ManagementDetail.searchDoctor();
	    	break;
	    }
	    case 6:
	    {
	    	ManagementDetail.searchpatient();
	    	break;
	    	
	    }
	    case 7:
	    {
	    	System.exit(0);
	     break;
	    }
	    case 8:
	    {
	    	
	    }
       default:
    	   System.out.println("Pls Enter the correct choice");
    	   break;}
	    ch++;
	    }
	while(ch<100);
	}}
