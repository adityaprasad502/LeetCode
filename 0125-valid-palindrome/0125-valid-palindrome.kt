class Solution {
    fun isPalindrome(s: String): Boolean {
        var str = s.lowercase().replace(" ", "")
        str = str.replace(Regex("[^a-z0-9]"), "")
        return str == str.reversed()
    }
}