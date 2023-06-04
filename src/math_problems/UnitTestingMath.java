package math_problems;

import java.util.Arrays;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {
        Factorial();
        fibonacciClass();
        lowestDifferenceClass();
        missingNumberClass();
        lowestNumberClass();
        patternClass();
        primeNumberClass();

    }

    /**
     * this method is to return Factorial of any number
     */
    public static void Factorial() {

            int num = 5;

            // Calculate factorial using recursion
            int factorialRecursive = Factorial.factorialRecursive(num);
            System.out.println("Factorial of " + num + " (using recursion): " + factorialRecursive);

            // Calculate factorial using iteration
            int factorialIterative = Factorial.factorialIterative(num);
            System.out.println("Factorial of " + num + " (using iteration): " + factorialIterative);


    }

    /**
     * this method is to find Fibonacci number
     */
    public static void fibonacciClass() {
        // Set it to the number of elements you want in the Fibonacci Series
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i = 1; i <= maxNumber; ++i)
        {
            System.out.print(previousNumber+" ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

    /**
     * this method is to find Lowest difference
     */
    public static void lowestDifferenceClass() {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        int lowestUniqueNumber = FindLowestDifference.findLowestUniqueNumber(array1, array2);
        System.out.println("The lowest unique number is: " + lowestUniqueNumber);

    }

    /**
     * this method is to find Missing number
     */
    public static void missingNumberClass() {

        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = FindMissingNumber.findMissingNumber(array);
        System.out.println("Missing number: " + missingNumber);
    }

    /**
     * this method is to find Lowest number
     */
    public static void lowestNumberClass() {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};
        int lowestNumber = LowestNumber.findLowestNumber(array);
        System.out.println("The lowest number is: " + lowestNumber );

    }

    /**
     * this method is to identify a Pattern
     */
    public static void patternClass() {
        Pattern.printPattern();
    }

    /**
     * this method is to find Prime number
     */
    public static void primeNumberClass() {
        int n = 1000000;
        PrimeNumber.printPrimeNumbers(n);
    }


}





