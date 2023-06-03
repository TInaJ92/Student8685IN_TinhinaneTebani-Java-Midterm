package math_problems;

public class FindLowestDifference {


    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */
    public static int findLowestUniqueNumber(int[] array1, int[] array2) {
        int lowestNumber = Integer.MAX_VALUE;

        for (int num1 : array1) {
            boolean foundInArray2 = false;
            for (int num2 : array2) {
                if (num1 == num2) {
                    foundInArray2 = true;
                    break;
                }
            }
            if (!foundInArray2 && num1 < lowestNumber) {
                lowestNumber = num1;
            }
        }
        for (int num2 : array2) {
            boolean foundInArray1 = false;

            for (int num1 : array1) {
                if (num2 == num1) {
                    foundInArray1 = true;
                    break;
                }
            }

            if (!foundInArray1 && num2 < lowestNumber) {
                lowestNumber = num2;
            }
        }

        return lowestNumber;
    }
    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        int lowestUniqueNumber = findLowestUniqueNumber(array1, array2);
        System.out.println("The lowest unique number is: " + lowestUniqueNumber);

    }



}
