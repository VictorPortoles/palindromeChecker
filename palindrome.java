package Palindrome;

import java.util.Scanner;

/**
 *
 * 
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();
        
        // Remove spaces and non-alphabetic characters, and convert to lowercase
        String phraseWithoutSpaces = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Convert the phrase to a character array
        char[] characters = phraseWithoutSpaces.toCharArray();

        // Check if it's a palindrome
        boolean isPalindrome = true;
        int n = characters.length;
        for (int i = 0; i < n / 2; i++) {
            if (characters[i] != characters[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("The phrase is a palindrome.");
        } else {
            System.out.println("The phrase is not a palindrome.");
        }
    }
}