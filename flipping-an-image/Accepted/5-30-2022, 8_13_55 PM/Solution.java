// https://leetcode.com/problems/flipping-an-image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] sol=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            int  k = image.length-1;
            for(int j=0;j<image[i].length;j++){
                sol[i][j] = ((image[i][k--]==1) ? 0 : 1); 
            }
        }
        return sol;
    }
}