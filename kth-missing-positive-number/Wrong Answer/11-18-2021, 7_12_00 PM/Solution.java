// https://leetcode.com/problems/kth-missing-positive-number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int p=1,a=0,f=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<1000;i++){
            al.add(i+1);
        }
        for(int j=0;j<arr.length;j++){
            al.remove(new Integer(arr[j]));
        }
        if(k>al.size()){
            int q=(int)al.get(al.size()-1);
            return (q+(k-al.size()));
        }
        return (int)al.get(k-1);
    }
}