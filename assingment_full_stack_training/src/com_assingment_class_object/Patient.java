package com_assingment_class_object;

public class Patient {
	
	String patient;
	double height;
	double weight;
	
	
	public Patient(String patient, double height, double weight) {
		super();
		this.patient = patient;
		this.height = height;
		this.weight = weight;
	}
	
	 double computeBMI() {  
		             // BMI = ( Weight in KG / ( Height in Meter x Height in Meter ))
		             return ( weight / ( height * height ));  
		        }  
		        public static void main(String[] args) {  
		             // TODO Auto-generated method stub  
		             Patient patient = new Patient("Rajkumar", 177/8.5, 59*5.5);  
		             System.out.println("Name: " + patient.patient + "\nBMI: " + patient.computeBMI());  
		        }  

}
