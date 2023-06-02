package math_problems;

public class Pattern {

    /** INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     *
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
     *
     */

        public static void printPattern() {
            int number = 100;

            while (number >= 32) {
                System.out.print(number + ", ");

                if (number >= 90) {
                    number--;
                } else if (number >= 70) {
                    number -= 2;
                } else {
                    number -= 3;
                }
            }
        }
    public static void main(String[] args) {
        printPattern();
    }
}
