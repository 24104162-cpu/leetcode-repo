// Last updated: 9/26/2026, 8:07:01 PM
1class Solution {
2    public int minQueenMoves(int[] source, int[] target) {
3        int sr=source[0];
4        int sc=source[1];
5        int tr=target[0];
6        int tc=target[1];
7
8        if(sr==tr && sc==tc){
9            return 0;
10        }
11        if(sr==tr|| sc==tc){
12            return 1;
13        }
14        if(Math.abs(sr-tr)==Math.abs(sc-tc)){
15            return 1;
16        }
17        return 2;
18    }
19}