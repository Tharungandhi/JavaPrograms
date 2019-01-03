package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public  class DataStructurePrograms {
	    static Node head; // head of list
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
		    public static DataStructurePrograms insert(DataStructurePrograms list, String String)
		    {
		        // Create a new node with given data
		        Node new_node = new Node(String);
		        new_node.nextref = null;
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
		    public static void usingFileWriter(DataStructurePrograms list) throws IOException
		    {
		        String[] fileContent = DataStructurePrograms.toStrinConv(list);
		        FileWriter fileWriter = new FileWriter("/home/admin1/Desktop/Files/example.txt");
		        for(String s:fileContent)
		        {
		            if(s!=null) {
		                fileWriter.write(s);
		                fileWriter.write(" ");
		            }
		        }
		        fileWriter.close();
		    }

		    public static String[] toStrinConv(DataStructurePrograms list)
		    {
		        Node currNode = list.head;
		        int i=0;
		        String[] str =new String[1000];
		        while (currNode != null) {
		            if(currNode.value!=null)
		                str[i]=currNode.value ;
		            i++;
		            currNode = currNode.nextref;
		        }
		        return str;
		    }    
	    	
	
	    public static DataStructurePrograms readFileStr(DataStructurePrograms linkedList) throws FileNotFoundException, IOException
	    {
	       // System.out.println("Enter the path of the file");
	       // String csvFile = readString();
	        String csvFile="/home/admin1/Desktop/UnOderedList.csv";
	        String line = "";
	        String name[]=new String[100];
	        int size=0;
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
	        {
	            while ((line = br.readLine()) != null)
	            {
	              name = line.split(" ");
	                for(int i=0;i<name.length;i++){
	                    String name1=name[i];
	                    insert(linkedList, name1);
	                    size++;
	                }
	            }
	        }
			return linkedList;	   
			}
	    
	    
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

	    public static DataStructurePrograms readFileInt(DataStructurePrograms linkedList) throws FileNotFoundException, IOException
	    {
	       // System.out.println("Enter the path of the file");
	       // String csvFile = readString();
	        String csvFile="/home/admin1/Desktop/OderedList.csv";
	        String line = "";
	        String name[]=new String[100];
	        int size=0;
	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
	        {
	            while ((line = br.readLine()) != null)
	            {
	              name = line.split(" ");
	                for(int i=0;i<name.length;i++){
	                    String name1=name[i];
	                    insert(linkedList, name1);
	                    size++;
	                }
	            }
	        }
			return linkedList;	   
			}

	    
	    
	    
	    
	    public static int[] toIntConv(DataStructurePrograms LinkedList)
	    {
	        int kz=0;
	        Node currNode = LinkedList.head;
	        int i=0;
	        int[] str =new int[100];
	        while (currNode != null) {
	            if(currNode.value!=null)    
	                kz=Integer.parseInt(currNode.value);
	            str[i]=kz;
	            i++;
	            currNode = currNode.nextref;
	        }
	        return str;
	    }
	       
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
	        public int size() {

	            Node tmp = head;
	            int i = 0;
	            while (true) {
	                if (tmp == null) {
	                    break;
	                }
	                if(tmp.value!=null)
	                {
	                i++;
	                }
	                tmp = tmp.nextref;
	            }
	            return i;
	        }	        
	       
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
	    	
  public static boolean simpleBalancedParentheses(String exp) {
	  int len=exp.length();
		int i=0;
		     while(i<len)
		     {
		         if(exp.charAt(i)==')'&&Stack.isEmpty())
		          return false;
		         else if(exp.charAt(i)==')')
		          Stack.pop();
		         else if(exp.charAt(i)=='(')
		          Stack.push(i);
		         ++i;
		     }
	     if (Stack.isEmpty())
	    	 return true;
	     else
	    	 return false;  }




  
  
  
  
  
  
  
  
}