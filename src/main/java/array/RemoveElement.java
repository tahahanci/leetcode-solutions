package array;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public int removeElement(int[] nums, int target) {
        List<Integer> integerList = new ArrayList<>();

        for (int num : nums) {
            if (num != target) {
                integerList.add(num);
            }
        }

        for (int i = 0; i < integerList.size(); i++) {
            nums[i] = integerList.get(i);
        }

        return integerList.size();
    }

    public static void main(String[] args) {
        RemoveElement remover = new RemoveElement();

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;

        int size = remover.removeElement(nums, target);
        System.out.println(size);
    }
}
