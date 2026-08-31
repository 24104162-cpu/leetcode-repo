// Last updated: 8/31/2026, 9:54:59 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int s=start[0]+start[1];
        int t=target[0]+target[1];
        return Math.abs(s%2)==Math.abs(t%2);
    }
}