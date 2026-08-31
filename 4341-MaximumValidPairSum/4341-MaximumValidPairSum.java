// Last updated: 8/31/2026, 9:56:05 AM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
       int n=nums.length;
        int mv=-1;
        int pm=Integer.MIN_VALUE;
        for(int j=k;j<n;j++){
            pm=Math.max(pm,nums[j-k]);
            mv=Math.max(mv,pm+nums[j]);
        }
        return mv;
    }
}