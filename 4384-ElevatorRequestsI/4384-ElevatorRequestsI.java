// Last updated: 8/31/2026, 9:54:28 AM
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t=0;
        int curr=0;
        for(int target:requests){
            t+=Math.abs(target-curr);
            curr=target;
        }
        return t;
    }
}