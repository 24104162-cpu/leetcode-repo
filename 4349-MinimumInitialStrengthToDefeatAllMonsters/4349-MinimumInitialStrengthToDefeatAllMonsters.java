// Last updated: 8/31/2026, 9:55:46 AM
class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n=monsters.length;
        long[] diff=new long[n+1];
        for(int[] b:boosts){
            diff[b[0]]+=b[2];
            if(b[1]+1<n){
                diff[b[1]+1]-=b[2];
            }
        }
        long[] bonus=new long[n];
        long cur=0;
        for(int i=0;i<n;i++){
            cur+=diff[i];
            bonus[i]=cur;
        }
        long low=0;
        long high=0;
        for(int x:monsters) high+=x;
        while(low<high){
            long mid=low+(high-low)/2;
            if(canDefeat(mid,monsters,bonus)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private boolean canDefeat(long strength,int[] monsters,long[] bonus){
        long cur=strength;
        for(int i=0;i<monsters.length;i++){
            if(cur+bonus[i]<monsters[i]){
                return false;
            }
            cur-=monsters[i];
            if(cur<0) cur=0;
        }
        return true;
    }
}