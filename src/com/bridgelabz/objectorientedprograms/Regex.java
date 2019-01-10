package com.bridgelabz.objectorientedprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.Algorithmprograms;
import com.bridgelabz.util.ObjectOrientedPrograms;

public class Regex {

	public static void main(String[] args) throws IOException {
		String file ="/home/admin1/Desktop/Regex.text";
		String Message=ObjectOrientedPrograms.readFile(file);
			System.out.println("Enter the name");
			String firstname=ObjectOrientedPrograms.readString();
			System.out.println("Enter the last name");
			String lastname=ObjectOrientedPrograms.readString();
			String fullname=firstname + lastname;
			System.out.println("Enter the mobile number");
			String mobileno=ObjectOrientedPrograms.readString();
			String date=ObjectOrientedPrograms.currentDate();
		  String modifiedmsg=ObjectOrientedPrograms.modifiedMessage(firstname,fullname,mobileno,date,Message);
          System.out.println( modifiedmsg);
}}

