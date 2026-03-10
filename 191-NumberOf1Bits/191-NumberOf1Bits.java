// Last updated: 3/10/2026, 3:14:43 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n&1)==1) {
                count++;
            }
            n>>=1;
        }
        return count;
    }
}