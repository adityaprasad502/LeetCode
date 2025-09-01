class Solution {
    fun canAliceWin(nums: IntArray): Boolean {
        var a=0
        var b=0
        for (n in nums) {
            if (n < 10) {
                a+=n
            } else {
                b+=n
            }
        }
        return a!=b
    }
}