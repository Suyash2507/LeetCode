// https://leetcode.com/problems/find-players-with-zero-or-one-losses

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> sol1=new ArrayList<Integer>();
        List<Integer> sol2=new ArrayList<Integer>();
        List<List<Integer>> sol=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<matches.length;i++){
            if(!sol1.contains(matches[i][0]))   sol1.add(matches[i][0]);
            if(!sol2.contains(matches[i][1]) && !temp.contains(matches[i][1]))   sol2.add(matches[i][1]);
            else{
                if(sol2.contains(matches[i][1]))   sol2.remove(new Integer(matches[i][1]));
                if(!temp.contains(matches[i][1]))   temp.add(matches[i][1]);
            }
        }
        for(int j=0;j<matches.length;j++){
            if(sol1.contains(matches[j][1]))    sol1.remove(new Integer(matches[j][1]));
        }
        sol.add(sol1);
        sol.add(sol2);
        return sol;
 
    }
}