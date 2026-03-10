// Last updated: 3/10/2026, 3:14:05 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
    }
}