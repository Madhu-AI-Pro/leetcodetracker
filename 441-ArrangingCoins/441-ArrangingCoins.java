// Last updated: 3/10/2026, 3:14:29 PM
class Solution {
   public int arrangeCoins(int n) {
    int rows = 0;
    long sum = 0; 

    
    while (sum + (rows + 1) <= n) {
        rows++;
        sum += rows;
    }

    return rows;
}
}