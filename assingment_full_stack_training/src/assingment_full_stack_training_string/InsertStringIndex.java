package assingment_full_stack_training_string;

public class InsertStringIndex {

	
	 void additionofString(String s1, String s2,String s3 , int index) {
		    char[] ch = s1.toCharArray();
	        char[] ch1 = s1.toCharArray();
	        char[] ch2 = s2.toCharArray();
	        char[] ch3 = new char[ch1.length + ch2.length + ch.length];
	       
	        int temp = 0;



	       for (int i = 0; i < ch1.length; i++) {



	           if (i == index) {



	               for (int j = 0; j < ch2.length; j++) {
	                    ch3[temp++] = ch2[j];
	                }
	            }
	            ch3[temp++] = ch1[i];
	            



	       }



	       System.out.println("final output after inserting one string to another is => " + new String(ch3));



	   }



	   public static void main(String[] args) {
	        InsertStringIndex tsi = new InsertStringIndex();
	        tsi.additionofString("gaurav","kumar","singh" , 1);



	   }
}
