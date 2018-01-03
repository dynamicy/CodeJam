class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        if (nums.isEmpty()) {
            return
        }

        var j: Int = 0
        for (i in 0..nums.size - 1) {
            if (nums[i] != 0) {
                val temp: Int = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                j++
            }
        }
    }
}