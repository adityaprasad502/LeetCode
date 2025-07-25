class Solution {
    fun scoreOfString(s: String): Int {
        var c = 0
        for (i in 0 until s.length - 1) {
            c += abs(s[i].code - s[i + 1].code)
        }
        return c
    }
}