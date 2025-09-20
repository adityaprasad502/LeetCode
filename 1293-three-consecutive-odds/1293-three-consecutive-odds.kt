class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var count = 0
        for (a in arr) {
            if (a%2!=0) {
                count++
            } else {
                count = 0
            }
            if (count == 3) {
                return true
            }
        }
        return false
    }
 }
