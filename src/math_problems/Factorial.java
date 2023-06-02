package math_problems;



    /** INSTRUCTIONS

     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.

     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */
    public class Factorial {
        // Recursive method to calculate factorial
        public static int factorialRecursive(int number) {
            // Base case: factorial of 0 or 1 is 1
            if (number == 0 || number == 1) {
                return 1;
            }
            // Recursive case: factorial(n) = n * factorial(n-1)
            return number * factorialRecursive(number - 1);
        }

        // Iterative method to calculate factorial
        public static int factorialIterative(int number) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }

    public static void main(String[] args) {
        int num = 5;

        // Calculate factorial using recursion
        int factorialRecursive = factorialRecursive(num);
        System.out.println("Factorial of " + num + " (using recursion): " + factorialRecursive);

        // Calculate factorial using iteration
        int factorialIterative = factorialIterative(num);
        System.out.println("Factorial of " + num + " (using iteration): " + factorialIterative);
    }
}




