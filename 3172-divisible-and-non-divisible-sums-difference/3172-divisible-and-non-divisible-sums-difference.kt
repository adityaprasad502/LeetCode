class Solution {
    fun differenceOfSums(n: Int, m: Int): Int {

        var sum1 = 0
        var sum2 = 0
        for (x in 1..n) {
            if (x%m == 0) sum1+=x
            else sum2+=x
        }
        return sum2-sum1
    }
}