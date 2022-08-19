// https://leetcode.com/problems/add-digits

class Solution {
    public int addDigits(int num) {
        if(String.valueOf(num).length()==1)
            return num;
        String a=String.valueOf(num);
        while(a.length()>1){
            int sum=0;
            for(int i=0;i<a.length();i++){
                sum=sum+Integer.parseInt(String.valueOf(a.charAt(i)));
            }
            a=String.valueOf(sum);
        }
        return Integer.parseInt(a);
    }
}