package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            if (!integerSet.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1, 2, 1, 4, 6};
        boolean result = cd.containsDuplicate(nums);
        System.out.println(result);
    }
}
