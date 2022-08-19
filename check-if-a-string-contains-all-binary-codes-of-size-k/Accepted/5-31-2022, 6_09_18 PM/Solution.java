// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k

class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k)    return false;
        HashSet<String> h=new HashSet<String>();
        int ans = (int)Math.pow(2,k);
        for(int i=k;i<=s.length();i++){
            if(!h.contains(s.substring(i-k,i))){
                h.add(s.substring(i-k,i));
                ans=ans-1;
            }
            if(ans==0)  return true;
        }
        return false; 
    }
}