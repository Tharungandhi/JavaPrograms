package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class Appointment {
	private String docName;
	   
    private List<PatientDetails> listOfPatients = new ArrayList<PatientDetails>();
   
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

   
    public List<PatientDetails> getListOfPatients() {
        return listOfPatients;
    }
   
    public void setListOfPatients(List<PatientDetails> listOfPatients) {
        this.listOfPatients = listOfPatients;
}
}

