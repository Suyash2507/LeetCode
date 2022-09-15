// https://leetcode.com/problems/count-primes

import java.math.*;
class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1)    return 0;
        int a=0;
        boolean[] temp = new boolean[n+1];
        for(int i=0;i<n+1;i++)  temp[i]=true;
        for(int j=2;j*j<=n;j++){
            if(temp[j]==true){
                for(int k=j*j;k<=n;k+=j)   temp[k] =false;
            }
        }
        for(int i=2;i<n+1;i++){
            if(temp[i]==true)   a++;
        }
        return a;
    }
}