// https://leetcode.com/problems/create-target-array-in-the-given-order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] sol=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(index[i]!=index.length-1){
                for(int j=index.length-2;j>=index[i];j--){
                    sol[j+1]=sol[j];
                }
            }
            sol[index[i]]= nums[i];
        }
        return sol;
    }
}