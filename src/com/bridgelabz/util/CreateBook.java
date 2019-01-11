package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class CreateBook {
	static List<PersonalDetails> persondetails=new ArrayList<PersonalDetails>();
	public static AddressDetails addAddress()
	{
		AddressDetails address=new AddressDetails();
		System.out.println("enter the Street");
		String strt=ObjectOrientedPrograms.readString();
		address.setStreet(strt);
		System.out.println("enter the City");
		String city=ObjectOrientedPrograms.readString();
		address.setCity(city);
		System.out.println("enter the State");
		String state=ObjectOrientedPrograms.readString();
		address.setState(state);
		System.out.println("enter the Zipcode");
		long zcode=ObjectOrientedPrograms.readlong();
		address.setZipcode(zcode);
		return address;
	}

	@SuppressWarnings("unchecked")
	public static PersonalDetails personalDetails()
	{
		PersonalDetails person=new PersonalDetails();
		System.out.println("enter the firstname");
		String fname=ObjectOrientedPrograms.readString();
		person.setFirstname(fname);
		
		System.out.println("enter the lastname");
		String lname=ObjectOrientedPrograms.readString();
		person.setLastname(lname);
		
		System.out.println("enter the address details");
	   AddressDetails address=CreateBook.addAddress();
		person.setAddress(address);
		
		System.out.println("enter the phoneno");
		long phoneno=ObjectOrientedPrograms.readlong();
		person.setPhoneNumber(phoneno);
		persondetails=(List<PersonalDetails>) CreateBook.personalDetails();
		return (PersonalDetails) persondetails;
	}
	
//	public static void editPerson()
//	{
//		System.out.println("Enter the firstname");
//		String fname=ObjectOrientedPrograms.readString();
//		System.out.println("Enter the lastname");
//		String lname=ObjectOrientedPrograms.readString();
//	}
	
}
