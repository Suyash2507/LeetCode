// https://leetcode.com/problems/base-7

class Solution {
    public String convertToBase7(int num) {
        String sol=""; 
        int t=num;
        num = num<0 ? (num*-1) : num;
        while(num>=7){
            sol = sol.concat(String.valueOf(num%7));
            num = num / 7;
        }
        sol = sol.concat(String.valueOf(num));
        if(t<0)   return "-".concat(new StringBuilder(sol).reverse().toString());
        return (new StringBuilder(sol).reverse().toString());
    }
}