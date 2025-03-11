package medium;

public class NumberOfSubstrings {

    /*
    Given a string s consisting only of characters a, b and c.

    Return the number of substrings containing at least one occurrence of all these characters a, b and c.

    Example 1:

    Input: s = "abcabc"
    Output: 10
    Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).

    Example 2:
    Input: s = "aaacb"
    Output: 3
    Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".

    Example 3:
    Input: s = "abc"
    Output: 1
     */

    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3];
        int left = 0, result = 0;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += n - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        NumberOfSubstrings substrings = new NumberOfSubstrings();
        String word = "abcabc";

        System.out.print(substrings.numberOfSubstrings(word));
    }
}
