// https://leetcode.com/problems/count-of-matches-in-tournament

class Solution {
    public int numberOfMatches(int n) {
        int v=0;
        while(n>1){
            if(n%2==0){
                v=v+(n/2);
                n=n/2;
            }
            else{
                v=v+((n-1)/2);
                n=1+((n-1)/2);
            }
        }   
        return v;
    }
}