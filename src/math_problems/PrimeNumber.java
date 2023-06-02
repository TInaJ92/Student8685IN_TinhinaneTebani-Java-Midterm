package math_problems;

import java.util.Arrays;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */
    public static void printPrimeNumbers(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);


        // Mark 0 and 1 as non-prime
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 1000000;
        printPrimeNumbers(n);
    }

}
