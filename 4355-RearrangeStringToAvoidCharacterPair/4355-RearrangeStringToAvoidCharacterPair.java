// Last updated: 8/31/2026, 9:55:21 AM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ty=new StringBuilder();
        StringBuilder o=new StringBuilder();
        StringBuilder tx=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==y){
                ty.append(ch);
            }else if(ch==x){
                tx.append(ch);
            }else{
                o.append(ch);
            }
        }
        return ty.append(o).append(tx).toString();
    }
}