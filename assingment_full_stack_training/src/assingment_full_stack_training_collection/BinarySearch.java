package assingment_full_stack_training_collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		  ArrayList<String> arrlist = new ArrayList<String>();  
          arrlist.add("Gaurav");  
          arrlist.add("Rahul");  
          arrlist.add("Raj");  
          arrlist.add("Ramesh");  
          //Search the list for key 'D'  
          int index = Collections.binarySearch(arrlist, "Gaurav");       
          int index1 = Collections.binarySearch(arrlist, "Rahul");       

          System.out.println("index 'Gaurav' is available at position: "+index);  
          System.out.println("index 'Rahul' is available at position: "+index1);  


	}

}
