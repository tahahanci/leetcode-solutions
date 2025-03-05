package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false
    if every element is distinct.

    Example 1:

    Input: nums = [1,2,3,1]
    Output: true
    Explanation: The element 1 occurs at the indices 0 and 3.
     */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            if (!integerSet.add(num)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicateWithInefficientWay(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        System.out.println(containsDuplicate.containsDuplicate(nums));
        System.out.println(containsDuplicate.containsDuplicateWithInefficientWay(nums));
    }
}
