// https://leetcode.com/problems/add-to-array-form-of-integer

class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        String sol="";
        for(int i=0;i<nums.length;i++){
            sol=sol.concat(String.valueOf(nums[i]));
        }
        List<Integer> ll= new ArrayList();
        int a=0;
        if(sol.length()==0)
            a=k;
        else
            a=k+ Integer.parseInt(sol);
        while(a!=0){
            ll.add(a%10);
            a=a/10;
        }
        Collections.reverse(ll);
        return ll;
    }
}