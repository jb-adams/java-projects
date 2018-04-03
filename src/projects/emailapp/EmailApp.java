package projects.emailapp;

/**
 * <h1>EmailApp</h1>
 * The EmailApp class contains the main method, which is used to instantiate, run methods,
 * and get/set variables for Email objects
 *
 * @author Jeremy Bruce Adams
 * @version 0.1.0
 * @since 2018-04-03
 */

public class EmailApp {

    /**
     * This is the main method, which instantiates and manages Email objects
     * @param args array of command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---Employee 1---");
        Email e1 = new Email("jeremy", "adams", "informatics");
        e1.setAlternateEmailAddress("jrock@gmail.com");
        e1.setMailboxCapacity(1024);
        System.out.println("email address is: " + e1.getEmailAddress());
        System.out.println("initial password is: " + e1.getPassword());
        System.out.println("employee 1 toString():\n"+e1.toString());
        e1.setPassword("123changeme");
        System.out.println("new password is: " + e1.getPassword());

        System.out.println("\n---Employee 2---");
        Email e2 = new Email("samantha", "dass", "naturopathic");
        e2.setAlternateEmailAddress("sbubble@gmail.com");
        e2.setMailboxCapacity(2048);
        System.out.println("email address is: " + e2.getEmailAddress());
        System.out.println("initial password is: " + e2.getPassword());
        System.out.println("employee 2 toString():\n"+e2.toString());
        e2.setPassword("snackattack");
        System.out.println("new password is: " + e2.getPassword());

        System.out.println("\n---Employee 3---");
        Email e3 = new Email("graeme", "adams", "law");
        e3.setAlternateEmailAddress("gstar@gmail.com");
        e3.setMailboxCapacity(4096);
        System.out.println("email address is: " + e3.getEmailAddress());
        System.out.println("initial password is: " + e3.getPassword());
        System.out.println("employee 3 toString():\n"+e3.toString());
        e3.setPassword("snackattack");
        System.out.println("new password is: " + e3.getPassword());
    }
}
