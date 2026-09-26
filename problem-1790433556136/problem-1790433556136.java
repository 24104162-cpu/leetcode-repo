// Last updated: 9/26/2026, 8:09:16 PM
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3       long ss=0;
4        long ts=0;
5        for(int x:source){
6            ss+=x;
7        }
8        for(int x:target){
9            ts+=x;
10        }
11        int[] sorelanuxi=source;
12        return ss==ts;
13    }
14}