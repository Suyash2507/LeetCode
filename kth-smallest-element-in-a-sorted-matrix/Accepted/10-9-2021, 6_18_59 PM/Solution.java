// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> ll=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                ll.add(matrix[i][j]);   
            }
        }
        Collections.sort(ll);
        return (int)ll.get(k-1);
    }
}