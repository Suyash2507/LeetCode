// https://leetcode.com/problems/longest-string-chain

class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        Arrays.sort(words, (a,b)-> a.length()-b.length());
        int ans = 0;
        for(int i=0;i<words.length;i++){
            int t=0;
            for(int j=0;j<words[i].length();j++){
                String seen= words[i].substring(0,j).concat(words[i].substring(j+1));
                t= Math.max(t, hm.getOrDefault(seen,0)+1);
            }
            hm.put(words[i], t);
            ans = Math.max(ans , t);
        }
        return ans;
        //substr0-i
        //i+1
        //seen - bdca bda ba a/b
    }
}