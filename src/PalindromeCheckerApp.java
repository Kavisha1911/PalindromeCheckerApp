import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "Version 1.0 - UC6";

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("====================================");
        System.out.println();

        // Hardcoded String
        String input = "racecar";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue (FIFO)
            stack.push(ch);    // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare Dequeue vs Pop
        for (int i = 0; i < input.length(); i++) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
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