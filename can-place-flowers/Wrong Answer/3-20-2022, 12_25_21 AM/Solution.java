// https://leetcode.com/problems/can-place-flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int v=0;
        if(flowerbed.length==1){
            if(flowerbed[0]==1){
                if(n==0)    return true;
                return false;
            }
            else{
                if(n==1 || n==0)    return true;
                return false;
            }
        }
        for(int i=0;i<flowerbed.length;i++){
            if(i==0 || i==(flowerbed.length-1)){
                if(i==0){
                    if(flowerbed[i]==0 && flowerbed[i+1]==0){
                        v=v+1;
                    }
                }
                else{
                    if(flowerbed[i]==0 && flowerbed[i-1]==0){
                        v=v+1;
                    }
                }
            }
            else{
                if(flowerbed[i]==0){
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        v=v+1;
                        flowerbed[i]=1;
                    }
                }
            }
        }
        if(v>=n)
            return true;
        return false;
    }
}