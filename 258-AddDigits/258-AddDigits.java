// Last updated: 8/31/2026, 9:58:46 AM
public class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addDigits(38)); 
        System.out.println(sol.addDigits(0));  
       //System.out.println(sol.addDigits(18)); 
    }
}
