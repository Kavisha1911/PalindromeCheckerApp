/**
 * UseCase1PalindromeCheckerApp
 * ----------------------------------------
 * A simple console-based application that
 * displays the Palindrome Checker App
 * name and version at startup.
 *
 * Version: 1.0.0
 */

public class PalindromeCheckerApp {

    // Application version constant
    static final String APP_VERSION = "1.0.0";

    /**
     * Main Method - Entry point of the application
     * JVM starts execution from here
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("====================================");
        System.out.println("     Welcome to Palindrome Checker  ");
        System.out.println("====================================");

        // Display Application Details
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);

        System.out.println("------------------------------------");
        System.out.println("Application started successfully.");
        System.out.println("------------------------------------");

        // Application flow continues to next use case (future implementation)
    }
}