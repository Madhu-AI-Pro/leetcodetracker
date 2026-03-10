// Last updated: 3/10/2026, 3:13:46 PM
import java.util.*;
class Solution {
    public boolean canAliceWin(int[] nums) {
        int totalSum = 0;
        int sumSingle = 0;
        int sumDouble = 0;
        for (int num : nums) {
            totalSum += num;
            if (num < 10) {
                sumSingle += num;
            } else {
                sumDouble += num;
            }
        }
        return (sumSingle > totalSum - sumSingle) || (sumDouble > totalSum - sumDouble);
    }
   
}