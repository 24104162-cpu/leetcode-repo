// Last updated: 8/31/2026, 9:54:30 AM
class Solution {
    public int sumDecoded(long[] nums) {
        long ts=0;
        long MOD=1_000_000_007;
        
        for(long num : nums){
            String s=String.valueOf(num);
            int n=s.length();
            int width=s.charAt(n-1)-'0';
            String d=s.substring(0,n-1);
            
            String xStr=d.substring(0,Math.min(width,d.length()));
            long x=xStr.isEmpty()?0:Long.parseLong(xStr);
            
            String yStr=d.substring(Math.min(width,d.length()));
            long y=yStr.isEmpty()?0:Long.parseLong(yStr);
            
            long dv=power(x, y, MOD);
            ts=(ts+dv)%MOD;
        }
        return (int) ts;
    }
    private long power(long base,long exp,long mod){
        long result=1;
        base=base%mod;
        
        while(exp>0){
            if((exp&1)==1){
                result=(result*base)%mod;
            }
            base=(base*base)%mod;
            exp>>=1;
        }
        return result;
    }
}