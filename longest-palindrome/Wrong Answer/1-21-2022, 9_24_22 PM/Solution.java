// https://leetcode.com/problems/longest-palindrome

class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        int v=0;
        boolean found=false;
        ArrayList<Character> al =new ArrayList<Character>();
        for(int i=0;i<s.length()-1;i++){
            int t=0;
            if(!al.contains(s.charAt(i))){
                al.add(s.charAt(i));
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==s.charAt(i)){
                        t=t+1;    
                    }
                }
                if(t%2!=0){
                    found=true;
                    v=v+ (t-1);
                }else{
                    v=v+t;
                }
                
                t=0;
                
            }
            else{
                found=true;
            }
        }
        if(!al.contains(s.charAt(s.length()-1))){
            found=true;
        }
        if(found)
            return v+1;
        else
            return v;
    }
}