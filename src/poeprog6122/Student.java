package poeprog6122;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Student {

    public static String name, email, course, studentID;
    public static int age;
    public static ArrayList<String> studNames = new ArrayList<>();
    public static ArrayList<String> studEmails = new ArrayList<>();
    public static ArrayList<String> studCourses = new ArrayList<>();
    public static ArrayList<Integer> studAges = new ArrayList<>();
    public static ArrayList<String> studID = new ArrayList<>();

    public static String SaveStudent(String name,String course, String email, String studentID,int age) {
         //GeeksforGeeks.2023.ArrayList in Java.[Online].Available at: https://www.geeksforgeeks.org/arraylist-in-java/ [Accessed 05 September 2023]
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a student ID ");
        studentID = input.nextLine();
        studID.add(studentID);
        System.out.println("Enter a student Name");
        name = input.nextLine();
        studNames.add(name);
        checkAge(age);
        invalidCharacter(age);
        studAges.add(age);
        System.out.println("Enter a student EMAIL");
        email = input.nextLine();
        studEmails.add(email);
        System.out.println("Enter a student COURSE");
        course = input.nextLine();
        studCourses.add(course);
        System.out.println("Student has been successfully captured :) ");
        Menu.outterMenu();
        return null;

    }

    public static void SearchStudent() {
        //GeeksforGeeks.2023.Iterating Over ArrayList in Java.[Online].Available at: https://www.geeksforgeeks.org/iterating-arraylists-java/ [Accessed 10 September 2023]
        System.out.println("Type the student ID you want to search for : ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (studID.contains(answer)) {
            int ID = studID.indexOf(answer);
            System.out.println("-----------------------------"
                    + "\n STUDENT ID : " + studID.get(ID)
                    + "\n STUDENT NAME : " + studNames.get(ID)
                    + "\n STUDENT AGE : " + studAges.get(ID)
                    + "\n STUDENT EMAIL : " + studEmails.get(ID)
                    + "\n STUDENT COURSE : " + studCourses.get(ID)
                    + "\n-----------------------------");
            Menu.outterMenu();
        } else {
            System.out.println("----------------------------------------------------------------"
                    + "\n Student with Student ID : " + answer + " was NOT FOUND "
                    + "\n-----------------------------------------------------------");
            Menu.outterMenu();
        }

    }

    public static void DeleteStudent() {
        //Interview Dot(2012)IN JAVA HOW TO REMOVE AN ELEMENT FROM ARRAY LIST Available at: https://www.youtube.com/watch?v=4eFGzacj-go [Accessed 12 September 2023]
        System.out.println("Enter the student ID you want to delete : ");
        Scanner input = new Scanner(System.in);
        String query = input.nextLine();
        System.out.println("Are you sure you want to delete : " + query + " from the system? ");
        System.out.println("Yes (y) to delete ");
        input.nextLine();

        if (studID.contains(query)) {
            int ID = studID.indexOf(query);
            studID.remove(ID);
            studNames.remove(ID);
            studAges.remove(ID);
            studEmails.remove(ID);
            studCourses.remove(ID);
            System.out.println("Student ID : " + query + " has been successfully deleted ");
            Menu.outterMenu();
        } else {
            System.out.println("\n -----------------------------"
                    + "\n Student with Student ID : " + query + " was NOT FOUND. "
                    + "\n Please enter a valid Student ID: >> ");
            Menu.outterMenu();
        }
    }

    public static void StudentReport() {
        for (int index = 0; index < studID.size(); index++) {
            System.out.println(
                    "STUDENT " + (index + 1)
                    + "\n--------------------------------"
                    + "\n STUDENT ID : " + studID.get(index)
                    + "\n STUDENT NAME : " + studNames.get(index)
                    + "\n STUDENT AGE : " + studAges.get(index)
                    + "\n STUDENT EMAIL : " + studEmails.get(index)
                    + "\n STUDENT COURSE : " + studCourses.get(index)
                    + "\n--------------------------------");
        }
        Menu.outterMenu();
    }

    public static void ExitStudentApplication() {
        System.out.println("Thank you for using the Application ");
        System.exit(0);
    }
    
    public static int invalidCharacter(int Age){
        try{int age1 = Age;
        
        }
        catch(InputMismatchException e){
        
            System.out.println("You have entered the incorrect age!!!");
              System.out.println("Please enter the correct age>>>"); 
         return invalidCharacter(age);}
        
    return age;
    }

    public static int checkAge(int age) {
        //W3Schools.2023.Java Exceptions - Try... Catch.[Online].Available at:https://www.w3schools.com/java/java_try_catch.asp [Accessed 18 September 2023]
        System.out.println("Enter your age");
        Scanner input = new Scanner(System.in);
        
        try{ age = input.nextInt();input.nextLine();        
        }
        catch(InputMismatchException e){
        
            System.out.println("You have entered the incorrect age!!!");
            System.out.println("Please enter the correct age>>>"); 
         return checkAge(age);}
                
        while (age<16){
            System.out.println("You have entered the incorrect age!!!");
            System.out.println("Please enter the correct age>>>");
            return checkAge(age);
        }
        studAges.add(age);
        return age;
    }
}
 
  
