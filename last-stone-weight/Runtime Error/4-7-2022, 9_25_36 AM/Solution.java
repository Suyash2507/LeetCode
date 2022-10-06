// https://leetcode.com/problems/last-stone-weight

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> al= new ArrayList<Integer>();
        for(int a:stones)   al.add(a);
        while(al.size()>1){
            Collections.sort(al);
            if((int)al.get(al.size()-1) == (int)al.get(al.size()-2)){
                al.remove(new Integer((int)al.get(al.size()-1)));
                al.remove(new Integer((int)al.get(al.size()-1)));
            }
            else{
                int z = Math.abs((int)al.get(al.size()-2) - (int)al.get(al.size()-1));
                al.remove(new Integer((int)al.get(al.size()-1)));
                al.remove(new Integer((int)al.get(al.size()-1)));
                al.add(z);
            }
        }
        return (int)al.get(0);
    }
}