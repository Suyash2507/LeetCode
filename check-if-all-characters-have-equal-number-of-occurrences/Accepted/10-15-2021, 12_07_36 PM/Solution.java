// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences

class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] arr= s.toCharArray();
        ArrayList<Integer> ll=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            int t=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    t++;
                }
            }
            if(!ll.contains(t)){
                ll.add(t);
            }
        }
        return ll.size()==1;
    }
}