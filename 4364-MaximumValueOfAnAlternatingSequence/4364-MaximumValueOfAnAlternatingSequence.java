// Last updated: 8/31/2026, 9:55:03 AM
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n<=1){
            return s;
        }
        long t=(n%2==0)?(n-1):(n-2);
        if(t<1){
            return s;
        }
        long paris=t/2;
        long gain=paris*(m-1)+m;
        return s+gain;
    }
}