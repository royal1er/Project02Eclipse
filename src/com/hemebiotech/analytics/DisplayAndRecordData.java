package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DisplayAndRecordData {
	
	/**
	 * Determines the number of occurrences obtained from a list
	 * 
	 * @param a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	public static void Frequency(ArrayList<String> aList, ArrayList<String> bList) {
		for (int a = 0; a < bList.size(); a++) {
			int frequence = Collections.frequency(aList, bList.get(a));
			System.out.println("Recurrence de la maladie :"+bList.get(a)+" "+frequence);
		}
	}
	
	public static void GenerateOutput(ArrayList<String> aList, ArrayList<String> bList, String NameFile) {
		FileWriter writer;
		try {
			writer = new FileWriter (NameFile);
			for (int b = 0; b < bList.size(); b++) {
				int frequence = Collections.frequency(aList, bList.get(b));
				writer.write(bList.get(b)+" "+ frequence + "\n");
			}writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
