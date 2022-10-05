// https://leetcode.com/problems/insert-delete-getrandom-o1

class RandomizedSet {
    ArrayList<Integer> al;
    public RandomizedSet() {
        al=new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(!al.contains(val)){
            al.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(al.contains(val)){
            al.remove(new Integer(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return (int)al.get(al.size()-1);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */