// https://leetcode.com/problems/convert-1d-array-into-2d-array

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] sol=new int[m][n];int i=0,j=0,c=0;
        for(int z=0;z<original.length;z++){
            c++;
        }
        if(c!=(m*n))
            return new int[][]{};
        for(int k=0;k<original.length;k++){
            sol[i][j]= original[k];
            j++;
            if(j==n){
                i++;
                j=0;
            }
        }
        return sol;
    }
}