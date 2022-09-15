// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,area=0;
        while(l<r){
            int curr=(r-l)*(Math.min(height[l],height[r]));
            area=(area>=curr)?area:curr;
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return area;
    }
}