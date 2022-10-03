// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to

class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
        List<List<Integer>> sol= new ArrayList<List<Integer>>();
        for(int i=0;i<gs.length;i++){
            if(!hm.containsKey(gs[i])){
                hm.put(gs[i], new ArrayList<>(Arrays.asList(i)));
            }
            else{
                ArrayList<Integer> t = hm.get(gs[i]);t.add(i);
                hm.put(gs[i] , t);
            }
        }
        ArrayList<Integer> temp2= new ArrayList<Integer>();
        for(Map.Entry<Integer,ArrayList<Integer>> e : hm.entrySet()){
            ArrayList<Integer> temp = e.getValue();
            for(int j=0;j<temp.size();j++){
                int x = (int)temp.get(j);
                temp2.add(x);
                if(temp2.size()==e.getKey()){
                    sol.add(new ArrayList<>(temp2));
                    temp2.clear();
                }
            }
        }
        return sol;
    }
}