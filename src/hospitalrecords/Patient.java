/*
 * Central Hospital would like to have a program implemented to keep track 
 * of the hospital patients. This program has - records of the current hospital 
 * patients, allow the search of patients by patient ID and have an option to 
 * delete a patient’s record after the patient is released from the hospital.
 */

package hospitalrecords;

/**
 *
 * @Author Antony Jones 92019124.
 */

//Add a class named Patient.

public class Patient {
    
     //Add appropriate fields. 
    
    private final String patientId;
    private final String name;
    private final String checkInDate;  
    private final String assignedMedicalPersonel;
    
    
    /*Add a constructor to the class that assigns values to all
    the fields in the order listed above.*/
    
     public Patient(String patientId, String name, String checkInDate, 
        String assignedMedicalPersonel){

        this.patientId = patientId;
        this.name = name;
        this.checkInDate = checkInDate; 
        this.assignedMedicalPersonel = assignedMedicalPersonel;
        
    }//End of Patient Constructor.
     
     
    /*Add a toString() method that prints out person's information in a 
    easily readable manner.*/ 

    @Override
    public String toString(){

        return "Person Information:\nPatient Id: " + patientId + "\nName: " + 
            name + "\nCheck In Date: " + checkInDate + 
                "Assigned Medical Personel" + assignedMedicalPersonel; 
       
    }//End of toString Method.
    

}//End of Class Patient.
