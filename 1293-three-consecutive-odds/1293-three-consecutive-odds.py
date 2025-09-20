class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        count = 0
        for value in arr:
            if value%2 != 0:
                count+=1
            else:
                 count = 0
            if count == 3:
                return True
        return False