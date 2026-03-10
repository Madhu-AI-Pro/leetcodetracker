// Last updated: 3/10/2026, 3:14:45 PM
class Solution {
    public String convertToTitle(int columnNumber) {
         StringBuilder builder = new StringBuilder();
        
        while (columnNumber > 0) { 
            int remainder = (columnNumber-1) % 26;
            builder.append((char)('A' + remainder));
            columnNumber = (columnNumber-1)/26;
        }
        
        return builder.reverse().toString();
    }
}