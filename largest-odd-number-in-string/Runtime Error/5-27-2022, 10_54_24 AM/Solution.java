// https://leetcode.com/problems/largest-odd-number-in-string

class Solution {
    public String largestOddNumber(String num) {
        long n=Long.MIN_VALUE;
        String sol="";
        for(int i=0;i<num.length();i++){
            for(int j=i+1;j<num.length()+1;j++){
                if((Long.parseLong(num.substring(i,j))&1)==1 && Long.parseLong(num.substring(i,j))>n){
                    sol=num.substring(i,j);
                    n= Integer.parseInt(num.substring(i,j));
                }   
            }
        }
        return sol;
    }
}