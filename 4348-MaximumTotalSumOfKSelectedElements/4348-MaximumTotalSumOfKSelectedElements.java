// Last updated: 8/31/2026, 9:55:50 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ts=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            long element=nums[n-1-i];
            long cm=Math.max(1,(long)mul-i);
            ts+=element*cm;
        }
        return ts;
    }
}