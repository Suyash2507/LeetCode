// https://leetcode.com/problems/island-perimeter

class Solution {
    int check(int[][] grid, int i, int j){
        int temp = 0;
        if(i-1>=0)  temp += grid[i-1][j]==0 ? 1 : 0;
        else    temp+=1;
        if(i+1<grid.length) temp += grid[i+1][j]==0 ? 1 : 0;
        else    temp+=1;
        if(j-1>=0)  temp += grid[i][j-1]==0 ? 1 : 0;
        else    temp+=1;
        if(j+1<grid[0].length)  temp += grid[i][j+1]==0 ? 1 : 0;
        else    temp+=1;
        return temp;
    }
    public int islandPerimeter(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    max += check(grid,i,j);
                    //System.out.println(check(grid,i,j));
                }
            }
        }
        return max;
    }
}