// Last updated: 8/31/2026, 9:54:26 AM
class Solution {
    public long elevatorRequests(int n, int start, int[][] requests) {
        int r=requests.length;
        if(r==0) return 0;

        int ns=1<<r;
        long[][] dp=new long[ns][r];
        for(int i=0;i<ns;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
            
        }
        for(int i=0;i<r;i++){
            long a=requests[i][0];
            long t=requests[i][1];
            long tt=Math.abs(start-t);
            dp[1<<i][i]=Math.max(tt,a);
        }
        for(int mask=1;mask<ns;mask++){
            for(int i=0;i<r;i++){
                if(dp[mask][i]==Integer.MAX_VALUE){
                    continue;
                }
                long curr=requests[i][1];
                for(int j=0;j<r;j++){
                    if((mask &(1<<j))==0){
                        int nm=mask|(1<<j);
                        long na=requests[j][0];
                        long nf=requests[j][1];

                        long at=dp[mask][i]+Math.abs(curr-nf);
                        long ff=Math.max(at,na);
                        if(ff<dp[nm][j]){
                            dp[nm][j]=ff;
                        }
                    }
                }
            }
        }
        long mint=Long.MAX_VALUE;
        for(int i=0;i<r;i++){
            mint=Math.min(mint,dp[ns-1][i]);
        }
        return mint;
    }
}