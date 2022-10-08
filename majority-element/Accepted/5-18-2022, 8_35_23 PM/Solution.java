// https://leetcode.com/problems/majority-element

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])) hm.replace(nums[i], 1+hm.get(nums[i]));
            else    hm.put(nums[i],1);
        }
        Iterator ii = hm.entrySet().iterator();
        while (ii.hasNext()) {
            Map.Entry m = (Map.Entry)ii.next();
            int z = ((int)m.getValue());
            if(z>(nums.length/2))  return (int)m.getKey();
        }
        return 0;
    }
}