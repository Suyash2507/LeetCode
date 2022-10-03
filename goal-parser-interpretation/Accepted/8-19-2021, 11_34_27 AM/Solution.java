// https://leetcode.com/problems/goal-parser-interpretation

class Solution {
    public String interpret(String command) {
        int i=0;
        String sol="",temp="";
        while(i<command.length()){
            if(command.charAt(i)=='G'){
                sol=sol.concat(String.valueOf(command.charAt(i)));
            }
            else{
                if(command.charAt(i)=='('){
                    temp=temp.concat(String.valueOf(command.charAt(i)));
                }
                else if(command.charAt(i)==')'){
                    temp=temp.concat(String.valueOf(command.charAt(i)));
                    if(temp.equals("()")){
                        sol=sol.concat("o");
                        temp="";
                    }
                    else if(temp.equals("(al)")){
                        sol=sol.concat("al");
                        temp="";
                    }
                }
                else{
                    temp=temp.concat(String.valueOf(command.charAt(i)));
                }
            }
            i++;
        }
        return sol;
    }
}