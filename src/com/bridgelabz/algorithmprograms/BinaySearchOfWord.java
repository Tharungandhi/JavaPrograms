/******************************************************************************
 *  Compilation:  javac -d bin BinaySearchOfWord.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinaySearchOfWord n
 *  
 *  Purpose: Binary Search the Word from Word List
 *
 *  @author   Tharun Kumar M B
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.util.Algorithmprograms;

public class BinaySearchOfWord {


	public static void main(String[] args) throws FileNotFoundException {
		//		        AlgorithmUtility a1 = new AlgorithmUtility();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// Get scanner instance
		String csvFile = "/home/admin1/Desktop/Tharun.csv";
		BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));

		// Delimiter used in CSV file
		final String DELIMITER = ",";
		try {
			String line = "";
			// fileReader = new BufferedReader(new FileReader(csvFile));
			// Read the file line by line
			while ((line = fileReader.readLine()) != null) {
				// Get all tokens available in line
				String[] tokens = line.split(DELIMITER);
				Algorithmprograms.sort(tokens);
				//		                for(int i=0;i<tokens.length;i++) {
				//		                    System.out.println(tokens[i]);
				//		                }
				for (String token : tokens) {
					// Print all tokens
					System.out.println(token);
				}
				System.out.println("enter the key word which has to be searched ");
				String key = sc.next();
				int i = Algorithmprograms.binarySearch(tokens, key);
				if (i >= 0) {
					System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
				} else
					System.out.println(key + " doesnot exists in the given csv file");
			}
		} catch (Exception e) { //for expection 
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}
