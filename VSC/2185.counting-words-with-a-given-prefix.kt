/*
 * @lc app=leetcode id=2185 lang=kotlin
 *
 * [2185] Counting Words With a Given Prefix
 */

// @lc code=start
class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
        return words.filter { it.startsWith(pref) }.size
    }
}
// @lc code=end
