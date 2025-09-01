class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        a = (n*n for n in nums)
        return sorted(a)