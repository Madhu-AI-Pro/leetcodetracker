// Last updated: 3/10/2026, 3:13:44 PM
class Solution {
    public int findClosest(int x, int y, int z) {
         int dist1 = Math.abs(x - z);
        int dist2 = Math.abs(y - z);

        if (dist1 == dist2) return 0;
        return (dist1 < dist2) ? 1 : 2;
    }
}