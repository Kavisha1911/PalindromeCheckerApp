public class UseCase4PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "Version 1.0 - UC4";

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("====================================");
        System.out.println();

        // Hardcoded String
        String input = "radar";

        // Convert String to Character Array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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