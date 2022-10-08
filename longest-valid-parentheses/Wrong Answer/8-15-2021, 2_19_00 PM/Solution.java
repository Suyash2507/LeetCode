// https://leetcode.com/problems/longest-valid-parentheses

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack=new Stack<Character>();
        int i=0,c=0,max=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(!stack.empty() && stack.peek()=='(' )
                {
                    c=0;
                }
                stack.push(s.charAt(i));
            }
            else
            {
                if(!stack.empty())
                {
                    if(stack.peek()=='(')
                    {
                        stack.pop();
                        c=c+1;
                    }
                }
                else
                {
                    stack.push(s.charAt(i));
                    c=0;
                }
            }
            if(c>max)
            {
                max=c;
            }
        }
        max=max*2;
        return max;
    }
}