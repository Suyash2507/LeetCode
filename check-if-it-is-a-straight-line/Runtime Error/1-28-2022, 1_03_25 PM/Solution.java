// https://leetcode.com/problems/check-if-it-is-a-straight-line

class Solution {
    public boolean checkStraightLine(int[][] c) {
        if(c.length==2)
            return true;
        double m = (c[1][1]-c[0][1])/(c[1][0]-c[0][0]);
        double cc= c[0][1]-(m*c[0][0]);
        for(int i=1;i<c.length;i++){
            if((double)c[i][1]!= ((m*c[i][0])+cc)){
                return false;
            }
        }
        return true;
    }
}