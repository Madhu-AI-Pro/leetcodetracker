// Last updated: 3/10/2026, 3:14:46 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i]; 
        }
        return ans;    
    }
}