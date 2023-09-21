
package poeprog6122;
import java.util.Scanner;

public class Menu extends Student {
    
    public static void NewMenu() {

        String Menu = "STUDENT MANAGEMENT APPLICATION  "
                + "\n *************************** "
                + "\n Enter (1) to launch menu or any other key to exit ";
        System.out.println(Menu);
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == 1) {
            innerMenu();
        } else {
            ExitStudentApplication();
        }

    }

    public static void innerMenu() {
        String Menu = "Please select one of the following menu items "
                + "\n(1) Capture a new Student "
                + "\n(2) Search for a Student "
                + "\n(3) Delete a Student "
                + "\n(4) Print Student Report "
                + "\n(5) Exit Application ";
        System.out.println(Menu);
        Scanner input = new Scanner(System.in);
        //input.hasNextInt();
        int answer = input.nextInt();
        switch (answer) {
            case 1:
                SaveStudent(name,course,email,studentID,age);
                break;

            case 2:

                SearchStudent();

            case 3:

                DeleteStudent();

            case 4:

                StudentReport();

            case 5:

                ExitStudentApplication();
        }
    }

    public static void outterMenu() {
        String Menu = "Enter (1) to launch menu or any other key to exit ";
        Scanner input = new Scanner(System.in);
        System.out.println(Menu);
        int answer = input.nextInt();
        if (answer == 1) {
            innerMenu();
        } else {
            ExitStudentApplication();
        }
    }
}
