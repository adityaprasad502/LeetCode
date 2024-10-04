class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()
        val p1 = nums[0] * nums[1] * nums[nums.size - 1]
        val p2 = nums[nums.size - 1] * nums[nums.size - 2] * nums[nums.size - 3]

        return maxOf(p1, p2)
    }
}
