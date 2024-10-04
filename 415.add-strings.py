#
# @lc app=leetcode id=415 lang=python3
#
# [415] Add Strings
#

# @lc code=start
class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        res = []
        carry = 0
        i, j = len(num1) - 1, len(num2) - 1
        while i >= 0 or j >= 0 or carry:
            n1 = n2 = 0
            if i >= 0:
                n1 = ord(num1[i]) - ord('0')
                i -= 1
            if j >= 0:
                n2 = ord(num2[j]) - ord('0')
                j -= 1
            carry, val = divmod(n1 + n2 + carry, 10)
            res.append(str(val))
        return ''.join(res[::-1])
# @lc code=end
