// https://leetcode.com/problems/gray-code

class Solution {
    List<Integer> sol;
    public List<Integer> grayCode(int n) {
        if(n==1)    return new ArrayList<>(Arrays.asList(0,1));
        String x="";
        sol = new ArrayList();
        for(int i=1;i<=n;++i){
            x=x.concat("0");
        }
        helper(x);
        return sol;
    }
    void helper(String x){
        if(sol.contains(Integer.parseInt(x,2))) return;
        sol.add(Integer.parseInt(x,2));
        for(int i=0;i<x.length();++i){
            helper(x.substring(0,i)+"1"+x.substring(i+1));
        }
    }
}