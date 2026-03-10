// Last updated: 3/10/2026, 3:14:40 PM
class Solution {
    public boolean isAnagram(String s, String t) {
           HashMap<Character,Integer> map=new HashMap<>();

        if(s.length()!=t.length())  return false;

        int[] freq=new int[26];

        for(int i=0; i<s.length(); i++)
        {
            freq[s.charAt(i)-97]++;
        }
        for(int i=0; i<t.length(); i++)
        {
            if(freq[t.charAt(i)-97]==0)   return false;
            freq[t.charAt(i)-97]--;
        }
        for(int i=0;i<freq.length; i++)
        {
            if(freq[i]!=0)  return false;
        }
        return true;
    }
}