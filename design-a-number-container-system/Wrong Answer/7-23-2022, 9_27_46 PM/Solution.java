// https://leetcode.com/problems/design-a-number-container-system

class NumberContainers {
    HashMap<Integer,Integer> hm;
    List<Integer> al;
    public NumberContainers() {
        al = new ArrayList(Collections.nCopies(100000, 0));
        hm = new HashMap<Integer,Integer>();
    }
    public void change(int index, int number) {
        al.set(index,number);
        if(hm.containsKey(number)){
            int k = (int)hm.get(number);
            if(k<index) hm.put(number,k);
        }
        else    hm.put(number,index);
    }
    public int find(int number) {
        if(hm.containsKey(number))  return (int)hm.get(number);
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */