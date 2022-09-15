// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] h) {
        int l=0,r=h.length-1,area=0;
        while(l<r){
            int curr=(r-l)*(Math.min(h[l],h[r]));
            area=(area>=curr)?area:curr;
            if(h[l]>h[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return area;
    }
}