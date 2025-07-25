class Solution {
    fun maxSum(nums: IntArray): Int {
        var s = 0
        val x = nums.toSet()
        for (i in x) {
            if (i > 0) {
                s += i
            }
        }
        return if (s == 0) nums.maxOrNull()!! else s
    }
}
