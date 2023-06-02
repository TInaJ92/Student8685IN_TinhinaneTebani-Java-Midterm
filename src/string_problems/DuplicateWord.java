package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String inputString = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
        String[] words = inputString.toLowerCase().split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word :words) {
            if (wordCountMap.containsKey(word)){
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {

                wordCountMap.put(word, 1);
            }
        }

            System.out.println("Duplicate words and occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
        }
    }
    int totalLength = 0;
        for (String word : words) {
        totalLength += word.length();
    }
    double averageLength = (double) totalLength / words.length;

    }

}
