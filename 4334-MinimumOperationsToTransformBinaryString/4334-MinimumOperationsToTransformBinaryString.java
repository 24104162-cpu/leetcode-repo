// Last updated: 8/31/2026, 9:56:14 AM
class Solution {
    public int minOperations(String s1,String  s2) {
        int n=s1.length();
        int t=0;
        List<Integer>excess=new ArrayList<>();
        for(int i=0;i<n;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1=='0' && c2=='1'){
                t++;
            }else if(c1=='1'&&c2=='0'){
                excess.add(i);
            }
        }
        if(excess.isEmpty()){
            return t;
        }
        if(n<2){
            return -1;
        }
        int pairs=0;
        int i=0;
        while(i<excess.size()-1){
            if(excess.get(i+1)==excess.get(i)+1){
                pairs++;
                i+=2;
            }
            else{
                i++;
            }
        }
        int excesscost=2*excess.size()-3*pairs;
        return t+excesscost;
    }
}