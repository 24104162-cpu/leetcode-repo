// Last updated: 8/31/2026, 9:55:01 AM
class Solution {
    public int countValidPrefixes(String s) {
        int z=0;
        int o=0;
        int v=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                z++;
            }else{
                o++;
            }
            if(Math.abs(z-o)<=1){
                v++;
            }
        }
        return v;
    }
}