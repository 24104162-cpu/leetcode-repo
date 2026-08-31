// Last updated: 8/31/2026, 9:55:17 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int mr=-1;
        int sum=0;

        for(int num:nums){
            int r=getDigitRange(num);

            if(r>mr){
                mr=r;
                sum=num;
            }else if(r==mr){
                sum+=num;
            }
        }
        return sum;
    }
    private int getDigitRange(int num){
        if(num==0) return 0;

        int maxd=0;
        int mind=9;
        num=Math.abs(num);

        while(num>0){
            int d=num%10;
            maxd=Math.max(maxd,d);
            mind=Math.min(mind,d);
            num/=10;
        }
        return maxd-mind;
    }
}