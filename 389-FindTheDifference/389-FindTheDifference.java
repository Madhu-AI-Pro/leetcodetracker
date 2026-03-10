// Last updated: 3/10/2026, 3:14:32 PM
class Solution {
    public char findTheDifference(String s, String t) {
         int num = 0;

        for(int cs : s.toCharArray()) num -= cs;

        for(int ct : t.toCharArray()) num += ct;

        return (char) (num);
        
    }
}