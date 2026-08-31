// Last updated: 8/31/2026, 9:56:21 AM
class Solution {
    public long countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length,odd=0;
        long ev=0,ans=0;
        long[] s=new long[n+1];
        int[] oc=new int[n+1];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) ev++; else odd++;
            s[i+1]=ev*b-(long)odd*a;
            oc[i+1]=odd;
        }
        long[] sorted=s.clone();
        Arrays.sort(sorted);
        int[] bit=new int[n+2];
        List<Integer>[]g=new ArrayList[odd+1];
        for(int i=0;i<=odd;i++) g[i]=new ArrayList<>();
            for(int i=0;i<=n;i++) g[oc[i]].add(i);
        for(int o=0;o<=odd;o++){
            for(int idx:g[o]){
                int r=Arrays.binarySearch(sorted,s[idx])+1;
                int qmax=0;
                for(int i=bit.length-1;i>0;i-=i&-i) qmax+=bit[i];
                int qr=0;
                for(int i=r-1;i>0;i-=i&-i) qr+=bit[i];
                ans+=qmax-qr;
        }
            for(int idx:g[o]){
                int r=Arrays.binarySearch(sorted,s[idx])+1;
                for(int i=r;i<bit.length;i+=i&-i) bit[i]+=1;
            }
        }
        return ans;
    }
}