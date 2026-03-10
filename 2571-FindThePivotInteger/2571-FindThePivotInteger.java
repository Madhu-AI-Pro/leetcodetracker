// Last updated: 3/10/2026, 3:14:02 PM
class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int x = (int) Math.sqrt(totalSum);

        if (x * x == totalSum) {
            return x;
        }
        return -1;

    }
}
