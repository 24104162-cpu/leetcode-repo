// Last updated: 8/16/2026, 8:25:04 AM
1class Solution {
2    public long elevatorRequests(int n, int start, int[][] requests) {
3        int r=requests.length;
4        if(r==0) return 0;
5
6        int ns=1<<r;
7        long[][] dp=new long[ns][r];
8        for(int i=0;i<ns;i++){
9            Arrays.fill(dp[i],Integer.MAX_VALUE);
10            
11        }
12        for(int i=0;i<r;i++){
13            long a=requests[i][0];
14            long t=requests[i][1];
15            long tt=Math.abs(start-t);
16            dp[1<<i][i]=Math.max(tt,a);
17        }
18        for(int mask=1;mask<ns;mask++){
19            for(int i=0;i<r;i++){
20                if(dp[mask][i]==Integer.MAX_VALUE){
21                    continue;
22                }
23                long curr=requests[i][1];
24                for(int j=0;j<r;j++){
25                    if((mask &(1<<j))==0){
26                        int nm=mask|(1<<j);
27                        long na=requests[j][0];
28                        long nf=requests[j][1];
29
30                        long at=dp[mask][i]+Math.abs(curr-nf);
31                        long ff=Math.max(at,na);
32                        if(ff<dp[nm][j]){
33                            dp[nm][j]=ff;
34                        }
35                    }
36                }
37            }
38        }
39        long mint=Long.MAX_VALUE;
40        for(int i=0;i<r;i++){
41            mint=Math.min(mint,dp[ns-1][i]);
42        }
43        return mint;
44    }
45}