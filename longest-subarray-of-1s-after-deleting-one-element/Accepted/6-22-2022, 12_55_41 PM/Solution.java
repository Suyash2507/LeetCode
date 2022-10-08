// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element

class Solution {
    public int longestSubarray(int[] A) {
        int i = 0, j, k = 1, res = 0;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (A[i] == 0){
                    k++;
                }
                i++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    }
    /*public int longestSubarray(int[] nums) {
        int i=0,j=0,ans=Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        while(j<nums.length){
            if(nums[j]==0){
                if(al.contains(0)){
                    while(al.contains(0) && i<nums.length){
                        al.remove(i);i++;
                    }
                    ans = Math.max(ans,al.size()+1);
                }
                else{
                    ans = Math.max(ans,al.size()+1);
                }
                al.clear();
                al.add(0);
            }
            else{
                al.add(nums[j]);
                ans = Math.max(ans,al.size());
            }
            j++;
            System.out.println(al);
        }
        return ans;
    }
    */
}