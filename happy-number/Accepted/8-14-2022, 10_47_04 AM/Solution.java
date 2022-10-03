// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(n!=1 && !al.contains(n)){
            al.add(n);
            int s=0;
            while(n>0){
                s=s+ ((n%10)*(n%10));
                n=n/10;
            }
            n=s;
        }
        return n==1;
    }
}