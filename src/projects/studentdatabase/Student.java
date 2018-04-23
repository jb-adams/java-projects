package projects.studentdatabase;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

/**
 * <h1>Student</h1>
 * The Student class contains information on a student at the university, including first name,
 * last name, id number, year of enrollment, list of courses they are enrolled in, and their
 * outstanding balance.
 */

public class Student {
    private String firstName; // student's first name
    private String lastName; // student's last name
    private int year; // year of enrollment (1-4)
    private String uniqueID; // unique 5-digit ID for student
    private ArrayList<String> courseList; // list of courses the student is enrolled in
    private int balance;

    // Constructor(s)

    /**
     * Constructor. Takes no arguments but instantiates a new Student object with attributes
     * from user standard input. Assigns first name, last name, enrollment year, unique student ID,
     * and sets outstanding balance to 0.
     * @throws InputMismatchException if Scanner cannot parse user input to int
     */
    public Student() {
        Scanner sc = new Scanner(System.in);
        boolean invalidInput = true;

        do {

            try {
                System.out.print("Enter student first name: ");
                setFirstName(sc.nextLine());

                System.out.print("Enter student last name: ");
                setLastName(sc.nextLine());

                System.out.print("Enter student's year of enrollment (1-4): ");
                int year = sc.nextInt();
                if (year < 1 || year > 4) {
                    throw new InputMismatchException();
                }
                setYear(year);

                setUniqueID();
                this.balance = 0;
                this.courseList = new ArrayList<String>();
                invalidInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Error creating student");
                sc.nextLine();
            }

        } while (invalidInput);

    }

    // methods

    public void enroll() {
        Scanner sc = new Scanner(System.in);
        boolean invalidInput = true;

        do {

            try {
                CourseCatalog.printCourseCatalog();
                System.out.print(
                        "Enter the correct number for the course that the student wishes to enroll in: "
                );
                int courseCode = sc.nextInt();

                // check if submitted course code exists in the course catalog
                Set<Integer> courseCodeSet = CourseCatalog.getCourseCatalog().keySet();
                if (!courseCodeSet.contains(courseCode)) {
                    throw new InputMismatchException();
                }

                String courseDescription = CourseCatalog.getCourseCatalog().get(courseCode);
                this.courseList.add(courseDescription);
                System.out.println("student has been enrolled in " + courseDescription);

                invalidInput = false;
                this.balance += 600;
            } catch (InputMismatchException e) {
                System.out.println("Error: please use a valid course code to enroll in");
            }

        } while (invalidInput);
    }

    // setter methods

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private void setYear(int year) {
        this.year = year;
    }
    private void setUniqueID() {
        int randomInt = (int) (Math.random() * 89) + 10;

        String uniqueID = this.year
                          + this.firstName.substring(0,1)
                          + this.lastName.substring(0,1)
                          + randomInt;
        System.out.println(uniqueID);
    }

    // getter methods



}
