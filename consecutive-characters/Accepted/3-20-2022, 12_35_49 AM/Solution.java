// https://leetcode.com/problems/consecutive-characters

class Solution {
    public int maxPower(String s) {
        int c=0;
        int m=0;
        char p=' ';
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch==p){
                c++;
            } 
            else{
                c=1;
                p=ch;
            }
            m=Math.max(m,c);
        }
        return m;
    }
}