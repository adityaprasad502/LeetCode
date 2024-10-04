class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        sum1 = 0
        sum2 = 0
        for x in range(1, n+1):
            if x%m == 0:
                sum1+=x
            else:
                sum2+=x
        return sum2-sum1