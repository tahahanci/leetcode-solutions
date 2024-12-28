package easy;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int counter = 0, candidateNumber = -1;

        for (int num : nums) {
            if (counter == 0) {
                candidateNumber = num;
                counter = 1;
            } else {
                if (num == candidateNumber)
                    counter++;
                else
                    counter--;
            }
        }

        counter = 0;
        for (int num : nums) {
            if (num == candidateNumber)
                counter++;
        }

        if (counter > (nums.length / 2)) {
            return candidateNumber;
        }

        return -1;
    }

    public static void main(String[] args) {
        MajorityElement mj = new MajorityElement();
        int[] arr = { 1, 1, 1, 1, 2, 3, 4 };
        int majorityElement = mj.majorityElement(arr);
        System.out.println(majorityElement);
    }
}
