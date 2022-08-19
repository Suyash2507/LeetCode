// https://leetcode.com/problems/concatenation-of-array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[2*nums.length];
        int i=0;
        for(i=0;i<2*nums.length;i++){
            if(i<nums.length){
                arr[i]=nums[i];
            }
            else{
                arr[i]=nums[i-nums.length];
            }
        }
        return arr;
    }
}