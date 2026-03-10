// Last updated: 3/10/2026, 3:14:49 PM
class Solution {
public int romanToInt(String s) {
    // Map Roman symbols to their values
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int total = 0;

    // Traverse the string
    for (int i = 0; i < s.length(); i++) {
        int value = map.get(s.charAt(i));

        // If next value is larger, subtract current value
        if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
            total -= value;
        } else {
            total += value;
        }
    }

    return total;
}
}