// https://leetcode.com/problems/kth-largest-element-in-a-stream

class KthLargest {
    int k;
    ArrayList<Integer> ll;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        ll = new ArrayList<Integer>();
        for(int a:nums) ll.add(a);
    }
    
    public int add(int val) {
        ll.add(val);
        Collections.sort(ll);
        if(ll.size()<k){
            return (int)ll.get(ll.size()-1);
        }
        else{
            return (int)ll.get(ll.size()-k);
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */