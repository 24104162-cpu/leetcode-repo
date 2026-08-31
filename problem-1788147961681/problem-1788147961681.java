// Last updated: 8/31/2026, 9:16:01 AM
1class Solution {
2    public int minBishopMoves(int[] source, int[] target) {
3        int sr=source[0],sc=source[1];
4        int tr=target[0],tc=target[1];
5        if((sr+sc)%2!=(tr+tc)%2) return -1;
6        if(Math.abs(sr-tr)==Math.abs(sc-tc)) return 1;
7        return 2;
8    }
9}