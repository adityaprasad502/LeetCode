/*
 * @lc app=leetcode id=1185 lang=java
 *
 * [1185] Day of the Week
 */

// @lc code=start
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDays = 0;
        for (int i = 1971; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysOfMonth[i];
        }
        totalDays += day;
        if (isLeapYear(year) && month > 2) {
            totalDays++;
        }
        return days[(totalDays + 4) % 7];
    }
}
// @lc code=end
