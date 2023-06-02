package math_problems;

public class FindMissingNumber {
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Number of elements in the array plus the missing number
        int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n

        // Calculate the sum of all elements in the array
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

        /** INSTRUCTIONS
         * Write a method to find the missing number from the array.
         */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = findMissingNumber(array);
        System.out.println("Missing number: " + missingNumber);
    }
}



