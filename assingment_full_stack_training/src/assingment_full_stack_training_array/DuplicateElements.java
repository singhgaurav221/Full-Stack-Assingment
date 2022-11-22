package assingment_full_stack_training_array;

public class DuplicateElements {

	public static void main(String[] args) {
	
		 int [] arr = new int [] {20, 20, 30, 40, 50, 70, 80, 80, 30};   
         
	        System.out.println("Duplicate elements in given array: ");  
	                                                                    //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  

	}

}
