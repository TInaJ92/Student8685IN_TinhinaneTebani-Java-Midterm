package string_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
public static boolean isAnagram (String str1,String str2) {
    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();
    if (str1.length() != str2.length()) {
        return false;
    }
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray1, charArray2);
}
public static void main(String[] args){
    String str1 = "listen";
    String str2 = "silent";
    if (isAnagram(str1, str2)) {
        System.out.println(str1 + "and" + str2 + "are Anagrams. ");
    }
    else {
        System.out.println(str1 + " and " + str2 + " are not anagrams.");

    }
    }
}

