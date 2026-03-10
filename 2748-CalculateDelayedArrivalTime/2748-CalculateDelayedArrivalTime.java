// Last updated: 3/10/2026, 3:13:52 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime) % 24;
    }
}