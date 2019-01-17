package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class ManagementDetail {
	static Appointment newApp;
	static List<DoctorDetails> doctorList=new ArrayList<DoctorDetails>();
	static List<Appointment> appointList=new ArrayList<Appointment>();
	static List<PatientDetails> patientList=new ArrayList<PatientDetails>();
	static String doctorFile="/home/admin1/Tharun/Filesforjava/doctor.json";
	static String patientFile="/home/admin1/Tharun/Filesforjava/patient.json";
	static String appointmentFile="/home/admin1/Tharun/Filesforjava/appointment.json";
	 static PatientDetails patient=null;
	static DoctorDetails doctor=null;
	static int dfam=1;
	static Find f=new Find();

	public static  void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {
		String string = ObjectOrientedPrograms.readFile(doctorFile);
        try {
        	doctorList = ObjectOrientedPrograms.userReadValue(string, DoctorDetails.class);
            System.out.println("File is not empty!");
        } catch (Exception e) {
            System.out.println("File is empty!");
        }
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

		doctorList.add(doctor);
		System.out.println("Doctor is Succesfully addded to the list");
		System.out.println("Doctor added successfully!!!");
		displayDoctor(doctorList);
		String json = ObjectOrientedPrograms.userWriteValueAsString(doctorList);
        ObjectOrientedPrograms.writeFile(json, doctorFile);
		
	}
	public static void addPatient() throws JsonGenerationException, JsonMappingException, IOException
	 {
		 String string = ObjectOrientedPrograms.readFile(patientFile);
	        try {
	        	patientList = ObjectOrientedPrograms.userReadValue(string, PatientDetails.class);
	            System.out.println("File is not empty!");
	        } catch (Exception e) {
	            System.out.println("File is empty!");
	        }
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
		 patientList.add(patient);
		 System.out.println("Patient is succesfully added to the list");
		 displayPatient();
			String json = ObjectOrientedPrograms.userWriteValueAsString(patientList);
	        ObjectOrientedPrograms.writeFile(json, patientFile);
	 }
	public static void searchDoctor() throws IOException
	{
		System.out.println("How do you want to search Doctor By");
		int ch=0;
		do {
		System.out.println("1: Search Doctor By Doctor id");
		System.out.println("2: Search Doctor By Name");
		System.out.println("3: Search Doctor By Specialization");
		System.out.println("4: Search Doctor By Availabilty");
		int choice=ObjectOrientedPrograms.readInteger();
		switch(choice)
		{
		case 1:{
			System.out.println("Searching by Doctor id");
            List<DoctorDetails> doctor1 = searchByDoctorId();
            if (!doctor1.isEmpty())
                System.out.println("Doctor is present");
            else
                System.out.println("Doctor is not present");
			
			break;  
		}
		case 2:
		{System.out.println("Searching by name");
        List<DoctorDetails> doctor2 = searchByDoctorId();
        if (!doctor2.isEmpty())
            System.out.println("Doctor is present");
        else
            System.out.println("Doctor is not present");
			
			break;
		}
		case 3:
		{
			System.out.println("Searching by Specialization");
	        List<DoctorDetails> doctor3 = searchByDoctorSpecialization();
	        if (!doctor3.isEmpty())
	            System.out.println("Doctor is present");
	        else
	            System.out.println("Doctor is not present");
			
			break;

		}
		case 4:
		{
			System.out.println("Searching by Availability");
	        List<DoctorDetails> doctor4 = searchByDoctorAvailability();
	        if (!doctor4.isEmpty())
	            System.out.println("Doctor is present");
	        else
	            System.out.println("Doctor is not present");
			
			break;
		}
		default:
			System.out.println("Pls enter the correct choice");
		}ch++;}while(ch<100);
	}

		public static  List<DoctorDetails> searchByName() throws IOException {
		        String string = ObjectOrientedPrograms.readFile(ManagementDetail.doctorFile);
		        try {
		        	doctorList = ObjectOrientedPrograms.userReadValue(string, DoctorDetails.class);
		            List<DoctorDetails> list = new ArrayList<>();
		            System.out.println("Enter the doctor's name to be searched");
		            String name = ObjectOrientedPrograms.readString();
		            System.out.println(name);
		            for (DoctorDetails doctor : doctorList) {
		                if (name.equals(doctor.getDoctorname())) {
		                    list.add(doctor);
		                }
		            }
		            return list;
		        } catch (Exception e) {
		            System.out.println("File is empty!");
		            return null;
		        }

		    }
	
		 public static List<DoctorDetails> searchByDoctorId() throws IOException {
		        String string = ObjectOrientedPrograms.readFile(doctorFile);
		        try {
		        	doctorList = ObjectOrientedPrograms.userReadValue(string, DoctorDetails.class);
		            List<DoctorDetails> list = new ArrayList<>();
		            System.out.println("Enter the doctor's id to be searched");
		            int id = ObjectOrientedPrograms.readInteger();
		            for (DoctorDetails doctor : doctorList) {
		                if (id == doctor.getDoctorid()) {
		                    list.add(doctor);

		                }
		            }
		            return list;
		        } catch (Exception e) {
		            System.out.println("File is empty! Doctor cannot be searched");
		            return null;
		        }

		    }

	public static List<DoctorDetails> searchByDoctorSpecialization() {
		System.out.println("Enter the doctor's specialization to be searched");
		String docspec = ObjectOrientedPrograms.readString();
		try {
			for (DoctorDetails doctor : doctorList) {
				if (docspec.equals(doctor.getDoctorSpeciality())) {
					System.out.println("Doctor of the " + docspec + " specialization is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Doctor of the " + docspec + " specialization is not present");
		}
		return null;
	}


	public static List<DoctorDetails> searchByDoctorAvailability() {
		System.out.println("Enter when you need the doctor (eg: am/pm)");
		String docavl = ObjectOrientedPrograms.readString();
		try {
			for (DoctorDetails doctor : doctorList) {
				if (docavl.equals(doctor.getAvailabilty())) {
					System.out.println(doctor.getDoctorname() + " of id " + doctor.getDoctorid() + " is available");
				}
			}
		} catch (Exception e) {
			System.out.println("No doctors are available at this hour");
		}
		return null; }

	 public static void takeAppointment() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(appointmentFile);
	        try {
	        	appointList = ObjectOrientedPrograms.userReadValue1(string, Appointment.class);
	            System.out.println("File is not empty");

	        } catch (Exception e) {
	            System.out.println("File is empty");
	        }
	        PatientDetails patient = ManagementDetail.searchByPhoneno();
	        if (patient != null) {
	            System.out.println("Patient data already exist!!\nTaking appointment now....");
	            appoint(patient);
	            String json = ObjectOrientedPrograms.userWriteValueAsString(appointList);
	            ObjectOrientedPrograms.writeFile(json, appointmentFile);
	        } else {
	            System.out.println("Patient data doesnot exist\nPlease first add patient detials on to database");
	        }
	    }

	 
	 
	 public static void searchpatient()
	 {
		 System.out.println("1: Search Patient by Patient ID" );
		 System.out.println("2: Search Patient by Phone no");
		 int choice=ObjectOrientedPrograms.readInteger();
		 switch (choice)
		 {
		 case 1:
		 {System.out.println("Searching by ID");
	        List<PatientDetails> patient =  searchByID();
	        if (!patient.isEmpty())
	            System.out.println("Doctor is present");
	        else
	            System.out.println("Doctor is not present");
				
			
			 break;
		 }
		 case 2:
		 {
			 System.out.println("Searching by ID");
		        List<PatientDetails> patient1 =  (List<PatientDetails>) searchByPhoneno();
		        if (!patient1.isEmpty())
		            System.out.println("Doctor is present");
		        else
		            System.out.println("Doctor is not present");
			
			 break;
			
		 }
		 default:
			 System.out.println("Pls eneter the correct choice");
			 
		 }
	 }
	 public static List<PatientDetails> searchByID() {

	     System.out.println("Enter the patient's id to be searched");
	     int patid = ObjectOrientedPrograms.readInteger();
	     try {
	         for (PatientDetails patient : patientList) {
	             if (patid == patient.getPatientid()) {
	                 System.out.println("patient of id " + patid + " is present");
	             }
	         }
	     } catch (Exception e) {
	         System.out.println("patient of id " + patid + " is not present");
	     }
		return null;
	 }
	 
	 
	 
	 public static PatientDetails searchByPhoneno()
	 {
		 System.out.println("enter the patient's phone no to be searched");
		 String ppn=ObjectOrientedPrograms.readString();
		 try {
			 for(PatientDetails patient : patientList) {
				 if(ppn==patient.getPhoneno()) {
					 System.out.println("patient of phone number" + ppn+"is present");
				 }
			 }
		 }catch(Exception e) {
			 System.out.println("patient of phone number" + ppn+"is not present");
		 }
		return patient;
	 }
	 public static void displayPatient()
	 {
		 if(!patientList.isEmpty())
		 {
			 for(PatientDetails pd :patientList)
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
	 public static void displayDoctor(List<DoctorDetails> doctorList1)
	 {
		 if(!doctorList.isEmpty())
		 {
			 for(DoctorDetails pd :doctorList)
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
			doctorList = objectmapper.readValue(string, new TypeReference<List<DoctorDetails>>() {
			});
			return doctorList;
		}
	 public static  List<PatientDetails> displayPaList() throws JsonParseException, JsonMappingException, IOException
		{ObjectMapper objectmapper=new ObjectMapper();
		 String string = ObjectOrientedPrograms.readFile("/home/admin1/Tharun/Filesforjava/patient.json");
		 patientList = objectmapper.readValue(string, new TypeReference<List<DoctorDetails>>() {
			});
			return patientList;
		}
	    public static void famousDoctor() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(appointmentFile);
	        java.util.Map<String, Integer> map = new HashMap<>();
	        try {
	        	appointList = ObjectOrientedPrograms.userReadValue(string, Appointment.class);
	            for (int i = 0; i < appointList.size(); i++) {
	                Appointment appointment = appointList.get(i);
	                String doctorName = appointment.getDocName();
	                Integer numberOfAppointments = appointment.getListOfPatients().size();
	                map.put(doctorName, numberOfAppointments);
	            }
	            int maxValue = Collections.max(map.values());
	            for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
	                if (entry.getValue() == maxValue) {
	                    System.out.println(
	                            "Famous Doctor Name: " + entry.getKey() + "\nNo of appointments: " + entry.getValue());
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("There are no doctors in the Hospital system.");
	        }
	    }

	    public static void famousSpecialist() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(doctorFile);
	        List<String> list = new ArrayList<>();
	        try {
	        	doctorList = ObjectOrientedPrograms.userReadValue(string, DoctorDetails.class);
	            for (DoctorDetails doctor : doctorList) {
	                for (DoctorDetails doctor1 : doctorList) {
	                    if (doctor.getDoctorSpeciality().equals(doctor1.getDoctorSpeciality())) {
	                        list.add(doctor.getDoctorSpeciality());
	                    }
	                }
	            }
	            int max = 0;
	            int curr = 0;
	            String currKey = null;
	            Set<String> unique = new HashSet<String>(list);
	            for (String key : unique) {
	                curr = Collections.frequency(list, key);
	                if (max < curr) {
	                    max = curr;
	                    currKey = key;
	                }
	            }
	            System.out.println(currKey + " is the famous specialization.");
	        } catch (Exception e) {
	            System.out.println("There are no doctors in the Hospital system.");
	        }
	    }
	    public static void searchDoctor(List<DoctorDetails> doctorList, PatientDetails patient) {
	        System.out.println("Enter id");
	        int id = ObjectOrientedPrograms.readInteger();
	        try {
	            for (DoctorDetails doctor : doctorList) {
	                if (id == doctor.getDoctorid()) {
	                    for (Appointment appointment : appointList) {
	                        if (doctor.getDoctorname().equals(appointment.getDocName())) {
	                            List<PatientDetails> patientAppointmentList = appointment.getListOfPatients();
	                            if (patientAppointmentList.size() < 5) {
	                                patientAppointmentList.add(patient);
	                                appointment.setListOfPatients(patientAppointmentList);
	                                System.out.println("Appointment is set");
	                                break;
	                            } else {
	                                System.out.println(
	                                        "Appointment is full !!! Please wait for the next schedule or Select different doctor");

	                            }
	                            break;
	                        } else {
	                            Appointment newAppointment = new Appointment();
	                            newAppointment.setDocName(doctor.getDoctorname());
	                            List<PatientDetails> newPatientAppointmentList = new ArrayList<>();
	                            newPatientAppointmentList.add(patient);
	                            newAppointment.setListOfPatients(newPatientAppointmentList);
	                            appointList.add(newAppointment);
	                            System.out.println("Appointment is set");

	                        }
	                    }
	                    if (appointList.size() == 0) {
	                        Appointment appointment2 = new Appointment();
	                        List<PatientDetails> patientList1 = new ArrayList<PatientDetails>();
	                        patientList1.add(patient);
	                        appointment2.setDocName(doctor.getDoctorname());
	                        appointment2.setListOfPatients(patientList1);
	                        appointList.add(appointment2);
	                        System.out.println("Appointment is set");
	                    }

	                }
	            }

	        } catch (Exception e) {
	            System.out.println("Enter the correct id");
	        }
	    }
	    public static List<DoctorDetails> searchById() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(doctorFile);
	        try {
	        	doctorList = ObjectOrientedPrograms.userReadValue(string, DoctorDetails.class);
	            List<DoctorDetails> list = new ArrayList<>();
	            System.out.println("Enter the doctor's id to be searched");
	            int id = ObjectOrientedPrograms.readInteger();
	            for (DoctorDetails doctor : doctorList) {
	                if (id == doctor.getDoctorid()) {
	                    list.add(doctor);

	                }
	            }
	            return list;
	        } catch (Exception e) {
	            System.out.println("File is empty! Doctor cannot be searched");
	            return null;
	        }

	    }
	    public static List<DoctorDetails> searchBySpecialization() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(doctorFile);
	        try {
	            doctorList = ObjectOrientedPrograms.userReadValue(string, DoctorDetails.class);
	            List<DoctorDetails> list = new ArrayList<>();
	            System.out.println("Enter the doctor's name to be searched");
	            String specialization = ObjectOrientedPrograms.readString();
	            for (DoctorDetails doctor : doctorList) {
	                if (specialization.equals(doctor.getDoctorSpeciality())) {
	                    list.add(doctor);
	                }
	            }

	            return list;
	        } catch (Exception e) {
	            System.out.println("File is empty! Doctor cannot be searched");
	            return null;
	        }

	    }
	    public static List<DoctorDetails> searchByAvailability() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(doctorFile);
	        try {
	            doctorList = ObjectOrientedPrograms.userReadValue(string, DoctorDetails.class);
	            List<DoctorDetails> list = new ArrayList<>();
	            System.out.println("Enter when you need the doctor (eg: am/pm)");
	            String availability = ObjectOrientedPrograms.readString();
	            for (DoctorDetails doctor : doctorList) {
	                if (availability.equals(doctor.getAvailabilty())) {
	                    list.add(doctor);
	                }
	            }
	            return list;
	        } catch (Exception e) {
	            System.out.println("File is empty! Doctor cannot be searched");
	            return null;
	        }

	    }
	    public static PatientDetails searchByPatientId() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(patientFile);
	        patientList = ObjectOrientedPrograms.userReadValue(string, PatientDetails.class);
	        System.out.println("Enter the patient's id to be searched");
	        int id = ObjectOrientedPrograms.readInteger();
	        for (PatientDetails patient : patientList) {
	            if (id == patient.getPatientid()) {
	                return patient;
	            }
	        }
	        return null;
	    }
	    public static PatientDetails searchByPhoneNo() throws IOException {
	        String string = ObjectOrientedPrograms.readFile(patientFile);
	        patientList = ObjectOrientedPrograms.userReadValue(string, PatientDetails.class);
	        System.out.println("Enter the patient's phone number to search");
	        String phoneNo = ObjectOrientedPrograms.readString();

	        for (PatientDetails patient : patientList) {
	            if (phoneNo == patient.getPhoneno()) {
	                return patient;
	            }
	        }
	        return null;
	    }

	    public static void appoint(PatientDetails patient) throws IOException {
	        System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
	        int choice = ObjectOrientedPrograms.readInteger();
	        switch (choice) {
	        case 1:
	            List<DoctorDetails> doctorList = searchByName();
	            displayDoctor(doctorList);
	            searchDoctor(doctorList, patient);
	            break;
	        case 2:
	            List<DoctorDetails> doctorList1 = searchBySpecialization();
	            displayDoctor(doctorList1);
	            searchDoctor(doctorList1, patient);
	            break;
	        case 3:
	            List<DoctorDetails> doctorList2 = searchByAvailability();
	            displayDoctor(doctorList2);
	            searchDoctor(doctorList2, patient);
	            break;
	        }
	    }
}

