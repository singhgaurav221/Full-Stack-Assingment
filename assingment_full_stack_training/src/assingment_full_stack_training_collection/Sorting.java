package assingment_full_stack_training_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		
		 ArrayList<String> al = new ArrayList<String>();
	        al.add("Gaurav");
	        al.add("Shakib");
	        al.add("Akash");
	        al.add("Sandeep");
	        al.add("Aman");
	        al.add("Saurabh");
	        al.add("Ravi");
	        al.add("Ramesh");
	 
	        /* Collections.sort method is sorting the
	        elements of ArrayList in ascending order. */
	        Collections.sort(al);
	 
	        // Let us print the sorted list
	        System.out.println(" Collection sort :" + al);

	}

}
