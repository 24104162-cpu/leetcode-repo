// Last updated: 8/31/2026, 9:56:45 AM
class Solution {
    public int minimumGroups(String[] words) {
        Set<String> ug=new HashSet<>();
        for(String word:words){
            StringBuilder evensb=new StringBuilder();
            StringBuilder oddsb=new StringBuilder();

            for(int i=0;i<word.length();i++){
                if(i%2==0){
                    evensb.append(word.charAt(i));
                }else{
                    oddsb.append(word.charAt(i));
                }
            }
            String me=getMinRotation(evensb.toString());
            String mo=getMinRotation(oddsb.toString());
           
            ug.add(me+"#"+mo);
        }
        return ug.size();
    }
    private String getMinRotation(String s){
        int n=s.length();
        if(n<=1) return s;

        int i=0,j=1,k=0;
        while(i<n && j<n && k<n){
            char ci=s.charAt((i+k)%n);
            char cj=s.charAt((j+k)%n);
            if(ci==cj){
                k++;
            }else{
                if(ci>cj){
                    i+=k+1;
                }else{
                    j+=k+1;
                }
                if(i==j){
                    j++;
                }
                k=0;
            }
        }
        int start=Math.min(i,j);
        return s.substring(start)+s.substring(0,start);
    }
}