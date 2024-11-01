package hashtable;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException();
        }

        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            if (!integerSet.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4};

        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
}
