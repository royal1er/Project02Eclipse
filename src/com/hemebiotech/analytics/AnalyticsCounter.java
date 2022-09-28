package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class AnalyticsCounter {
	static DisplayAndRecordData data = new DisplayAndRecordData();
	static ReadSymptomDataFromFile mydata = new ReadSymptomDataFromFile();
	static ArrayList<String> aList = new ArrayList<String>();
	static ArrayList<String> bList = new ArrayList<String>();
	
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = null;
		
		
		mydata.ReadSymptomData("symptoms.txt",aList,bList);
		
		Collections.sort(bList);
		data.Frequency(aList, bList);
		data.GenerateOutput(aList,bList,"results.out");
		
	}
	

}
