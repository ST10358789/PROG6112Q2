
package poeprog6122;

import java.util.InputMismatchException;
import java.util.Scanner;
import static poeprog6122.Student.*;


public class StudentTestData {
    
    public static String SaveStudent(String name,String course, String email, String studentID,int age) {
        name = "J.Bloggs";
        course = "disd";
        email = "jbloggs@ymail.com";
        studentID = "10111";
        age = 19;
        String result = "Student has been successfully captured";
        return result;
                
}
    public static String studentAgeInvalidCharacter() {
        //W3Schools.2023.Java Exceptions - Try... Catch.[Online].Available at:https://www.w3schools.com/java/java_try_catch.asp [Accessed 18 September 2023]
        String age1 ="c";   
        String result = "You have entered the incorrect age";
        try{ age1 = "c"; 
        
        }
        catch(InputMismatchException e){
        
            System.out.println("You have entered the incorrect age!!!");
            
        }
       
        return result;
    }
         
                
    public static int studentAgeValid(){  
        age=19;
        if (age>=16){
            System.out.println("You have entered the correct age :) ");
            }
        return age;
    }
    public static int studentAgeInvalid(){  
        age=14;
        if (age<16){
            System.out.println("You have entered the incorrect age. "
                    + "\n AGE is INVALID ");
            }
        return age;
    }
    public static String DeleteStudent(){
       studentID = "10111";
       studID.add(studentID);
       String result = "Student ID : " + studentID + " has been successfully deleted ";
        if (studID.contains(studentID)) {
            int ID = studID.indexOf(studentID);
            studID.remove(ID);
                        System.out.println("Student ID : " + studentID + " has been successfully deleted ");
       
    }
        return result;
}
     public static String SearchStudent(){
       studentID = "10111";
       studID.add(studentID);
       String result = "Student ID : " + studentID + " has been found ";
        if (studID.contains(studentID)) {
            int ID = studID.indexOf(studentID);
            studID.remove(ID);
                        System.out.println("Student ID : " + studentID + " has been found ");
       
    }
        return result;
}
    public static String studentNotFound(){
       studentID = "10110";
       String result = "\n -----------------------------"
                    + "\n Student with Student ID : " + studentID + " was NOT FOUND. ";
       studID.add(studentID);
       if(studID.contains(studentID)){
            System.out.println("\n -----------------------------"
                    + "\n Student with Student ID : " + studentID + " was NOT FOUND. ");
                   
            
        }return result;
}}

    
