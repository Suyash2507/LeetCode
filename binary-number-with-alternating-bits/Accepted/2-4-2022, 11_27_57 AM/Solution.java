// https://leetcode.com/problems/binary-number-with-alternating-bits

class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean fz=false,fo=false;
        while(n!=0){
            if((n&1)==1){
                if(fo){
                    return false;
                }
                fo=true;
                fz=false;
            }
            else{
                if(fz){
                    return false;
                }
                fo=false;
                fz=true;
            }
            n=n>>1;
        }
        return true;
    }
}