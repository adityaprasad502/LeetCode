#
# @lc app=leetcode id=507 lang=python3
#
# [507] Perfect Number
#

# @lc code=start
class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num < 2:
            return False
        s = 1
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                s += i + num // i
        return s == num
# @lc code=end
