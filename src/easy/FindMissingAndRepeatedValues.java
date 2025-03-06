package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeatedValues {

    /*
    You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n^2].
    Each integer appears exactly once except a which appears twice and b which is missing.
    The task is to find the repeating and missing numbers a and b.

    Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

    Example 1:

    Input: grid = [[1,3],[2,2]]
    Output: [2,4]
    Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
    Example 2:

    Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
    Output: [9,5]
    Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
     */

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeatedValue = findRepeatedValue(grid);
        int missingElement = findMissingElement(grid, repeatedValue);

        return new int[] {repeatedValue, missingElement};
    }

    private int findRepeatedValue(int[][] grid) {
        Set<Integer> integerSet = new HashSet<>();
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (!integerSet.add(anInt)) {
                    return anInt;
                }
            }
        }

        throw new RuntimeException("There is no such repeated values");
    }

    private int findMissingElement(int[][] grid, int repeatedValue) {
        int n = grid.length;
        int expectedSum = (n * n * (n * n + 1)) / 2;
        int actualSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
            }
        }

        return expectedSum - (actualSum - repeatedValue);
    }

    public static void main(String[] args) {
        FindMissingAndRepeatedValues findMissingAndRepeatedValues = new FindMissingAndRepeatedValues();
        int[][] array = {
                {9, 1, 7},
                {8, 9, 2},
                {3, 4, 6}
        };

        int[] missingAndRepeated = findMissingAndRepeatedValues.findMissingAndRepeatedValues(array);
        System.out.println(Arrays.toString(missingAndRepeated));
    }
}
