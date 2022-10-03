// https://leetcode.com/problems/height-checker

class Solution {
    public int heightChecker(int[] heights) {
        int[] t= new int[heights.length];
        for(int i=0;i<heights.length;i++){
            t[i]=heights[i];
        }
        Arrays.sort(t);int v=0;
        for(int j=0;j<heights.length;j++){
            if(t[j]!=heights[j]){
                v++;
            }
        }
        return v;
    }
}