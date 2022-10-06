// https://leetcode.com/problems/lexicographical-numbers

class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> al=new ArrayList<String>();
        ArrayList<Integer> ll=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            al.add(String.valueOf(i));
        }
        Collections.sort(al);
        for(int k=0;k<al.size();k++){
            ll.add(Integer.valueOf(al.get(k)));
        }
        return ll;
    }
}