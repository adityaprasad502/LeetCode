class Solution:
    def triangleType(self, nums: List[int]) -> str:
        x,y,z=nums
        if x+y<=z or x+z<=y or y+z<=x:
            return "none"
        if x==y==z:
            return "equilateral"
        elif x!=y and y!=z and z!=x:
            return "scalene"
        else:
            return "isosceles"
        