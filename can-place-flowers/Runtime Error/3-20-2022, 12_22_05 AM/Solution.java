// https://leetcode.com/problems/can-place-flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int v=0;
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