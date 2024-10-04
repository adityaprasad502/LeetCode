#
# @lc app=leetcode id=1360 lang=python3
#
# [1360] Number of Days Between Two Dates
#

# @lc code=start
class Solution:
    def daysBetweenDates(self, date1: str, date2: str) -> int:
        from datetime import datetime
        d1 = datetime.strptime(date1, '%Y-%m-%d')
        d2 = datetime.strptime(date2, '%Y-%m-%d')
        return abs((d1 - d2).days)
# @lc code=end
