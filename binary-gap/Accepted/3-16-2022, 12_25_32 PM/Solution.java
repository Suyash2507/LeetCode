// https://leetcode.com/problems/binary-gap

class Solution {
    public int binaryGap(int N) {
        int[] sol = new int[32];//a
        int t = 0;
        for (int i = 0; i < 32; ++i){
            if ((1&(N>>i)) == 1){
                sol[t++] = i;
            }
        }
        int ans = 0;
        for (int i = 0; i < t - 1; ++i){
            ans = Math.max(ans, sol[i+1]-sol[i]);
        }
        return ans;
    }
}