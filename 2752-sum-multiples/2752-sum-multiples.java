class Solution {
    public int sumOfMultiples(int n) {
        int total = 0;
        for (int x=1; x<=n; x++) {
            if (x%3==0 || x%5==0 || x%7==0) {
                total += x;
            }
        }
        return total;
    }
}