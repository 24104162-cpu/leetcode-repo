// Last updated: 8/31/2026, 9:55:28 AM
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0;
        }
        if(s> 9 * n){
            return -1;
        }
        int result=0;
        
        for(int i=0;i<n;i++){
            if(s>=9){
            result=result*10+9;
                s-=9;
        }else if(s>0){
            result=result*10+s;
            s=0;
        }else{
            result=result*10;
        }
        }
        return result;
    }
}