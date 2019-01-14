package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class Find {
	public List<DoctorDetails> FindByDoctorId ( List<DoctorDetails> doctorlist,int dID)  //search doctor by id
	{  
		List<DoctorDetails> temp=new ArrayList<DoctorDetails>();
		System.out.println(doctorlist);
		
		for(DoctorDetails d:doctorlist)
		{
			if(d.getDoctorid()==dID)
			{
				temp.add(d);
			}
		}
		return temp;	
	}

	public List<DoctorDetails> FindByDoctorName (ArrayList<DoctorDetails> doctorlist, String dn)   //search doctor by name
	{ 
		List<DoctorDetails> temp=new ArrayList<DoctorDetails>();
		
		for(DoctorDetails d:doctorlist)
		{
			if(d.getDoctorname()==dn)
			{
				temp.add(d);
			}
		}
		return temp;
	}

	public List<DoctorDetails> FindByDoctorava (ArrayList<DoctorDetails> doctorlist, String as)  //search doctor by availability
	{
		List<DoctorDetails> temp=new ArrayList<DoctorDetails>();
		
		for(DoctorDetails d:doctorlist)
		{
			if(d.getAvailabilty()==as)
			{
				temp.add(d);
			}
		}
			return temp;	
	}

	public ArrayList<PatientDetails> FindByPatientId (ArrayList<PatientDetails> patientlist, int fdid1)  //search patients by id
	{
		ArrayList<PatientDetails> temp=new ArrayList<PatientDetails>();

		for(PatientDetails p1:patientlist)
		{
			if(p1.getPatientid()==fdid1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

	public ArrayList<PatientDetails> FindBypatientName (ArrayList<PatientDetails> patientlist, String dn1)  //search patients by name
	{
		ArrayList<PatientDetails> temp=new ArrayList<PatientDetails>();
		
		for(PatientDetails p1:patientlist)
		{
			if(p1.getPatientname()==dn1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

	public ArrayList<PatientDetails> FindByPatientava (ArrayList<PatientDetails> patientlist, String as1)   //search patients by availability
	{	
		ArrayList<PatientDetails> temp=new ArrayList<PatientDetails>();
		
		for(PatientDetails p1:patientlist)
		{
			if(p1.getPhoneno()==as1)
			{
				temp.add(p1);
			}
		}
		return temp;
}
}
