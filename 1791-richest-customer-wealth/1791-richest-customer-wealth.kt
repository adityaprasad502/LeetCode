class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxKnown = 0
        for (account in accounts) {
            maxKnown = maxOf(account.sum(), maxKnown)
        }
        return maxKnown
    }
}