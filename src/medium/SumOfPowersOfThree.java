package medium;

public class SumOfPowersOfThree {

    /*
    Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.
    An integer y is a power of three if there exists an integer x such that y == 3x.
    Example 1:

    Input: n = 12
    Output: true
    Explanation: 12 = 3^1 + 3^2
    Example 2:

    Input: n = 91
    Output: true
    Explanation: 91 = 3^0 + 3^2 + 3^4
    Example 3:

    Input: n = 21
    Output: false
     */

    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }

            n /= 3;
        }

        return true;
    }

    public static void main(String[] args) {
        SumOfPowersOfThree powersOfThree = new SumOfPowersOfThree();
        boolean isPowerOfThree = powersOfThree.checkPowersOfThree(21);
        System.out.println("Is power of three: " + isPowerOfThree);
    }
}
