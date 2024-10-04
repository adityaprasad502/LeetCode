/*
 * @lc app=leetcode id=1360 lang=java
 *
 * [1360] Number of Days Between Two Dates
 */

// @lc code=start
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1971(date1) - daysFrom1971(date2));
    }
}
// @lc code=end
