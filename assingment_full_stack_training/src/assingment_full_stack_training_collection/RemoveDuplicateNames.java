package assingment_full_stack_training_collection;

public class RemoveDuplicateNames {
	
	
		
		 public static int removeDuplicateNames(String arr[] , int n){  
		        if (n==0 || n==1){  
		            return n;  
		        }    
		        int j = 0;
		        for (int i=0; i < n-1; i++){  
		            if (arr[i] != arr[i+1]){  
		                arr[j++] = arr[i];  
		            }  
		        }  
		        arr[j++] = arr[n-1];  
		        return j;  
		    }  
		 public static void main(String[] args) {
			 
		 String arr[] = {"Gaurav" , "Saurav" , "Rahul" , "Rohit" , "Gaurav"};
		 int length= arr.length;
		 length = removeDuplicateNames(arr, length);
		 for (int i=1; i<length; i++)
			 System.out.println(arr[i]+" ");
	}

}
