// Last updated: 3/10/2026, 3:14:39 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return 1 + (num-1) % 9;   
    }
}