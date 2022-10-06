// https://leetcode.com/problems/kth-distinct-string-in-an-array

class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> al=new ArrayList<String>();
        ArrayList<String> ll=new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            if(!al.contains(arr[i]) && !ll.contains(arr[i])){
                al.add(arr[i]);
            }
            else{
                al.remove(new String(arr[i]));
                ll.add(arr[i]);
            }
        }
        if(ll.size()<k){
            return "";
        }
        return (String)al.get(k-1);
    }
}