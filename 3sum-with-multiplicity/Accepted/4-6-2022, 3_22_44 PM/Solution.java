// https://leetcode.com/problems/3sum-with-multiplicity

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int z=0;
        int mod=1_000_000_007;
        for(int i=0;i<arr.length;i++){
            int[] c=new int[101];
            for(int j=i+1;j<arr.length;j++){
                int k=target-arr[i]-arr[j];
                if(k>=0 && k<=100 && c[k]>0){
                    z=z+c[k];
                    z=z%mod;
                }
                c[arr[j]]++;
            }
        }
        return (int)z;
    }
}