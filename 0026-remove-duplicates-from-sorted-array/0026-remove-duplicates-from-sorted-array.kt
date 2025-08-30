class Solution {
    fun removeDuplicates(nums: IntArray): Int {
      if (nums.isEmpty()) {
            return 0
        }
        var index = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i]
                index++
            }
        }
        return index  
    }
}