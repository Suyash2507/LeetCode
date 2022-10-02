// https://leetcode.com/problems/find-players-with-zero-or-one-losses

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        TreeSet<Integer> sol1=new TreeSet<Integer>();
        TreeSet<Integer> sol2=new TreeSet<Integer>();
        List<List<Integer>> sol=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        List<Integer> temp2=new ArrayList<Integer>();
        for(int i=0;i<matches.length;i++){
            if(!sol1.contains(matches[i][0]))   sol1.add(matches[i][0]);
            if(!sol2.contains(matches[i][1]) && !temp.contains(matches[i][1]))   sol2.add(matches[i][1]);
            else{
                if(sol2.contains(matches[i][1]))   sol2.remove(new Integer(matches[i][1]));
                if(!temp.contains(matches[i][1]))   temp.add(matches[i][1]);
            }
            if(!temp2.contains(matches[i][1]))  temp2.add(matches[i][1]);
        }
        sol1.removeAll(temp2);
        List<Integer> l1= new ArrayList<Integer>(sol1);
        List<Integer> l2= new ArrayList<Integer>(sol2);
        sol.add(l1);
        sol.add(l2);
        return sol;
 
    }
}