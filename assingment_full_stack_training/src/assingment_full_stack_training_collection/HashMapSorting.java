package assingment_full_stack_training_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMapSorting {
	
	 static Map<String, Integer> s1 = new HashMap<>();
	 
	    // Function to sort map by Key
	    public static void sortbykey()
	    {
	        // TreeMap to store values of HashMap
	        TreeMap<String, Integer> sorted = new TreeMap<>();
	 
	        // Copy all data from hashMap into TreeMap
	        sorted.putAll(s1);
	 
	        // Display the TreeMap which is naturally sorted
	        for (Map.Entry<String, Integer> entry : sorted.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         "   ,   Value = " + entry.getValue());       
	    }
	
	
	
	public static void main(String[] args) {
		
	
	//Map<String , Integer> s1 = new HashMap<String , Integer>();
	
	s1.put("Agra" , 100);
	s1.put("Delhi" , 176);
	s1.put("Pune" , 156);
	s1.put("Mumbai" , 1213);
	s1.put("Kanpur" , 154);
	s1.put("Mathura" , 134);
	
	sortbykey();
	

}
}