package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AddressDetails;
import com.bridgelabz.util.CreateBook;
import com.bridgelabz.util.ObjectOrientedPrograms;
import com.bridgelabz.util.PersonalDetails;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Address Manager ");
		System.out.println("Address book Objective");
		System.out.println("1:Create book");
		System.out.println("2:Open book");
		System.out.println("3:Save book");
		System.out.println("4:close book");
		System.out.println("5:Save as");
		int choice=ObjectOrientedPrograms.readInteger();
		switch (choice) {
		case 1:
		{
			System.out.println("Nesaccary requirement to crearte a book is");
			System.out.println("1:Add person details");
			System.out.println("2:Edit person details");
		    System.out.println("3:Delete person");
		    System.out.println("4:Sort the details");
			int choice2=ObjectOrientedPrograms.readInteger();
			switch (choice2) {
			case 1:
			{
			PersonalDetails	a1=CreateBook.personalDetails();
				System.out.println("the person details is succesfully added to the book");
				System.out.println(a1);
				break;
			}
			case 2:
			{
				
			}}}}}}
