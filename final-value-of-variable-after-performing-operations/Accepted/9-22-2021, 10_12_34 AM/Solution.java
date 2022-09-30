// https://leetcode.com/problems/final-value-of-variable-after-performing-operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int s=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(0)=='X'){
                if(operations[i].charAt(1)=='+'){
                    s=s+1;
                }
                else{
                    s=s-1;
                }
            }
            else{
                if(operations[i].charAt(0)=='+'){
                    s=s+1;   
                }
                else{
                    s=s-1;
                }
            }
        }
        return s;
    }
}