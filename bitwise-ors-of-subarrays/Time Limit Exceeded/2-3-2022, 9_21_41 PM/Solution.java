// https://leetcode.com/problems/bitwise-ors-of-subarrays

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        List<Integer> ll=new ArrayList();
        if(arr.length==1)   return 1;
        for(int i=0;i<arr.length;i++){
            int t=0;
            for(int j=i;j<arr.length;j++){
                t= t|arr[j];
                if(!ll.contains(t)) ll.add(t);
            }
        }
        return ll.size();
    }
}