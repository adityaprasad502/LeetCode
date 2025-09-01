class Solution {
    fun differenceOfSum(nums: IntArray): Int {
        val elementSum = nums.sum()
        val digitSum = nums.sumOf { num -> 
            num.toString().sumOf { it.digitToInt() }
        }
        return kotlin.math.abs(elementSum - digitSum)
    }
}
