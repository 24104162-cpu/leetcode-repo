// Last updated: 8/31/2026, 9:56:47 AM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long mr=solve(nums,k,true);
        long dr=solve(nums,k,false);
        return Math.max(mr,dr);
        
    }
    private long solve(int[] nums,int k,boolean isM){
        long s0=Long.MIN_VALUE/2;
        long s1=Long.MIN_VALUE/2;
        long s2=Long.MIN_VALUE/2;
        long ms=Long.MIN_VALUE;
        for(int x:nums){
            long opx=isM?(long)x*k:(long)x/k;
            long ns0=Math.max((long)x,s0+x);
            long ns1=Math.max(opx,Math.max(s0+opx,s1+opx));
            long ns2=Math.max(s1+x,s2+x);
            s0=ns0;
            s1=ns1;
            s2=ns2;
            ms=Math.max(ms,Math.max(s0,Math.max(s1,s2)));
            
        }
        return ms;
    }
}