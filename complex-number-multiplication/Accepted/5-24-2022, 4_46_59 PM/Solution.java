// https://leetcode.com/problems/complex-number-multiplication

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String sol="";
        String[] t1= num1.split("[+]");
        String[] t2= num2.split("[+]");
        int a = Integer.parseInt(t1[0]) * Integer.parseInt(t2[0]);
        int b = Integer.parseInt(t1[0]) * Integer.parseInt(t2[1].substring(0,t2[1].length()-1));
        int c = Integer.parseInt(t2[0]) * Integer.parseInt(t1[1].substring(0,t1[1].length()-1));
        int d = Integer.parseInt(t1[1].substring(0,t1[1].length()-1)) * Integer.parseInt(t2[1].substring(0,t2[1].length()-1));
        d = d* -1;
        int n1 = a + d;
        int n2 = b + c;
        return String.valueOf(n1)+"+"+String.valueOf(n2)+"i";
    }
}