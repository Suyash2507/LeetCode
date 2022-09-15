// https://leetcode.com/problems/construct-target-array-with-multiple-sums

class Solution {
    public boolean isPossible(int[] target) {
        int max=0,index=0;
        for(int q=0;q<target.length;q++){
            if(target[q]>max){
                max = target[q];
                index = q;
            }
        }
        if(max==1)    return true;
        for(int i=0;i<target.length;i++){
            if(i!=index){
                max = max - target[i];
                max %= 10e9;
                if(max<=0)  return false;
            }
        }
        target[index] = max ; 
        return isPossible(target);
    }
}