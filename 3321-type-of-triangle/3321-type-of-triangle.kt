class Solution {
    fun triangleType(nums: IntArray): String {
        val (x,y,z) = nums

        if (x+y<=z || x+z<=y || y+z<=x) {
            return "none"
        }

        return when {
            x==y && y==z -> "equilateral"
            x!=y && x!=z && y!=z -> "scalene"
            else -> "isosceles"
        }
    }
}