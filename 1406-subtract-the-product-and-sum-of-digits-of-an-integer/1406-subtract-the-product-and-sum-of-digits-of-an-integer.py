class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        s,p=0,1
        for i in str(n):
            i = int(i)
            s+=i
            p*=i
        return p-s
            