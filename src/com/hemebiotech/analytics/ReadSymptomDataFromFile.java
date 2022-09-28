package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
	
	BufferedReader reader = null;
	ArrayList<String> aList = new ArrayList<String>();
	ArrayList<String> bList = new ArrayList<String>();
	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 * @return 
	 * @throws FileNotFoundException 
	 */
	public void ReadSymptomData (String filepath,ArrayList<String> aList,ArrayList<String> bList) throws IOException {
		BufferedReader readfile = this.reader;
		readfile = new BufferedReader (new FileReader(filepath));
		String line = null;
		
		while ((line = readfile.readLine()) != null) {
			System.out.println("symptom from file: " + line);
			ISymptomReader.GetAllSymptoms(aList,line);
			ISymptomReader.GetSymptoms(bList,line);
		
		}
		readfile.close();
	}

}
