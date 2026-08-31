// Last updated: 8/31/2026, 9:55:44 AM
class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int mint=Integer.MAX_VALUE;
        char[] curr=s.toCharArray();
        for(int k=0;k<n;k++){
            int p=0;
            for(int i=0;i<n/2;i++){
                int l=i;
                int r=n-1-i;
                
                char c1=curr[(l+k)%n];
                char c2=curr[(r+k)%n];
                
                if(c1!=c2){
                    int diff=Math.abs(c1-c2);
                    
                    p+=Math.min(diff,26-diff);
                }
            }
            int t=k+p;
            mint=Math.min(mint,t);
        }
        return mint;
    }
}