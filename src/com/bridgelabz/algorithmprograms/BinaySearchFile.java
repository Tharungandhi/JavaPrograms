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
import com.bridgelabz.util.Algorithmprograms;

public class BinaySearchFile {
	/*
	 * The main function is written to take input from the user and
	 * calls binarySeacrhFile function to search word from list
	 */
	public static void main(String[] args) throws FileNotFoundException {

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
				for (String token : tokens) 
					// Print all tokens
					System.out.println(token);

				//Method 1- using static function of AlgorithmUtility class of
				//com.bridgelabz.util package
				System.out.println("enter the key word which has to be searched ");
				String key =Algorithmprograms.readString();
				int i = Algorithmprograms.binarySearchFile(tokens, key);
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
				e.printStackTrace();}}}}
