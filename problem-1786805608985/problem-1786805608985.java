// Last updated: 8/15/2026, 8:23:28 PM
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int mint=Integer.MAX_VALUE;
5        char[] curr=s.toCharArray();
6        for(int k=0;k<n;k++){
7            int p=0;
8            for(int i=0;i<n/2;i++){
9                int l=i;
10                int r=n-1-i;
11                
12                char c1=curr[(l+k)%n];
13                char c2=curr[(r+k)%n];
14                
15                if(c1!=c2){
16                    int diff=Math.abs(c1-c2);
17                    
18                    p+=Math.min(diff,26-diff);
19                }
20            }
21            int t=k+p;
22            mint=Math.min(mint,t);
23        }
24        return mint;
25    }
26}