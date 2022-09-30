// https://leetcode.com/problems/design-a-number-container-system

class NumberContainers {
    TreeMap<Integer,Integer> map;
    public NumberContainers() {
        map=new TreeMap<>();
    }
    public void change(int index, int number) {
        map.put(index,number);
    }
    public int find(int number) {   
        for(int key:map.keySet()){
            if(map.get(key) == number)      return key;
        }
        return -1;                 
    }
    
    /*HashMap<Integer,Integer> hm;
    HashMap<Integer,Integer> hm2;
    public NumberContainers() {
        hm = new HashMap<Integer,Integer>();
        hm2 = new HashMap<Integer,Integer>();
    }
    public void change(int index, int number) {
        hm.put(index,number);
        if(hm2.containsKey(number)){
            int curr = (int)hm2.get(number);
            if(curr>index)  hm2.put(number,index);
        }
        else    hm2.put(number,index);
    }
    public int find(int number) {
        if(hm2.containsKey(number)) return (int)hm2.get(number);
        return -1;
    }*/
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */