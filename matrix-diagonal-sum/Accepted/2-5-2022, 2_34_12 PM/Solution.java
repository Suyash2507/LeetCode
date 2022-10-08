// https://leetcode.com/problems/matrix-diagonal-sum

class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==1)    return mat[0][0];
        int sum=0;
        int i1=0,j1=0,i2=0,j2=mat.length-1;
        while(i1<mat.length && j1<mat.length && i2<mat.length && j2>=0){
            if((mat.length&1)==1){
                int q =mat[i1][j1] + mat[i2][j2];
                if(i1==i2 && j1==j2){
                    q=q/2;
                }
                sum=sum + q;
            }
            else{
                sum=sum + mat[i1][j1] + mat[i2][j2];
            }
            i1++;
            j1++;
            i2++;
            j2--;
        }
        return sum;
    }
}