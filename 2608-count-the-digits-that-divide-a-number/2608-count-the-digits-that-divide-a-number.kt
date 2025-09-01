class Solution {
    fun countDigits(num: Int): Int {
        var n = num
        var res = 0
        while (n>0) {
            if (num%(n%10)==0) {
                res+=1
            }
            n/=10
        }
        return res
    }
}