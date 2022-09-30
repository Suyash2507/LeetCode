// https://leetcode.com/problems/diagonal-traverse

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] sol=new int[mat.length*mat.length];
        int m = mat.length;
        int n = mat[0].length;
        int z = 0, j = 0 ,count = 0;
        List<Integer> l =new ArrayList();
        for(int i=0;i<mat.length;i++){
            int  k = i; j=0;
            l.clear();
            while(j<n && k>=0){
                l.add(mat[k][j]);
                k--;j++;
            }
            if(count==1){
                Collections.reverse(l);
                count = 0;
            }
            else {count = 1;}
            for(int w=0;w<l.size();w++){
                sol[z++] = (int)l.get(w);
            }
        }
        for(int q=1;q<n;q++){
            l.clear();
            int j1 = q; 
            int i1 = m-1;
            while(i1>=0 && j1<n){
                l.add(mat[i1][j1]);
                i1--;j1++;
            }
            if(count==1){
                Collections.reverse(l);
                count = 0;
            }
            else {count = 1;}
            for(int w1=0;w1<l.size();w1++){
                sol[z++] = (int)l.get(w1);
            }
        }
        return sol;
    }
}