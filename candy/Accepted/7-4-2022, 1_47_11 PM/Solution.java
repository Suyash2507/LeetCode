// https://leetcode.com/problems/candy

class Solution {
    public int candy(int[] ratings) {
        int[] v = new int[ratings.length];
        Arrays.fill(v,1);
        int ans = 0;
        for(int i=1;i<ratings.length;++i){
            if(ratings[i] > ratings[i-1])   v[i] = 1 + v[i-1];
        }
        for(int j=v.length-2;j>=0;--j){
            if(ratings[j]>ratings[j+1]) v[j] = Math.max(v[j], 1+v[j+1]);
            ans += v[j];
        }
        ans += v[v.length-1];
        return ans;
    }
}