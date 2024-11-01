package array;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

//    You are given a large integer represented as an integer array digits, where each digit[i] is the ith digit of the integer.
//    The digits are ordered from most significant to the least significant in left-to-right order.
//    The large integer does not contain any leading 0's.
//    Increment the large integer by one and return the resulting array of digits.

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        PlusOne plus = new PlusOne();
        int [] digits = {9,8,7,6,5,4,3,2,1,0};
        digits = plus.plusOne(digits);

        for (int i : digits) {
            System.out.print(i + "\t");
        }
    }
}
