// https://leetcode.com/problems/backspace-string-compare

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1= new Stack<Character>();
        Stack<Character> stack2= new Stack<Character>();
        int i=0,j=0;
        String sol1="",sol2="";
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(!stack1.empty())
                {
                    stack1.pop();
                }
            }
            else
            {
                stack1.push(s.charAt(i));
            }
        }
        for(j=0;j<t.length();j++)
        {
            if(t.charAt(j)=='#')
            {
                if(!stack2.empty())
                {
                    stack2.pop();
                }
            }
            else
            {
                stack2.push(t.charAt(j));
            }
        }
        while(!stack1.empty())
        {
            char l= stack1.pop();
            sol1=sol1.concat(String.valueOf(l));
        }
        while(!stack2.empty())
        {
            char p= stack2.pop();
            sol2=sol2.concat(String.valueOf(p));
        }
        if(sol1.equals(sol2))
            return true;
        else
            return false;
    }
}