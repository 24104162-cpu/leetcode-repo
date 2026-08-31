// Last updated: 8/31/2026, 9:55:23 AM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums[nums.length/2];
        int c=0;
        for(int num:nums){
            if(num==mid){
                c++;
            }
        }
        return c==1;
    }
}