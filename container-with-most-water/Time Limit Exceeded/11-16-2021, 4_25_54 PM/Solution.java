// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] h) {
        int max = 0,min=0,a=0;
        for(int i=0;i<h.length;i++){
            for(int j=0;j<h.length;j++){
                if(i!=j){
                    min= (h[i]<h[j])?h[i]:h[j];
                    a= min * (Math.abs(j-i));
                    if(a>max)
                        max=a;
                }
            }
        }
        return max;
    }
}