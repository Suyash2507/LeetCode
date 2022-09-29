// https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph

class Solution {
    List<List<Integer>> base = new ArrayList();
    public long countPairs(int n, int[][] edges) {
        boolean[] visited = new boolean[n+1];
        Arrays.fill(visited,false);
        for(int i=0;i<n;++i)    base.add(new ArrayList<>());
        for(int j=0;j<edges.length;++j){
            base.get(edges[j][0]).add(edges[j][1]);
            base.get(edges[j][1]).add(edges[j][0]);
        }
        long sol = 0;
        int sum = n;
        for(int k=0;k<n;++k)
            if(!visited[k]){
                int curr = dfs(k,visited, new int[1]);
                sum = sum-curr;
                sol += (curr*sum);
            }
        return sol;
    }
    int dfs(int i, boolean[] visited, int[] c){
        if(visited[i])  return c[0];
        visited[i] = true;
        c[0]++;
        for(int curr : base.get(i))     dfs(curr, visited, c);
        return c[0];
    }
}