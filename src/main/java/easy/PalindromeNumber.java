package easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int palindromeNumber = 0;
        int number = x;
        if (x < 0) {
            return false;
        }

        while (x > 0) {
            int remainder = x % 10;
            palindromeNumber = (palindromeNumber * 10) + remainder;
            x /= 10;
        }

        return palindromeNumber == number;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindrome = palindromeNumber.isPalindrome(121);
        System.out.println(isPalindrome);
    }
}
