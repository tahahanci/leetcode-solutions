package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPrimeNumberInRange {

    /*
    Given two positive integers left and right, find the two integers num1 and num2 such that:

    left <= num1 < num2 <= right .
    Both num1 and num2 are prime numbers.
    num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
    Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying these conditions,
    return the one with the smallest num1 value. If no such numbers exist, return [-1, -1].
     */

    public int[] closestPrimes(int left, int right) {
        List<Integer> primeList = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }

        if (primeList.isEmpty() || primeList.size() < 2) {
            return new int[] {-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int[] minPair = new int[2];

        for (int i = 0; i < primeList.size() - 1; i++) {
            int diff = primeList.get(i + 1) - primeList.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                minPair[0] = primeList.get(i);
                minPair[1] = primeList.get(i + 1);
            }
        }

        return minPair;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ClosestPrimeNumberInRange closestPrimeNumberInRange = new ClosestPrimeNumberInRange();
        int[] primeNumbers = closestPrimeNumberInRange.closestPrimes(10, 19);
        System.out.println(Arrays.toString(primeNumbers));
    }
}
