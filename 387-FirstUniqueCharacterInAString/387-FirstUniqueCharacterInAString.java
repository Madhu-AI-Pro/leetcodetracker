// Last updated: 3/10/2026, 3:14:33 PM
class Solution {
    public int firstUniqChar(String s) {
      for(char c : s.toCharArray()){
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if(index == lastIndex)
                return index;
        }
        return -1;
    }
}