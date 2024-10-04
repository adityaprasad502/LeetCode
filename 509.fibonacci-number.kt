/*
 * @lc app=leetcode id=509 lang=kotlin
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    fun fib(n: Int): Int {
        if (n <= 1) return n
        var a = 0
        var b = 1
        for (i in 2..n) {
            val temp = a + b
            a = b
            b = temp
        }
        return b
    }
}
// @lc code=end
