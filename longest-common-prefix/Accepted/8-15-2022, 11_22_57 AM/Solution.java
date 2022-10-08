// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        String sol=""; int l=strs[0].length(); String temp=strs[0];
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<l){
                l=strs[i].length();
                temp=strs[i];
            }
        }
        for(int k=0;k<temp.length();k++){
            boolean res=true;
            for(String z: strs){
                if(z.charAt(k)!=temp.charAt(k)){
                    res=false;
                }
            }
            if(!res){
                break;
            }
            else{
                sol=sol.concat(String.valueOf(temp.charAt(k)));
            }
        }
        return sol;
    }
}