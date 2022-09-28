package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader{
	/**
	 * The method used for get symptoms,
	 * before each addition of word,
	 * it checks if the word is already there, 
	 * if yes it does not add it.
	 * 
	 * @param List The list to which all the words will be added
	 * @param word The word that will be added to the List
	 * @return a raw listing of Symptoms obtained from an List, without the duplicates
	 */
	public static List<String> GetSymptoms(ArrayList<String> List, String word){
		if(!List.contains(word)){
			List.add(word);
			}
		return List;
	}
	
	/**
	 * The method used for get symptoms without the duplicates it return a List 
	 * 
	 * @param List The list to which the words will be added
	 * @param word The word that will be added to the List
	 * @return a listing of Symptoms obtained from an List, without the duplicates 
	 */
	public static List<String> GetAllSymptoms(ArrayList<String> List, String word){
			List.add(word);
			return List;
	}
	
}

