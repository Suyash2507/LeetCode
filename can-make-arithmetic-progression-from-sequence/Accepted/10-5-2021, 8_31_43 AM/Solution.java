// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff= arr[1]-arr[0];
        boolean fl=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(diff!=(arr[i+1]-arr[i]))
            {
                fl=false;
                break;
            }
        }
        if(fl)
            return true;
        else
            return false;
    }
}