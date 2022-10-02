// https://leetcode.com/problems/find-if-path-exists-in-graph

class Solution {
    boolean found=false;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        HashMap<Integer,List<Integer>> hm=new HashMap();
        boolean[] visited =new boolean[n];
        for(int i=0;i<n;i++){
            hm.put(i, new ArrayList());
        }
        for(int[] edge : edges){
           hm.get(edge[0]).add(edge[1]);
           hm.get(edge[1]).add(edge[0]);
        }
        dfs(hm,visited,start,end);
        return found;
    }
    public void dfs(Map<Integer,List<Integer>> hm,boolean[] visited, int start, int end){
        if(visited[start] || found) return;
        visited[start]=true;
        for(int a: hm.get(start)){
            if(a==end){
                found=true;
                break;
            }
            if(!visited[a]) dfs(hm,visited,a,end);
        }
    }
}