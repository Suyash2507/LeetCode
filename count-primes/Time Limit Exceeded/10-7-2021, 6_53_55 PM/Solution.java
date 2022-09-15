// https://leetcode.com/problems/count-primes

import java.math.*;
class Solution {
    public boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;  
        return true;
    }
    public int countPrimes(int n) {
        int a=0;
        if(n==1 || n==0)
            return 0;
        for(int i=1;i<n;i++){
            if(isPrime(i))
                a++;
        }
        return a;
    }
}