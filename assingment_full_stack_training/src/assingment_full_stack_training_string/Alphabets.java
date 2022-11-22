package assingment_full_stack_training_string;

import java.util.Arrays;
import java.util.Collections;

public class Alphabets {
	

    static String s="Successfully enter";    



public static void main(String[] args) {
    



   String []ch= {"f","r","y","x" ,"h"};
    Arrays.sort(ch);
    System.out.println("Sorted in Assending order -->"+Arrays.toString(ch));



   Arrays.sort(ch,Collections.reverseOrder());
    
    System.out.println("Sorted in Descending order -->"+Arrays.toString(ch));



}

}
