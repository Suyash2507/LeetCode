// https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays

class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        ArrayList<Long> ll=new ArrayList<Long>(); 
        Long pq= new Long(k);
        int q= pq.intValue();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                long z= nums1[i]*nums2[j];
                ll.add(z);
            }
        }
        Collections.sort(ll);   
        return (long)ll.get(q-1);
    }
}