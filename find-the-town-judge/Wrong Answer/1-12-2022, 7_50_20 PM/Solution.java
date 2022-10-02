// https://leetcode.com/problems/find-the-town-judge

class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> ll=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            al.add(i+1);
        }
        for(int j=0;j<trust.length;j++){
            if(al.contains(trust[j][0]))    al.remove(new Integer(trust[j][0]));
            if(!ll.contains(trust[j][1]))    ll.add(trust[j][1]);
        }
        if(al.size()!=ll.size())    return -1;
        for(int k=0;k<al.size();k++){
            if(ll.contains((int)al.get(k))) return (int)al.get(k);
        }
        return -1;
    }
}