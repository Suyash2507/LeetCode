// https://leetcode.com/problems/longest-palindromic-substring

class Solution {
    public String longestPalindrome(String s) {
        String sol="";
        if(s.length()==1)   return s;
        for(int i=0;i<s.length();i++){
            
            for(int j=1+i;j<s.length();j++){
                if(check(s.substring(i,j)) && s.substring(i,j).length()>sol.length())   sol=s.substring(i,j);
            }
        }
        return sol;
    }
    boolean check(String s){
        StringBuilder sb=new StringBuilder(s);
        if(sb.reverse().toString().equals(s))   return true;
        return false;
    }
}