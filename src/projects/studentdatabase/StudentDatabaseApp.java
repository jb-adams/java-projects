package projects.studentdatabase;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * <h1>StudentDatabaseApp</h1>
 * The StudentDatabaseApp class contains the main method, which is used to instantiate
 * and manage an instance of the StudentDatabase class
 *
 * @author Jeremy Bruce Adams
 * @version 0.1.0
 * @since 2018-04-03
 */

public class StudentDatabaseApp {

    /**
     * This is the main method. Reads the number of students to be added from stdin and
     * creates a StudentDatabase object based off of that
     * @param args array of command line arguments
     * @throws InputMismatchException if Scanner cannot parse int from user input
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nStudents = 0;
        boolean invalidInput = true;

        /*
        get an int from the user for how many students are to be added to the database
        program will continue when valid input has been entered
         */
        do {
            System.out.print("Enter how many students will be added to the database: ");

            try {
                nStudents = sc.nextInt();
                invalidInput = false;
            } catch (InputMismatchException e) {
                System.out.println(
                    "Invalid Input, please enter an integer that appears in the course catalog");
                sc.next();
            }

        } while (invalidInput);

        // once valid input has been entered, create the Student Database object
        System.out.println("Thank you. " + nStudents + " students will be added to the database");
        StudentDatabase studb = new StudentDatabase(nStudents);

        // enroll each student in their courses
        for (int a=0; a<studb.getNStudents(); a++) {
            Student stu = studb.getStudentArr()[a];
            stu.enroll();
        }

        // pay tuition for each student

        // view the status of each student (name, id, balance, courses)
    }
}
