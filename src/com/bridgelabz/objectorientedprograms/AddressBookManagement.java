package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import com.bridgelabz.util.AddressBookManager;
import com.bridgelabz.util.ObjectOrientedPrograms;

public class AddressBookManagement{

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Address Book Management System");
		System.out.println("Address book Objective");
		int ch=0;
		do {
		System.out.println("1:Create book");
		System.out.println("2:Open book");
		System.out.println("3:Save book");
		System.out.println("4:Close book");
		System.out.println("5:Save book as");
		System.out.println("6:Do you want to Exit");
		switch (ObjectOrientedPrograms.readInteger()) {
		case 1:
		{
			AddressBookManager.createBook();
			break;
		}
		case 2:
		{
			AddressBookManager.openBook();
			break;
		}
		case 3:
		{
			AddressBookManager.saveBook();
			break;
		}
		case 4 :
		{
			AddressBookManager.closeBook();
			break;
		}
		case 5:
		{
			AddressBookManager.saveAsBook();
		    break;
		}
		case 6:
		System.exit(0);
		default :
			System.out.println("Pls enter the proper option");
	     ch++;
		}}
	while(ch<50);
	
	}}


