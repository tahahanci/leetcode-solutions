package easy;

import java.util.Arrays;

public class ValidAnagram {

    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"

    Output: false



    Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

     */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "margana";

        ValidAnagram validAnagram = new ValidAnagram();

        boolean isAnagram = validAnagram.isAnagram(s, t);
        System.out.println(isAnagram);
    }
}
