#
# @lc app=leetcode id=13 lang=python3
#
# [13] Roman to Integer
#

# @lc code=start
class Solution:
    def romanToInt(self, s: str) -> int:
        roman = {
            "I": 1, 
            "V": 5, 
            "X": 10, 
            "L": 50, 
            "C": 100, 
            "D": 500, 
            "M": 1000
        }
        result = 0
        prev = 0
        for i in s[::-1]:
            if roman[i] >= prev:
                result += roman[i]
            else:
                result -= roman[i]
            prev = roman[i]
        return result
        
# @lc code=end
