package easy.kotlin

class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        val integerSet = mutableSetOf<Int>()

        for (num in nums) {
            if (!integerSet.add(num)) {
                return true
            }
        }

        return false
    }
}