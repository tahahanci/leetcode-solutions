package easy.kotlin

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        var counter = 0
        var candidateNumber = -1

        for (num in nums) {
            if (counter == 0) {
                candidateNumber = num
                counter = 1
            } else {
                counter += if (num == candidateNumber) 1 else -1
            }
        }

        counter = 0
        for (num in nums) {
            if (num == candidateNumber) {
                counter++
            }
        }

        return if (counter > nums.size / 2) candidateNumber else -1
    }
}