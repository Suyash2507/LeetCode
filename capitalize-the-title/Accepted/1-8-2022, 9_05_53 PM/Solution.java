// https://leetcode.com/problems/capitalize-the-title

class Solution {
    public String capitalizeTitle(String s) {
        String s1="",ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                s1=s1.concat(String.valueOf(s.charAt(i)));
            }
            else{
                if(s1.length()<=2){
                    s1=s1.toLowerCase();
                    ans=ans.concat(s1);
                    s1="";
                }
                else{
                    s1=s1.toLowerCase();
                    ans=ans.concat(String.valueOf((char)(s1.charAt(0)-32)));
                    ans=ans.concat(s1.substring(1,s1.length()));
                    s1="";
                }
                ans=ans.concat(" ");
            }
        }
            if(s1.length()<=2){
                    s1=s1.toLowerCase();
                    ans=ans.concat(s1);
                    s1="";
            }
            else{
                    s1=s1.toLowerCase();
                    ans=ans.concat(String.valueOf((char)(s1.charAt(0)-32)));
                    ans=ans.concat(s1.substring(1,s1.length()));
                    s1="";
            }
        return ans;
            
    }
}