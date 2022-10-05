// https://leetcode.com/problems/is-subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==t.length())
            return s.equals(t);
        if(s.equals(""))
            return true;
        if(t.equals("")){
            return false;
        }
        String min = (s.length()< t.length())? s:t;
        String max = (s.length()>=t.length())? s:t;
        int z=0;
        for(int i=0;i<min.length();i++){
            boolean f=false;
            System.out.println(z);
            for(int j=z;j<max.length();j++){
                if(min.charAt(i)==max.charAt(j)){
                    f=true;
                    z=j;
                    break;
                }
            }
            if(!f){
                return false;
            }
        }
        return true;
    }
}