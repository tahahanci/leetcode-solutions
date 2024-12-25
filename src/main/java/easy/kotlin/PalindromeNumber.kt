package easy.kotlin

class PalindromeNumber {

    fun palindromeNumber(x: Int): Boolean {
        var palindromeNumber = 0
        var number = x

        if (x < 0) {
            return false
        }

        var temp = x
        while (temp > 0) {
            val remainder = temp % 10
            palindromeNumber = (palindromeNumber * 10) + remainder
            temp /= 10
        }

        return palindromeNumber == number
    }
}