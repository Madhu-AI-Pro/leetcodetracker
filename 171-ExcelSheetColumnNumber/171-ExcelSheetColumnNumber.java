// Last updated: 3/10/2026, 3:14:44 PM
class Solution {
    public int titleToNumber(String columnTitle) {
         int res=0;
        for(int i=0;i<columnTitle.length();i++) res=res*26+(columnTitle.charAt(i)-'A'+1);
        return res;
    }
}