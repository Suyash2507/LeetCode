// https://leetcode.com/problems/kth-distinct-string-in-an-array

class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> al=new ArrayList<String>();
        //ArrayList<String> seen=new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            if(!al.contains(arr[i])){
                al.add(arr[i]);
            }
            else if(al.contains(arr[i])){
                al.remove(new String(arr[i]));    
            }
        }
        //System.out.println(al+"     "+seen);
        return (al.size()>=k) ? (String)al.get(k-1) : "";
    }
}