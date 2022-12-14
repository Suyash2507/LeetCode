// https://leetcode.com/problems/max-area-of-island

class Solution {
    public int check(int[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int temp=1;
        temp=temp+ check(grid,i+1,j);
        temp=temp+ check(grid,i,j+1);
        temp=temp+ check(grid,i-1,j);
        temp=temp+ check(grid,i,j-1);
        return temp;        
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max, check(grid,i,j));
                }
            }
        }
        return max;
    }
}