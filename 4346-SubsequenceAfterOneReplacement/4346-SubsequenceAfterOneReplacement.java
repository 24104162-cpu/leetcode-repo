// Last updated: 8/31/2026, 9:55:55 AM
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length();
        int m0=0;
        int m1=0;
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            int nextM1=m1;

            if(m1<n && s.charAt(m1)==c){
                nextM1=Math.max(nextM1,m1+1);
            }
            if(m0<n){
                nextM1=Math.max(nextM1,m0+1);
            }
            if(m0<n && s.charAt(m0)==c){
                m0++;
            }
            m1=nextM1;

            if(m0==n|| m1==n){
                return true;
            }
        }
        return m0==n|| m1==n;
    }
}