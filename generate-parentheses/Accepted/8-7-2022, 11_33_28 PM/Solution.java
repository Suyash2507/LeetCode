// https://leetcode.com/problems/generate-parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        int open = n;
        int close = n;
        List<String> sol = new ArrayList();
        String temp="";
        helper(sol, open, close, temp);
        return sol;
    }
    void helper(List<String> sol, int open, int close, String t){
        if(open==0 && close==0){
            sol.add(t);
            return;
        }
        if(open != 0){
            String t1 =t;
            t1=t1.concat("(");
            helper(sol, open-1, close, t1);
        }
        if(close>open){
            String t2 =t;
            t2=t2.concat(")");
            helper(sol, open, close-1, t2);
        }
        return;
    }
}