// Last updated: 8/31/2026, 9:56:07 AM
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,wildcards=0;
        for(char move:moves.toCharArray()){
            if(move=='L') x--;
            else if(move=='R') x++;
            else if(move=='U') y++;
            else if(move=='D') y--;
            else if(move=='_') wildcards++;
        }
        return Math.abs(x)+Math.abs(y)+wildcards;
    }
}