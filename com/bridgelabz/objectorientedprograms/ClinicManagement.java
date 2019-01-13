package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.util.DoctorManagement;
import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.PatientManagement;

public class ClinicManagement {
	String originfile="/home/admin1/Tharun/Bridgelabs/programs/JavaPrograms/";
	public static void main(String[] args) {
		System.out.println("-----Welcome to Clinical Management------");
		System.out.println("Do you want Details of ");
		System.out.println("1:Doctor Details");
	    System.out.println("2:Patient Details");
	    int choice=ObjectOrientedPrograms.readInteger();
	    switch (choice)
	    {
	    case 1:{
	    	DoctorManagement.doctorDetails();
	    	break;
	    }
	    case 2:
	    {
	    	PatientManagement.patientMang();
	    	break;
	    }
       default:
    	   System.out.println("Pls Enter the correct choice");
    	   break;
	}

	}}
