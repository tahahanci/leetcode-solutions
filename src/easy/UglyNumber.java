package easy;

public class UglyNumber {

    /*
    An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
    Given an integer n, return true if n is an ugly number.

    Example 1:

    Input: n = 6
    Explanation: 6 = 2 × 3
    Output: true
    */

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        boolean isUgly = uglyNumber.isUgly(14);
        System.out.println(isUgly);
    }
}
