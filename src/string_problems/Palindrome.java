package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {

    }

    // Implement here
    public class PalindromeChecker {
        public static boolean isPalindrome(String str) {

            String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


            String reversedStr = new StringBuilder(cleanStr).reverse().toString();
            return cleanStr.equals(reversedStr);
        }

        public static void main(String[] args) {
            String word = "Racecar";
            boolean isPalin = isPalindrome(word);
            if (isPalin) {
                System.out.println("'" + word + "' is a palindrome.");
            } else {
                System.out.println("'" + word + "' is not a palindrome.");
            }
        }
    }


}
