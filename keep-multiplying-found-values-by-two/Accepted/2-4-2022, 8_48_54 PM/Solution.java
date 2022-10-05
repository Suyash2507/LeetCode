// https://leetcode.com/problems/keep-multiplying-found-values-by-two

class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean f=false;int z=0;
        List<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        while(!f){
            if(al.contains(original)){
                original=original*2;
                z++;
            }
            else{
                f=true;
                break;
            }
            if(z==al.size())    break;
            System.out.println(al);
        }
        return original;
    }
}