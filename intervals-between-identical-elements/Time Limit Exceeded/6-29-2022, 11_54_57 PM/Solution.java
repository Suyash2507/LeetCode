// https://leetcode.com/problems/intervals-between-identical-elements

class Solution {
    public long[] getDistances(int[] arr) {
        HashMap<Integer,List<Integer>> hm = new HashMap<Integer, List<Integer>>();
        for(int i=0;i<arr.length;++i){
            if(hm.containsKey(arr[i])){
                List<Integer> t = hm.get(arr[i]);
                t.add(i);
                hm.put(arr[i] , t);
            }
            else{
                hm.put(arr[i] , new ArrayList<Integer>(Arrays.asList(i)));
            }
        }
        long[] sol = new long[arr.length];
        for(int j=0;j<arr.length;++j){
            long sum = 0;
            List<Integer> al = hm.get(arr[j]);
            for(int k=0;k<al.size();++k){
                sum += Math.abs((int)al.get(k)-j);
            }
            sol[j] = sum;
        }
        return sol;
    }
}