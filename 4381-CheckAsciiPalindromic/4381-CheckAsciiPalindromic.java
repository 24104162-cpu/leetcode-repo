// Last updated: 8/31/2026, 9:54:42 AM
class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            String binary = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
            sb.append(binary);
        }
        String binaryStr=sb.toString();
        int left=0;
        int right=binaryStr.length()-1;
        while(left<right){
            if(binaryStr.charAt(left)!=binaryStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}