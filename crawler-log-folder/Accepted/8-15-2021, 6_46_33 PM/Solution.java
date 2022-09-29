// https://leetcode.com/problems/crawler-log-folder

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack=new Stack<String>();
        int i=0,c=0;
        for(i=0;i<logs.length;i++)
        {
            if(logs[i].equals("../"))
            {
                if(!stack.empty())
                {
                    stack.pop();
                }
            }
            else
            {
                if(!logs[i].equals("./"))
                {
                    stack.push(logs[i]);
                }
            }
        }
        while(!stack.empty())
        {
            stack.pop();
            c=c+1;
        }
        return c;
    }
}