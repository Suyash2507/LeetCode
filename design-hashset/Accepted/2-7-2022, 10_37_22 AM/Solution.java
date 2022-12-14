// https://leetcode.com/problems/design-hashset

class MyHashSet {
    ArrayList<Integer> al;
    public MyHashSet() {
        al=new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!al.contains(key))
            al.add(key);
    }
    
    public void remove(int key) {
        if(al.contains(key))
            al.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        if(al.contains(key))    return true;
        else    return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */