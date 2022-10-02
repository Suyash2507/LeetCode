// https://leetcode.com/problems/find-the-town-judge

class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<trust.length;i++){
            if(!al.contains(trust[i][0])) al.add(trust[i][0]);
            if(!al.contains(trust[i][1])) al.add(trust[i][1]);
        }
        for(int j=0;j<trust.length;j++){
            if(al.contains(trust[j][0])) al.remove(new Integer(trust[j][0]));
        }
        if(al.size()==0)
            return -1;
        return (int)al.get(al.size()-1);
    }
}