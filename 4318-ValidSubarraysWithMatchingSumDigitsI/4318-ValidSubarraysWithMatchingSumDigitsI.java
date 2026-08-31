// Last updated: 8/31/2026, 9:56:28 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        long[]p=new long[n+1];
        
        TreeSet<Long>[] sets=new TreeSet[10];
        List<Long>[]cd=new ArrayList[10];
        int[][] bit=new int[10][];
        for(int i=0;i<10;i++){
            sets[i]=new TreeSet<>();
            sets[i].add(0L);
        }
        for(int i=0;i<n;i++){
            p[i+1]=p[i]+nums[i];
            sets[(int)(p[i+1]%10)].add(p[i+1]);
        }
        for(int i=0;i<10;i++){
            cd[i]=new ArrayList<>(sets[i]);
            bit[i]=new int[cd[i].size()+1];
        }
        update(bit[0],1);
        
        long ans=0;
        for(int i=1;i<=n;i++){
            long val=p[i];
            int rem=(int)(val%10);
            int tr=(rem-x+10)%10;
            long p10=1;
            while(val/x>=p10){
                int high=bs(cd[tr],val-x*p10);
                int low=bs(cd[tr],val-(x+1)*p10);
                ans+=q(bit[tr],high)-q(bit[tr],low);
                if(p10>Long.MAX_VALUE/10)break;
                p10*=10;
            }
            int bIdx=Collections.binarySearch(cd[rem],val)+1;
            update(bit[rem],bIdx);
        }
        return (int) ans;
    }
    int q(int[]b,int idx){
        int s=0;
        for(;idx>0;idx-=idx&-idx)s+=b[idx];
        return s;
    }
    void update(int []b,int idx){
        for(;idx<b.length;idx+=idx&-idx)b[idx]++;
    }
    int bs(List<Long>l,long t){
        int idx=Collections.binarySearch(l,t);
        return idx>=0?idx+1:-idx-1;
    }
}