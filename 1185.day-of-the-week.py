#
# @lc app=leetcode id=1185 lang=python3
#
# [1185] Day of the Week
#


# @lc code=start
class Solution:
    def dayOfTheWeek(self, day: int, month: int, year: int) -> str:
        import datetime
        days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
        return days[datetime.datetime(year, month, day).weekday()]


# @lc code=end
