import kotlin.math.min
import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min_price = Int.MAX_VALUE
        var max_profit = 0

        for (price in prices) {
            min_price = min(min_price, price)
            max_profit = max(price-min_price, max_profit)
        }

        return max_profit
    }
}