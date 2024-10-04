class Solution {
    fun isPowerOfFour(n: Int): Boolean {
    if (n <= 0) { 
        return false
    }
    return (n and (n - 1)) == 0 && (n and 0xAAAAAAAA.toInt()) == 0
    }
}