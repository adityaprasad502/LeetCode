class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_known = 0
        for account in accounts:
            max_known = max(sum(account), max_known)
        return max_known