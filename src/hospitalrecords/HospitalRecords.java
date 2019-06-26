/*
 * Central Hospital would like to have a program implemented to keep track 
 * of the hospital patients. This program has - records of the current hospital 
 * patients, allow the search of patients by patient ID and have an option to 
 * delete a patient’s record after the patient is released from the hospital.
 */

package hospitalrecords;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Date 20/6/2019
 * @Author Antony Jones 92019124.
 */

public class HospitalRecords {
    
    //Scanner.

    private static final Scanner in = new Scanner(System.in);
    //set variable usersIput to String.
    private static String usersInput;
    public static ArrayList<Patient> patientRecordsArrayList  = new ArrayList();

    
     /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        System.out.println
        ("**Patient records have been "
        + "recorded successfully**\n");      
        
        while (true){

            System.out.println
            ("Press S for search, E for Exit.\n");
            usersInput = in.nextLine();

            if (usersInput.equals("S")){
                searchDeleteRecords();
            }
            else if (usersInput.equals("E")){
                System.out.println
                ("Program has been exited bye...");
                System.exit(0);
            }
            
        }//End of while.

    }//End of main

    
    /*Add the method below to the 
    main class to save patients’ information 
    from the txt file to the ArrayList created.*/

    public static void obtainRecords(){

        /*Use path to the -
        ListOfPatients.txt here.*/
        String path = "W:\\NetBeans\\"
                + "IT6033NetBeansProjects\\"
                + "HospitalRecords\\src\\"
                + "hospitalrecords\\ListOfPatients.txt";

        LineNumberReader lr = null; 
        /*allows to read information from the
        file line by line.*/
        /*an array to store info about one patient.*/
        String[] oneRecord = new String[4];  
        Patient patient;

        try { 
        //using try-catch for exception handling to catch  
        //possible errors with i/o operations.
        /*FileReader reads
        the file’s contents.*/
        FileReader inputStream = new FileReader(path); 
        lr = new LineNumberReader(inputStream);
        String str;
        
        //while the next line exists.
        while((str = lr.readLine())!= null) { 
        oneRecord = str.split(",");  
        /*dividing one file line by commas 
        and assigning to array.*/
        patient = new Patient(oneRecord[0]
        , oneRecord[1], oneRecord[2],
        oneRecord[3]); 
        
        /*Adding patient to the 
        patientRecordsArrayList.*/
        patientRecordsArrayList.add(patient);

        }//End of While Statement.

    }//End of try.

        catch(IOException ioe){
            System.out.println("IOExcception occured");    
        }//End of catch IOException.

    }//End of obtainRecords Method.

    
    //Method to search & remove a patient records from ArrayList.

    private static void searchDeleteRecords(){
        
        System.out.println("Enter Patient ID to search \n");
        usersInput = in.next();
                    
       if ("NHL365".equals(usersInput)) {
            obtainRecords();
            System.out.print(patientRecordsArrayList.get(0) + "\n");
            System.out.println("\nWould you like to remove the "
            + "patient's record(s)? Y or N? \n");
            usersInput = in.next();
            if ("Y".equals(usersInput)) {
            patientRecordsArrayList.remove(0);
            System.out.println("Record(s) removed successfully\n");
            }
            }
            else if ("NHR576".equals(usersInput)) {
            obtainRecords();
            System.out.print(patientRecordsArrayList.get(1) + "\n");
            System.out.println("\nWould you like to remove the "
            + "patient's record(s)? Y or N? \n");
            usersInput = in.next();
            if ("Y".equals(usersInput)) {
            patientRecordsArrayList.remove(1);
            System.out.println("Record(s) removed successfully\n");
            }
            }
            else if ("NRR178".equals(usersInput)) {
            obtainRecords();
            System.out.print(patientRecordsArrayList.get(2) + "\n");
            System.out.println("\nWould you like to remove the "
            + "patient's record(s)? Y or N? \n");
            usersInput = in.next();
            if ("NRR178".equals(usersInput)) {
            patientRecordsArrayList.remove(2);
            System.out.println("Record(s) removed successfully\n");
            }
            }
            else if ("NKL133".equals(usersInput)) {
            obtainRecords();
            System.out.print(patientRecordsArrayList.get(3) + "\n");
            System.out.println("\nWould you like to remove the "
            + "patient's record(s)? Y or N? \n");
            usersInput = in.next();
            if ("NKL133".equals(usersInput)) {
            patientRecordsArrayList.remove(3);
            System.out.println("Record(s) removed successfully\n");
            }
            }
            else if ("NRR178".equals(usersInput)) {
            obtainRecords();
            System.out.print(patientRecordsArrayList.get(4) + "\n");
            System.out.println("\nWould you like to remove the "
            + "patient's record(s)? Y or N? \n");
            usersInput = in.next();
            if ("NRR178".equals(usersInput)) {
            patientRecordsArrayList.remove(4);
            System.out.println("Record(s) removed successfully\n");
            }
            }
            else if ("NNK254".equals(usersInput)) {
            obtainRecords();
            System.out.print(patientRecordsArrayList.get(5) + "\n");
            System.out.println("\nWould you like to remove the "
            + "patient's record(s)? Y or N? \n");
            usersInput = in.next();
            if ("NNK254".equals(usersInput)) {
            patientRecordsArrayList.remove(5);
            System.out.println("Record(s) removed successfully\n");
            }
            }
            else {
                System.out.println("The search found no matching patient.");
            }
       
    }//End of searchPatientRecords method.

}//End of HospitalRecords class



