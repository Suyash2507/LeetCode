// https://leetcode.com/problems/check-if-n-and-its-double-exist

class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean res=false;
        for(int k: arr){
            for(int p: arr){
                if((k*2)==p){
                    res=true;
                    break;
                }
            }
        }
        return res;
    }
}