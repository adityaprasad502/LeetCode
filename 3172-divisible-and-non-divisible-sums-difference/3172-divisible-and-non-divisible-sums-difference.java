class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int x = 1; x<=n; x++) {
            if (x%m == 0) sum1+=x;
            else sum2+=x;
        }
        return sum2-sum1;
    }
}