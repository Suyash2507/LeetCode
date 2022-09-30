// https://leetcode.com/problems/di-string-match

class Solution {
    public int[] diStringMatch(String s) {
        int[] sol=new int[s.length()+1];
        int i=0,d=s.length()+1;
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='D'){
                sol[k]= --d;
            }
            else{
                sol[k]= i++;
            }
        }
        sol[sol.length-1]=i;
        return sol;
    }
}