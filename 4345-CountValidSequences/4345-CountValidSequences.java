// Last updated: 8/31/2026, 9:56:01 AM
class Solution {
    private static final int MOD=1_000_000_007;
    public int countValidSequences(int n, int k) {
        if(n<k){
            return 0;
        }
        long tw=nCr(n-1,k-1);
        long ow=0;
        if((n-k)%2==0 && (n-k)>=0){
            int items=(n-k)/2;
            ow=nCr(items+k-1,k-1);
        }
        long ans=(tw-ow+MOD)%MOD;
        return (int) ans;
    }
    private long nCr(int n,int r){
        if(r<0||r>n) return 0;
        if(r==0|| r==n) return 1;
        long num=1;
        long den=1;
        for(int i=0;i<r;i++){
            num=(num*(n-i))%MOD;
            den=(den*(i+1))%MOD;
        }
        return (num *modInverse(den,MOD))%MOD;
    }
    private long modInverse(long n,int m){
        return power(n,m-2,m);
    }
    private long power(long base,long exp,int m){
        long res=1;
        base=base%m;
        while(exp>0){
            if(exp%2==1) res=(res*base)%m;
            base=(base*base)%m;
            exp/=2;
        }
        return res;
    }
}