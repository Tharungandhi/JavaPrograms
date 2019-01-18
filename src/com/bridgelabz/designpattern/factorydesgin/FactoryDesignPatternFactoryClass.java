package com.bridgelabz.designpattern.factorydesgin;

public class FactoryDesignPatternFactoryClass {
	public static FactoryDesignPatternComputer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new FactoryDesignPatternPC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new FactoryDesignPatternServer(ram, hdd, cpu);
		
		return null;
	}
}


