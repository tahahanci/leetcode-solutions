package hashtable;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int[] numIndexes = new int[2];

        for (int i = 0; i  < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                numIndexes[0] = numMap.get(complement);
                numIndexes[1] = i;
                return numIndexes;
            }

            numMap.put(nums[i], i);
        }

        return numIndexes;
    }

    public static void main(String[] args) {
        TwoSum test = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] numIndexes = test.twoSum(nums, target);

        for (int i : numIndexes) {
            System.out.print(i + "\n");
        }
    }

}
