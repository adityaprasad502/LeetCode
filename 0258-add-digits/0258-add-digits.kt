class Solution {
    fun addDigits(num: Int): Int {
        val x = when {
            num==0 -> 0
            num%9==0 -> 9
            else -> num%9
        }
        return x
    }
}