// https://leetcode.com/problems/insert-interval

class Solution {
    public int[][] insert(int[][] interval, int[] newInterval) {
        List<List<Integer>> sol = new ArrayList();
        int[][] inter = new int[interval.length+1][2];
        int z = 0;
        for(int[] x : interval){
            inter[z++] = x;
        }
        inter[z] = newInterval;
        Arrays.sort(inter, (a,b)-> a[0]-b[0]);
        for(int i=0;i<inter.length;++i){
            if(sol.size()==0)   sol.add(new ArrayList(Arrays.asList(inter[i][0], inter[i][1])));
            else{
                List<Integer> temp = sol.get(sol.size()-1);
                int a = (int)temp.get(0);
                int b = (int)temp.get(1);
                if(b<inter[i][0])   sol.add(new ArrayList(Arrays.asList(inter[i][0], inter[i][1])));
                else{
                    sol.remove(temp);
                    a = inter[i][0]<a ? inter[i][0] : a;
                    b = inter[i][1]>b ? inter[i][1] : b;
                    sol.add(new ArrayList(Arrays.asList(a,b)));
                }
            }      
        }
        int[][] s = new int[sol.size()][2];
        for(int j=0;j<sol.size();++j){
            s[j][0] = Integer.valueOf(sol.get(j).get(0));
            s[j][1] = Integer.valueOf(sol.get(j).get(1));
        }
        return s;
    }
}