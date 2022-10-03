// https://leetcode.com/problems/flood-fill

class Solution {
    void traverse(int[][] grid, int sr, int sc, int nc, int old){
        if(grid[sr][sc]==old){
            grid[sr][sc] = nc;
            if(sr-1>=0)   traverse(grid,sr-1,sc,nc,old);
            if(sc-1>=0)   traverse(grid,sr,sc-1,nc,old);
            if(sr+1<grid.length)   traverse(grid,sr+1,sc,nc,old);
            if(sc+1<grid[0].length)   traverse(grid,sr,sc+1,nc,old);
        }
    }
    public int[][] floodFill(int[][] grid, int sr, int sc, int newColor) {
        if(grid[sr][sc] == newColor)  return grid;
        traverse(grid,sr,sc,newColor,grid[sr][sc]);
        return grid;
    }
    /*
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==sr && j==sc){
                    check(grid,i,j,newColor);
                }
            }
        }
        return grid;
    }
    public void check(int[][] grid,int i,int j, int nc){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return ;
        }
        grid[i][j]=nc;
        check(grid,i+1,j,nc);
        check(grid,i,j+1,nc);
        check(grid,i-1,j,nc);
        check(grid,i,j-1,nc);
    }
    */
}