// https://leetcode.com/problems/combinations

class Solution {
    List<List<Integer>> sol;
    public List<List<Integer>> combine(int n, int k) {
        sol = new ArrayList();
        int[] arr = new int[n];
        for(int i=0;i<n;++i)    arr[i] = i+1;
        int[] data = new int[k];
        comb(arr,data,0,n-1,0,k);
        return sol;
    }
    void comb(int arr[], int data[], int start, int end, int index, int r){
        if (index == r){
            List<Integer> temp = new ArrayList();
            for(int j=0; j<r; j++)
                temp.add(data[j]);
            sol.add(temp);
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++){
            data[index] = arr[i];
            comb(arr, data, i+1, end, index+1, r);
        }
    }
}