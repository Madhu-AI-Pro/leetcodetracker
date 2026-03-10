// Last updated: 3/10/2026, 3:14:10 PM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
         Map<Double,Long> m = new HashMap<>();
        
        long ans=0;
        for(int i=0;i<rectangles.length;i+=1){
            double val = rectangles[i][0] / (double)rectangles[i][1];
            ans+=m.getOrDefault(val,0L);
            m.put(val,m.getOrDefault(val,0L)+1);
        }
        return ans;
    }
}