package com.bridgelabz.dataStrucPrograms;


import com.bridgelabz.util.DataStructurePrograms;

public class SimpleBalancedParentheses {
	
	@SuppressWarnings("unused")
	public static void  main(String[] args) {
		//Stack<Integer> Stack=new Stack<Integer>();
	//	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the experssion like (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
		String exp=DataStructurePrograms.readString();
		boolean a1= DataStructurePrograms.simpleBalancedParentheses(exp);
		System.out.println(a1);
	}

}
