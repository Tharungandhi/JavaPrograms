package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddressBook {
	static List<PersonalDetails> persondetails=new ArrayList<PersonalDetails>();
	static PersonalDetails person=null;
	static List<AddressDetails> AddressDetails=new ArrayList<AddressDetails>();
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
		AddressDetails.add(address);
		return address;
	}

	public static void personalDetails(List<PersonalDetails> persondetails2)
	{
		person=new PersonalDetails();
		System.out.println("enter the firstname");
		String fname=ObjectOrientedPrograms.readString();
		person.setFirstname(fname);

		System.out.println("enter the lastname");
		String lname=ObjectOrientedPrograms.readString();
		person.setLastname(lname);

		System.out.println("enter the address details");
		AddressDetails address=AddressBook.addAddress();
		person.setAddress(address);

		System.out.println("enter the phoneno");
		long phoneno=ObjectOrientedPrograms.readlong();
		person.setPhoneNumber(phoneno);
		persondetails.add(person);
		displayTheAddress();
	}

	public static void editPerson()
	{
		System.out.println("Enter the firstname of a person to be edited");
		String fname=ObjectOrientedPrograms.readString();
		System.out.println("Enter the lastname of a person to be edited");
		String lname=ObjectOrientedPrograms.readString();
		int flag=0;
		for(PersonalDetails p:persondetails) {
			if(fname.equals(p.getFirstname())&&(lname.equals(p.getLastname())))
				System.out.println("Do you want to edit ");
			int choice=1;
			while(choice==1)
			{
				System.out.println("Do you want to edit 1:phoneno or 2:Address");				
				switch(ObjectOrientedPrograms.readInteger())
				{
				case 1:
				{
					System.out.println("Enter the phone number which is to be edited");
					p.setPhoneNumber(ObjectOrientedPrograms.readlong());
					System.out.println("The phone is succesfully updated");
					break;
				}
				case 2:
				{
					System.out.println("The Address details you want to edit are ");
					AddressDetails add=AddressBook.addAddress();
					p.setAddress(add);
					break;
				}
				default:
					System.out.println("Enter the proper first and last name");
					break;
				}
				System.out.println("Do you want to continue editting \t 1:Continue 2:Exit");
				choice=ObjectOrientedPrograms.readInteger();
			}
			flag=1;		
		}
		if(flag==0)
			System.out.println("The first and last name you have entered is not persent in the address book");
	}
	public static void displayTheAddress() {
		if(!persondetails.isEmpty())
		{
			for(PersonalDetails p2:persondetails) {
				System.out.println("First Name : "+ p2.getFirstname() );
				System.out.println("Last Name :" + p2.getLastname());
				System.out.println("Address details ");
				if(!AddressDetails.isEmpty())
				{
					for(AddressDetails add1:AddressDetails) {
						System.out.println("Street Name :" + add1.getStreet());
						System.out.println("City Name :" + add1.getCity());
						System.out.println("State Name :" + add1.getState());
						System.out.println("Zip Code :" + add1.getZipcode());
					}}
				System.out.println("Phone Number :"+ p2.getPhoneNumber());
				System.out.println("______________________________");
			}}
		else
			System.out.println("The book is empty");
	}  
	
	
	public static void deletePerson()
	{
		System.out.println("Enter the first name of a person which need to be deleted");
		String fname=ObjectOrientedPrograms.readString();
		System.out.println("Enter the last name of a person which need to be deleted");
		String lname=ObjectOrientedPrograms.readString();
		int flag=0;
		for(PersonalDetails p:persondetails) {
			if(fname.equals(p.getFirstname())&&(lname.equals(p.getLastname()))){
				persondetails.remove(p);
				System.out.println("The person is succesfully deleted");
				flag=1;
			}
			else 
				System.out.println("The book is empty");
			if (flag==0)
				System.out.println("No person details is present in the book to delete");
		}}

	public static void sortByLastName()
	{
		Collections.sort(persondetails, (details1, details2) -> details1.getLastname().compareTo(details2.getLastname()));
		System.out.println("The details are sortted acording to the lastname");
	} 
	public static void sortByZipCode()
	{  Collections.sort(AddressDetails,(details1, details2) -> details1.getZipcode() > details2.getZipcode() ? 1
			: details1.getZipcode() < details2.getZipcode() ? -1
					: details1.getZipcode() == details2.getZipcode() ? 0 : -10);
	}

	
		
		public static List<PersonalDetails> getpersondetails() {
	        return persondetails;
	    }

	    public static void setpersondetails(List<PersonalDetails> persondetails) {
	        AddressBook.persondetails = persondetails;
	    }
}





