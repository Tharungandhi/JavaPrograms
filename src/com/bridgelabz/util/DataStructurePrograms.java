package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public  class DataStructurePrograms {
	Node head; // head of list
	/**
	 * static object is created for Scanner class to avoid
	 * multiple object creations of the same class.
	 */
	static Scanner scanner1=new Scanner(System.in); //scanner class declaration

	//method for scanner class of integer type 
	/**
	 * static function to read integers input from the user
	 * @return integer values that are read
	 */
	public static int readInteger() {
		return scanner1.nextInt();}

	//method for scanner class of double type 
	/**
	 * static function to read double input from the user
	 * @return double values that are read
	 */
	public static double readdouble() {
		return scanner1.nextDouble();}

	//method for scanner class of String type 
	/**
	 * static function to read string input from the user
	 * @return strings that are read
	 */
	public static String readString() {
		return scanner1.next();}


	/**
	 * static function to read boolean input from the user
	 * @return boolean values that are read
	 */
	public static boolean userBoolean(){
		return scanner1.nextBoolean();}

	static class Node {

		String value;
		Node nextref;

		// Constructor
		Node(String token)
		{
			value = token;
			nextref = null;
		}
	}
	
	/**
	 * static function to convert integer to string
	 * @param abc
	 * @return strarray
	 */
	public static String[] intTostring(int[] abc) {
        String strarray[]=new String[abc.length];
        int l=0;
        for(int i=0;i<abc.length;i++) {
            if(abc[i]!=0) {
            String str=String.valueOf(abc[i]);
            strarray[l]=str;
            l++;
        }}
        return strarray;
    }
	
	/**
	 * static function to convert integer to string
	 * @param list
	 * @param Str
	 * @return list
	 */
	public static DataStructurePrograms insert(DataStructurePrograms list, String Str)
	{
		// Create a new node with given data
		Node new_node = new Node(Str);
		//new_node.nextref = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.nextref != null) {
				last = last.nextref;
			}
			last.nextref = new_node;
		}
		return list;
	}
	
	/**
	 * static function to read a file
	 * @param list
	 * @return
	 */
	public static DataStructurePrograms readFile(DataStructurePrograms list)
    {
        System.out.println("Enter the path of the file");
        String csvFile = readString();
        //String csvFile="/home/admin1/Desktop/Files/example.txt";
        String line = " ";
        String name[]=new String[1000];
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {
            while ((line = br.readLine()) != null)
            {
                name = line.split(" ");
                for(int i=0;i<name.length;i++){
                    String name1=name[i];
                    insert(list, name1);               
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }

	/**
	 * static function to print a list
	 * @param list
	 * @return
	 */
	public static void printList(DataStructurePrograms list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			if(currNode.value!=null)
				System.out.println(currNode.value + " ");
			currNode = currNode.nextref;
		}
	}
	
	
	/**
	 * to check for ordered search
	 * @param list and key
	 * @param integer value
	 */
	public static int delete(DataStructurePrograms list,String key)
	{
		int flag=0;
		Node currNode = list.head;        
		while(currNode != null)
		{
			if(currNode.value!=null)
			{
				if((currNode.value).compareToIgnoreCase(key)==0) {
					currNode.value=null;    
					System.out.println("entered "+key+" found and deleted");
					flag=1;        
				}
			}
			currNode = currNode.nextref;
		}

		return flag;            
	}
	
	/**
	 * to display the file
	 * @param fname String 
	 */
	public static void dispFile( String fname)
	{
		String line = null;
		try
		{
			FileReader fileReader = new FileReader(fname);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file named '" + fname + "'");
		}
	}	
	
	/**
	 * to check for ordered search
	 * @param li2 linked list of integer
	 * @param key to get value
	 */
	public static int[] toIntConv(DataStructurePrograms list)
	{
		int kz=0;
		Node currNode = list.head;
		int i=0;
		int[] str =new int[1000];
		while (currNode != null) {
			if(currNode.value!=null)
			{    
				kz=Integer.parseInt(currNode.value);
				str[i]=kz;
				i++;
			}
			currNode = currNode.nextref;
		}
		return str;
	}
	
	/**
	 * to check for ordered search
	 * @param li2 linked list of string
	 * @param key to get value
	 */
	public static String[] toStrinConv(DataStructurePrograms list)
	{
		Node currNode = list.head;
		int i=0;
		String[] str =new String[100000];
		while (currNode != null) {
			if(currNode.value!=null)
				str[i]=currNode.value ;
			i++;
			currNode = currNode.nextref;
		}
		return str;
	}    
	
		/**
		 * to sort array of integer
		 * @param arr array of integer
		 * @return integer array
		 */
	public static int[] sortArray(int [] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j]>key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;

	}
	/**
	 * static function to print using File Writer
	 * @param list
	 * @return
	 */
	public static void usingFileWriter(DataStructurePrograms list,String[] fileContent,String path) throws IOException
	{
		//String[] fileContent = DataStructureUtility.toStrinConv(list);
		FileWriter fileWriter = new FileWriter(path);   
		for(String s:fileContent)
		{
			if(s!=null) {
				fileWriter.write(s);
				fileWriter.write(" ");
			}
		}
		fileWriter.close();}

	/**
	 * to sort string of integer
	 * @param arr string of integer
	 * @return integer string
	 */
	public static int[] stringSort(int[] myArray) {
		for(int i = 0; i<myArray.length; i++) {
			for (int j = i+1; j<myArray.length-1; j++) {
				if(myArray[i]!=0 && myArray[j]!=0 ) {
					if(myArray[i]>myArray[j]){
						int temp = myArray[i];
						myArray[i] = myArray[j];
						myArray[j] = temp;
					}
				}
			}
		}
		return myArray;
	}


	/**
	 * to check for balanced parenthesis
	 * @param exp character
	 * @return boolean value
	 */
	public static boolean simpleBalancedParentheses(char exp[]) {

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '(')
				st.push(exp[i]);

			if (exp[i] == ')') {
				if (st.isEmpty()) {
					return false;
				}

				else if (!Pair((char) st.pop(), exp[i])) {
					return false;
				}
			}

		}

		if (st.isEmpty())
			return true;
		else
			return false;
	}
	/**
	 * check for pair of brackets
	 * @param character1
	 * @param character2
	 * @return boolean type
	 */
		public static boolean Pair(char character1, char character2) {
	        if (character1 == '(' && character2 == ')')
	            return true;
	        else
	            return false;
	    }

		/**
		 * to find prime number which are anagram
		 * @param primeList is list of integers
		 * @return set of integers
		 */
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (Algorithmprograms.isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return primeAnagram;
	}

	/**
	 *Static function to check if the two strings are anagram or not.
	 * 
	 * @param str1 the string to be checked for anagram
	 * @param str2 the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean isAnagram(String word, String anagram) {
		boolean isAnagram = false;
		if (word != null && anagram != null && word.length() == anagram.length()) {
			char[] arr = word.toCharArray();
			StringBuilder temp = new StringBuilder(anagram);
			//int wordLength = FunctionalUtility.readInteger();
			for (char ch : arr) {
				int index = temp.indexOf("" + ch);
				if (index != -1) {
					temp.deleteCharAt(index);
				}
			}
			isAnagram = temp.toString().isEmpty();
		}
		return isAnagram;
	}

		
		/**
		 * to find day of that date
		 * @param month of integer type
		 * @param i of integer type
		 * @param year of integer type
		 * @return of integer type
		 */
		public	static int dayOfWeek(int m, int y) {
			int d = 1;
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}

	/**
	 * to find prime numbers which are anagram and store in stack
	 * @param primeList is list of integers
	 * @return stack of integers
	 */
	@SuppressWarnings("rawtypes")
	public static Stack primeAnagram1(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (Algorithmprograms.isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (Stack) primeAnagram;
	}
	/**
	 * to find prime numbers which are anagram and store in queue
	 * @param primeList is list of integers
	 * @return queue of integers
	 */
	@SuppressWarnings("rawtypes")
	public static Queue primeAnagram2(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (Algorithmprograms.isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (Queue) primeAnagram;
	}
	/**
	 * to find number of total number of BST that can be performed
	 * @param n double type
	 * @return double type result 
	 */
	public static double binaryCount(double n) {
		double c = binomialCoeff(2 * n, n);
		double count = c / (n + 1);
		return count;
}
	/**
	 * to find out binomial co-efficient of number
	 * @param n double type number
	 * @param k double type number
	 * @return double type result
	 */
	public static double binomialCoeff(double n, double k) {
		int res = 1;
	    if (k > n - k) 
	        k = n - k;  
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}
	public static int dayWeek(int month, int i, int year)
	{ 
	int y = year - (14 - month) / 12;
	int x = y + y/4 - y/100 + y/400;
	int m = month + 12 * ((14 - month) / 12) - 2;
	int d = (i + x + (31*m)/12) % 7;
	return d;
	}
	
	/**
	 * to find leap year or not
	 * @param year of integer type
	 * @return of boolean type
	 */
	public static boolean isLeapYear(int year)
	{
	        if  (((year % 4 == 0) && (year % 100 != 0))||year % 400 == 0) return true;
	        else return false;
}	
}