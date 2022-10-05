// https://leetcode.com/problems/intersection-of-two-arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        ArrayList<Integer> ll=new ArrayList<Integer>();
        for(int w=0;w<nums2.length;w++){
            ll.add(nums2[w]);
        }
        for(int i=0;i<nums1.length;i++){
            if(ll.contains(nums1[i]) && !al.contains(nums1[i])){
                res.add(nums1[i]);
                al.add(nums1[i]);
            }
        }
        int[] sol=new int[res.size()];
        for(int j=0;j<res.size();j++){
            sol[j] = (int)res.get(j);
        }
        return sol;
    }
}