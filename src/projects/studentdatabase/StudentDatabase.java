package projects.studentdatabase;

/**
 * <h1>StudentDatabase</h1>
 * The StudentDatabase class creates and holds a series of student objects inside an array
 *
 * @author Jeremy Bruce Adams
 * @version 0.1.0
 * @since 2018-04-03
 */

public class StudentDatabase {

    private int nStudents;
    private Student[] studentArr;

    // Constructor(s)

    /**
     * Constructor. Instantiates a StudentDatabase object with a user-specified number of
     * students to add to the database
     * @param nStudents number of students to add to database
     */
    public StudentDatabase(int nStudents) {
        this.nStudents = nStudents;
        this.studentArr = new Student[this.nStudents];
        createAllStudents();
    }

    /**
     * populates the array with new Student objects
     */
    private void createAllStudents() {
        for (int i=0; i<this.nStudents; i++) {
            this.studentArr[i] = createAndGetStudent();
        }
    }

    /**
     * instantiates and returns a new Student object
     * @return Student new Student object
     */
    private Student createAndGetStudent() {
        Student stu = new Student();
        return stu;
    }

    /**
     * get the total number of Student objects in the student array
     * @return int number of students in the array
     */
    public int getNStudents() {
        return this.nStudents;
    }

    /**
     * get the student array
     * @return Student[] array of Student objects
     */
    public Student[] getStudentArr() {
        return this.studentArr;
    }
}
