package projects.emailapp;

/**
 * <h1>Email</h1>
 * The Email class handles email account operations for company employees.
 * It can handle the following operations
 *  - generate email address from employee first name, last name, department, and company
 *  - generate random initial password for email account
 *  - update password, inbox capacity, alternate email address
 *  - display email account properties
 *
 *  @author Jeremy Bruce Adams
 *  @version 0.1.0
 *  @since 2018-04-03
 */

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String company = "oicr";
    private String emailAddress;
    private String password;
    private int mailboxCapacityMB;
    private String alternateEmailAddress;

    /**
     * Constructor
     * main constructor for instantiating Email objects with assigned firstName, lastName,
     * and department
     * @param firstName employee's first name
     * @param lastName employee's last name
     * @param department department in which the employee works
     */
    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        generateEmail();
        generatePassword();
    }

    /**
     * generates an email based on employee's first name, last name, department
     * and sets it to instance email
     */
    private void generateEmail() {
        this.emailAddress = firstName+"."+lastName+"@"+department+"."+company+".com";
    }

    /**
     * generates a random, 12-digit password, and sets it to instance password
     */
    private void generatePassword() {
        final int nDigits = 12;
        final String alphabet = "0123456789"
                                + "abcdefghijklmnopqrstuvwxyz"
                                + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                + "`~!@#$%^&*()-_=+[{]};:',<.>?";
        final int nChar = alphabet.length();

        StringBuilder pass = new StringBuilder();

        for (int i=0; i<nDigits; i++) {
            int randomIdx = (int) (Math.random() * nChar);
            char newChar = alphabet.charAt(randomIdx);
            pass.append(newChar);
        }

        this.password = pass.toString();
    }

    // setter methods

    /**
     * sets the object password to the provided password
     * @param password new user password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * sets the mailbox capacity to the provided capacity in megabytes
     * @param megabytes new mailbox capacity in megabytes
     */
    public void setMailboxCapacity(int megabytes) {
        this.mailboxCapacityMB = megabytes;
    }

    /**
     * sets the employee's alternate email address
     * @param alternateEmailAddress employee's alternate email address
     */
    public void setAlternateEmailAddress(String alternateEmailAddress) {
        this.alternateEmailAddress = alternateEmailAddress;
    }

    // getter methods

    /**
     * get the company at which the employee works
     * @return String company name
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * get the department in which the employee works
     * @return String department name
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * get the employee's full name (first name and last name)
     * @return String employee's full name
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * get the employee's main email address
     * @return String main email address
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * get the employee's email inbox capacity
     * @return String inbox capacity in megabytes
     */
    public String getMailboxCapacity() {
        return this.mailboxCapacityMB + "MB";
    }

    /**
     * get the employee's alternate email address
     * @return String alternate email address
     */
    public String getAlternateEmailAddress() {
        return this.alternateEmailAddress;
    }

    /**
     * get the password for the email account
     * @return String email account password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * get instance variables in a single string
     * @return String object unpacked as string
     */
    @Override
    public String toString() {
        return "[Email object\n"
                + " First Name: " + this.firstName + "\n"
                + " Last Name: " + this.lastName + "\n"
                + " Department: " + this.department + "\n"
                + " Company: " + this.company + "\n"
                + " Email Address: " + this.emailAddress + "\n"
                + " Mailbox Capacity: " + this.mailboxCapacityMB + "MB\n"
                + " Alternate Email Address: " + this.alternateEmailAddress + "]";
    }
}
