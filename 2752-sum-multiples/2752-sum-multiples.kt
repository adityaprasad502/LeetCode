class Solution {
    fun sumOfMultiples(n: Int): Int {
        // total_sum = 0
        // for x in range(1, n + 1):
        //     if x % 3 == 0 or x % 5 == 0 or x % 7 == 0:
        //         total_sum += x
        // return total_sum

        var total = 0
        for (x in 1..n) {
            if (x%3==0 || x%5==0 || x%7==0) {
                total += x
            }
        }
        return total
    }
}