// https://leetcode.com/problems/decompress-run-length-encoded-list

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ll=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i=i+2){
            if(nums[i]!=0){
                for(int j=1;j<=nums[i];j++){
                    ll.add(nums[i+1]);
                }
            }
        }
        int[] arr = new int[ll.size()];
        for(int k=0;k<ll.size();k++){
            arr[k]=(int)ll.get(k);
        }
        return arr;
    }
}