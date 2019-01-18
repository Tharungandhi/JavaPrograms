package com.bridgelabz.designpattern.factorydesgin;

public class FactoryDesignPatternMain {

	public static void main(String[] args) {
		FactoryDesignPatternComputer pc = FactoryDesignPatternFactoryClass.getComputer("pc","2 GB","500 GB","2.4 GHz");
		FactoryDesignPatternComputer server = FactoryDesignPatternFactoryClass.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

	}


