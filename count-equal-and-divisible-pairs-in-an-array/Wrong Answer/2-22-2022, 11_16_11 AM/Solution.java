// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array

class Solution {
    public int countPairs(int[] nums, int k) {
        List<String> al=new ArrayList<>();
        int v=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                String kk = String.valueOf(i).concat(String.valueOf(j));
                StringBuilder sb=new StringBuilder(kk);
                if(!al.contains(kk) && !al.contains(sb.reverse().toString()) && nums[i]==nums[j] && ((i*j)%k==0) && i!=j){
                    v++;
                    al.add(kk);
                    al.add(sb.reverse().toString());
                }
            }
        }
        return v;
    }
}