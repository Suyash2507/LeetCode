// https://leetcode.com/problems/4sum-ii

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int[] t1=new int[nums1.length+nums2.length];
        int[] t2=new int[nums3.length+nums4.length];
        int i=0,j=0,k=0;
        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                t1[k++]=nums1[i]+nums2[j];
            }
        }
        k=0;
        for(i=0;i<nums3.length;i++){
            for(j=0;j<nums4.length;j++){
                t2[k++]=nums3[i]+nums4[j];
            }
        }
        int sol=0;
        for(i=0;i<t1.length;i++){
            for(j=0;j<t2.length;j++){
                if((t1[i]+t2[j])==0)
                    sol++;
            }
        }
        return sol;
    }
}