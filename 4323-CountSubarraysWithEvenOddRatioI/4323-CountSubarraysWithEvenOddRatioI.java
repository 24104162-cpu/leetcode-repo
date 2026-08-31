// Last updated: 8/31/2026, 9:56:25 AM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length;
        int v=0;
        for(int i=0;i<n;i++){
            int ec=0;
            int oc=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    ec++;
                }else{
                    oc++;
                }
                if(oc>0 && (long)ec *b<=(long)oc * a) {
                    v++;
                }     
            }
        }
        return v;
    }
}