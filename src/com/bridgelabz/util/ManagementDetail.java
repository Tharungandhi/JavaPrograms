package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class ManagementDetail {
	static Appointment newApp;
	static List<DoctorDetails> doctorlist=new ArrayList<DoctorDetails>();
	static HashMap<Appointment,Integer> appoint=new HashMap<Appointment,Integer>();
	static List<PatientDetails> patientlist=new ArrayList<PatientDetails>();
	 static PatientDetails patient=null;
	static DoctorDetails doctor=null;
	static int dfam=1;
	static Find f=new Find();

	public static  List<DoctorDetails> addDoctor() {
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
		System.out.println("Doctor is Succesfully addded to the list");
		return doctorlist;
		
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
			searchByNameDoctor();
			break;  
		}
		case 2:
		{
			searchByDoctorId();
			break;
		}
		case 3:
		{
			searchByDoctorSpecialization();
			break;

		}
		case 4:
		{
			searchByDoctorAvailability();
			break;
		}
		default:
			System.out.println("Pls enter the correct choice");
		}
	}



	public static void searchByNameDoctor() {
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


	public static void searchByDoctorId()
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


	public static void searchByDoctorSpecialization() {
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


	public static void searchByDoctorAvailability() {
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
	public static void takeAppointment(List<DoctorDetails> doctorlist1)
	{
		System.out.println("Enter Docotor Id ");
		int did=ObjectOrientedPrograms.readInteger();
		List<DoctorDetails> doc=new ArrayList<DoctorDetails>();

	 doc=f.FindByDoctorId(doctorlist1, did);
		if(doc!=null)
		{
			if(doc.size()>=1)
			{
				System.out.println("Enter Date of Appointment(eg.10/06/2016): ");
				Date date=ObjectOrientedPrograms.printDate(ObjectOrientedPrograms.readString());
				if(date==null)
					System.out.println("Date format is not correct");
				//Checking for availability of doctors
				else	{
					 newApp=new Appointment(did, date);
					if(!appoint.containsKey(newApp))
					{
						System.out.println("We are here");

						//already some appointment is there on that date
						Integer appointment=appoint.get(newApp);
						if(appointment<6)
						{
							//Appointment on given date is less then 5
							appointment++;
							appoint.put(newApp,appointment);
							System.out.println("Appointment Scheduled on "+date.toString()+" "+" with Doctor Id"+did);
						}
						else
							//On given date appointment is more then 5
							System.out.println("Doctor is not avilable Please Select Another Date"); 
					}
					else
						//No appointment is there on given date
						appoint.put(newApp,1);}
			}}
		else {
			System.out.println("Invalid Doctor Id");
		}
	}
//print appointment
	public static void printAppointment() {
		System.out.println("Printing All Appointments...");
		appoint.putAll(appoint);
		System.out.println(appoint);
	}
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
			displayPatient();
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
	 public static List<PatientDetails> addPatient()
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
		 System.out.println("Patient is succesfully added to the list");
	     return patientlist;
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
	 public static void displayPatient()
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
	 public static void displayDoctor()
	 {
		 if(!doctorlist.isEmpty())
		 {
			 for(DoctorDetails pd :doctorlist)
			 {
				 System.out.println("DoctorID :" + pd.getDoctorid());
				 System.out.println("Doctor Name :" + pd.getDoctorname());
				 System.out.println("Doctor Availablity :" + pd.getAvailabilty());
				 System.out.println("Doctor Speciality :" + pd.getDoctorSpeciality());
				 System.out.println("------------------------------");
			 } }
		 else
			 System.out.println("There are No Patient to display");
	 }
	 public static void writelistDoctor(String json) throws IOException
		{
			FileWriter file = new FileWriter("/home/admin1/Tharun/Filesforjava/doctor.json");
			@SuppressWarnings("resource")
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write(json);
			buffer.flush();
		}
	 public static void writelistPatient(String json) throws IOException
		{
			FileWriter file = new FileWriter("/home/admin1/Tharun/Filesforjava/patient.json");
			@SuppressWarnings("resource")
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write(json);
			buffer.flush();
		}
	 
	 public static void writelistAppointment(String json) throws IOException
		{
			FileWriter file = new FileWriter("/home/admin1/Tharun/Filesforjava/appointment.json");
			@SuppressWarnings("resource")
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write(json);
			buffer.flush();
		}
	 public static String readFile(String message) throws FileNotFoundException {
			FileReader f = new FileReader(message);
			@SuppressWarnings("resource")
			BufferedReader read = new BufferedReader(f);
			String line = "";
			try {
				String word="";
				while ((word = read.readLine()) != null) {
					line = word;
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return line;
		}
	 
	 public static void displayList() throws JsonParseException, JsonMappingException, IOException
	 {
		 System.out.println("1: list of Pateint ");
		 System.out.println("2:list of Doctor ");
		 
		 switch (ObjectOrientedPrograms.readInteger()) {
		case 1:displayPaList();
			
			break;
	case 2:displayDoList();
			
			break;
		default:System.out.println("Enter valid option");
			break;
		}
	 }
	 public static  List<DoctorDetails> displayDoList() throws JsonParseException, JsonMappingException, IOException
		{ObjectMapper objectmapper=new ObjectMapper();
		 String string = ObjectOrientedPrograms.readFile("/home/admin1/Tharun/Filesforjava/doctor.json");
			doctorlist = objectmapper.readValue(string, new TypeReference<List<DoctorDetails>>() {
			});
			return doctorlist;
		}
	 public static  void displayPaList()
		{
			
		}
	 
	 
	 
}

