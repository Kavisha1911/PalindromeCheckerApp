import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "Version 1.0 - UC7";

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("====================================");
        System.out.println();

        // Hardcoded String
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque (rear)
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque size <= 1
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // remove from front
            char rear = deque.removeLast();    // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String : " + input);
        System.out.println();

        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("\nProgram exited successfully.");
    }
}