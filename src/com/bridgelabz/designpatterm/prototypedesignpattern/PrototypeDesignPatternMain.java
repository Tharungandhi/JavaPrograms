package com.bridgelabz.designpatterm.prototypedesignpattern;

import java.util.List;

public class PrototypeDesignPatternMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeDesignPatternEmployees emps = new PrototypeDesignPatternEmployees();
			emps.loadData();
			
			//Use the clone method to get the Employee object
			PrototypeDesignPatternEmployees empsNew = (PrototypeDesignPatternEmployees) emps.clone();
			PrototypeDesignPatternEmployees empsNew1 = (PrototypeDesignPatternEmployees) emps.clone();
			List<String> list = empsNew.getEmpList();
			list.add("John");
			List<String> list1 = empsNew1.getEmpList();
			list1.remove("Shwetha");
			
			System.out.println("emps List: "+emps.getEmpList());
			System.out.println("empsNew List: "+list);
			System.out.println("empsNew1 List: "+list1);
		}

	}


