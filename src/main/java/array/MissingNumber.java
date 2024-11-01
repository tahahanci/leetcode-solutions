package array;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int element = nums.length;
        int sum = (element * (element + 1)) / 2;

        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return sum - arraySum;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber.missingNumber(nums));
    }
}
