// Last updated: 8/31/2026, 9:55:39 AM
import java.math.BigInteger;
class Solution {
    public int minimumCost(int[] nums, int k) {
        long t=0;
        long c=k;
        long mod=1_000_000_007L;
        for(int n:nums){
            if(c<n){
                long d=(long)n-c;
                long o=(d+k-1)/k;
                t+=o;
                c+=(o*(long)k);
            }
            c-=n;
        }
        long nu=t%mod;
        long np=(t+1)%mod;
        long i=500000004L;
        long r=(((nu*np)%mod)*i)%mod;
        return (int) r;
    }
}