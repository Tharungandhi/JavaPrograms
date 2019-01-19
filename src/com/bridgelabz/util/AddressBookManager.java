package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.objectorientedprograms.AddressBookManagement;

public class AddressBookManager { 
	private static final String ADDRESS_BOOK_FILE_PATH="/home/admin1/Tharun/Bridgelabs/programs/JavaPrograms/";
	private static AddressBook addressbook = null;
    private static final AddressBookManager ADDRESS_BOOK_MANAGER = null;
    private static String bookName=null;
	private static List<PersonalDetails> persondetails=new ArrayList<PersonalDetails>();
	
	
	public static String getBookName() {
		return bookName;
	}
	public static void setBookName(String bookName) {
		AddressBookManager.bookName = bookName;
	}
	 private AddressBookManager() {
	    }
	
	    public static AddressBookManager getInstance() {
	        if (ADDRESS_BOOK_MANAGER == null) {
	            return new AddressBookManager();
	        }
	        return ADDRESS_BOOK_MANAGER;
	    }
	
	    private static File[] getFiles() {
	        return new File(System.getProperty("user.dir")).listFiles();
	    }
	    
	    
	public static void createBook() throws IOException {
		System.out.println("Enter the name of the book in (.json) extention (eg:file.json)");
		String book = ObjectOrientedPrograms.readString();
		File file = new File(ADDRESS_BOOK_FILE_PATH + book);		
		if (file.createNewFile()) {
			System.out.println("Book is succesfully created and add to the file");
		}
			else
			System.out.println("The Name of that book is already exists pls create new book");
	}
	
	
	/////
	  public static void selectAddressBookName(File[] files) {
	        System.out.println("Files available are:");
	        for (File file : files) {
	            if (file.getName().endsWith(".json"))
	                System.out.println(file.getName());
	        }
	        System.out.println("Choose the address book");
	        bookName = ObjectOrientedPrograms.readString();
	    }
	
	
	
	public static void openBook() throws IOException {
		System.out.println("Files available are:");
		   File[] files = getFiles();
		   selectAddressBookName(files);
		boolean flag=false;
		for (File file : files) {
			String filename = file.getName();
			if (bookName.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Add Details");
					String string = ObjectOrientedPrograms.readFile(filename);
					persondetails = ObjectOrientedPrograms.userReadValue(string,PersonalDetails.class);
					AddressBook.setpersondetails(persondetails);
					addressBook();
				} else {
					System.out.println("Address Book is empty");
					System.out.println("Add new data onto the Address Book");
					addressBook();
				}
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("File doesnot exist or u have not given extention(.json)");
	}

	public static void saveBook() {
        int flag=0;
        String ch_book = getBookName();
        for (File file : getFiles()) {
            String filename = file.getName();
            if (ch_book.equals(filename)) {
                try {
                    String json =ObjectOrientedPrograms.userWriteValueAsString(AddressBook.getpersondetails());
                    ObjectOrientedPrograms.writeFile(json, filename);
                    System.out.println("Address book details saved");
                    flag=1;
                } catch (Exception e) {
                    System.out.println("Cannot write to file");
                }
            }
        }
        if(flag==0)
            System.out.println("File doesnot exist or u have not given extention(.json)");
        
	}
	
	 public static void closeBook()
	    {
	        addressbook=null;
	    }
	
	 
	 
	 public static void saveAsBook() throws IOException {
	        System.out.println("List of files");
	        for (File file : getFiles()) {
	            if(file.getName().endsWith(".json"))
	                System.out.println(file.getName());
	        }
	        System.out.println("Enter the file name to be saved with extension (eg:file.json)");
	        String book = ObjectOrientedPrograms.readString();
	        File file = new File(ADDRESS_BOOK_FILE_PATH + book);
	        boolean rs = file.createNewFile();
	        if (rs) {
	            System.out.println("File is created");
	            String json = ObjectOrientedPrograms.userWriteValueAsString(AddressBook.getpersondetails());
	            ObjectOrientedPrograms.writeFile(json, book);
	            System.out.println("Address book details saved");
	        } else {
	            System.out.println("File of that name already exists");
	        }
	    }

	
	public static void addressBook() throws IOException {
		System.out.println("1:Add person details");
		System.out.println("2:Edit person details");
		System.out.println("3:Delete person");
		System.out.println("4:Sort the details");
		System.out.println("5:Do you want to go back to main ");
		switch (ObjectOrientedPrograms.readInteger()) {
		case 1:
		{
			AddressBook.personalDetails(persondetails);
			System.out.println("the person details is succesfully added to the book");
			break;
		}
		case 2:
		{
			AddressBook.editPerson();
			AddressBook.displayTheAddress();
			break;
		}
		case 3:
		{
			AddressBook.deletePerson();
			AddressBook.displayTheAddress();
			break;
		}
		case 4:
		{
			sortDetails();
		}
		case 5:
			AddressBookManagement.main(null);
			default :
				System.out.println("Enter the proper choice");
		}}
	public static void sortDetails()
	{
		System.out.println("1:Sort by Last Name");
		System.out.println("2:Sort by ZipCode");
		switch(ObjectOrientedPrograms.readInteger()){
		case 1:
			AddressBook.sortByLastName();
			break;
		case 2:
			AddressBook.sortByZipCode();
			break;
		default :
			System.out.println("Enter the proper choice");
			break;
		}
	}
}


 
