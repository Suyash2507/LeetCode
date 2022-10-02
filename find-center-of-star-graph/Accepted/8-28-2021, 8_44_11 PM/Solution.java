// https://leetcode.com/problems/find-center-of-star-graph

class Solution {
    public int findCenter(int[][] edges) {
        int i=0,a=0;
        if(edges[0][0]==edges[1][0])
            a=edges[0][0];
        else if(edges[0][0]==edges[1][1])
            a=edges[0][0];
        else if(edges[0][1]==edges[1][0])
            a=edges[0][1];
        else
            a=edges[1][1];
        boolean f=true;
        for(i=0;i<edges.length;i++){
            if(a!=edges[i][0] && a!=edges[i][1])
                f=false;
                break;
        }
        if(f)
            return a;
        else
            return 0;
    }
}