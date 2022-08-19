// https://leetcode.com/problems/base-7

class Solution {
    public String convertToBase7(int num) {
        String sol=""; 
        num = num<0 ? (num*-1) : num;
        while(num>7){
            sol = sol.concat(String.valueOf(num%7));
            num = num / 7;
        }
        sol = sol.concat(String.valueOf(num));
        if(num<0)   return "-".concat(new StringBuilder(sol).reverse().toString());
        return (new StringBuilder(sol).reverse().toString());
    }
}