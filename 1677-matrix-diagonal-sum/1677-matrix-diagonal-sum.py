class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        c = 0
        a = 0
        b = len(mat)-1
        for i in range(len(mat)):
            if [a,a] != [a,b]:
                c += mat[a][a]
                c += mat[a][b]
            else:
                c += mat[a][a]
            
            a += 1
            b -= 1
        return c