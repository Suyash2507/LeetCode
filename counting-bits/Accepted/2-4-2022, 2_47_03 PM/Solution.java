// https://leetcode.com/problems/counting-bits

class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int dig=0;
            String k=Integer.toString(i,2);
            for(int j=0;j<k.length();j++)
            {
                if(k.charAt(j)=='1')
                {
                    dig++;
                }
            }
            arr[i]=dig;
        }  
        return arr;
    }
}
/*
for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
*/