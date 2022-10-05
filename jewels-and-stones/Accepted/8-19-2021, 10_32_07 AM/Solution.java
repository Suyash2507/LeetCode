// https://leetcode.com/problems/jewels-and-stones

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int i=0,j=0,c=0;
        for(i=0;i<stones.length();i++){
            for(j=0;j<jewels.length();j++){
                if(jewels.charAt(j)==stones.charAt(i)){
                    c++;
                }
            }
        }
        return c;
    }
}