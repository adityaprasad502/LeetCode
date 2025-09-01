class Solution {
    fun subtractProductAndSum(n: Int): Int {
        val digits = n.toString().map { it - '0' }
        return digits.reduce { acc, d -> acc * d } - digits.sum()
    }
}