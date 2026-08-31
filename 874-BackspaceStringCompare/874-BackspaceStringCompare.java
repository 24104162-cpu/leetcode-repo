// Last updated: 8/31/2026, 9:57:53 AM
class Solution {
    public String eval(String s) {
        Stack<Character> stk = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                stk.push(ch); 
            } else if (!stk.isEmpty()) {
                stk.pop();    
            }
        }
   
        StringBuilder res = new StringBuilder();
        for (char ch : stk) {
            res.append(ch);
        }
        return res.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return eval(s).equals(eval(t));
    }
}