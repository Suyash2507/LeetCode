// https://leetcode.com/problems/binary-prefix-divisible-by-5

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String k="";
            for(int j=0;j<=i;j++){
                k=k.concat(String.valueOf(nums[j]));
            }
            if(Integer.parseInt(k,2)%5==0)
                al.add(true);
            else
                al.add(false);
            k="";
        }
        return al;
    }
}