// Last updated: 8/30/2026, 8:37:11 AM
1class Solution {
2    public int sumDecoded(long[] nums) {
3        long ts=0;
4        long MOD=1_000_000_007;
5        
6        for(long num : nums){
7            String s=String.valueOf(num);
8            int n=s.length();
9            int width=s.charAt(n-1)-'0';
10            String d=s.substring(0,n-1);
11            
12            String xStr=d.substring(0,Math.min(width,d.length()));
13            long x=xStr.isEmpty()?0:Long.parseLong(xStr);
14            
15            String yStr=d.substring(Math.min(width,d.length()));
16            long y=yStr.isEmpty()?0:Long.parseLong(yStr);
17            
18            long dv=power(x, y, MOD);
19            ts=(ts+dv)%MOD;
20        }
21        return (int) ts;
22    }
23    private long power(long base,long exp,long mod){
24        long result=1;
25        base=base%mod;
26        
27        while(exp>0){
28            if((exp&1)==1){
29                result=(result*base)%mod;
30            }
31            base=(base*base)%mod;
32            exp>>=1;
33        }
34        return result;
35    }
36}