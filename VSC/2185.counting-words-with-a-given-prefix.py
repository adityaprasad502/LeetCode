#
# @lc app=leetcode id=2185 lang=python3
#
# [2185] Counting Words With a Given Prefix
#

# @lc code=start
class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        return sum(1 for word in words if word.startswith(pref))
# @lc code=end
