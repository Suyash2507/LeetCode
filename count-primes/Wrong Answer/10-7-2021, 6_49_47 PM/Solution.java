// https://leetcode.com/problems/count-primes

import java.math.*;
class Solution {
    public int countPrimes(int n) {
        int a=0;
        if(n==1 || n==0)
            return 0;
        for(int i=1;i<n;i++){
            BigInteger b= new BigInteger(String.valueOf(i));
            if(b.isProbablePrime(1) && i!=1)
                a++;
        }
        return a;
    }
}