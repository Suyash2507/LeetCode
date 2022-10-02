// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string

class Solution {
    public char findKthBit(int n, int k) {
        String ans = "0";
        while(--n>0){
            String t=ans;
            t=t.replaceAll("0","x");
            t=t.replaceAll("1","0");
            t=t.replaceAll("x","1");
            ans = ans.concat("1").concat(new StringBuilder(t).reverse().toString());
            if(ans.length()==k)     return ans.charAt(k-1);
        }
        return ans.charAt(k-1);
    }
}