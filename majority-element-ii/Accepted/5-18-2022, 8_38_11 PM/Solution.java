// https://leetcode.com/problems/majority-element-ii

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        List<Integer> ll=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])) hm.replace(nums[i], 1+hm.get(nums[i]));
            else    hm.put(nums[i],1);
        }
        Iterator ii = hm.entrySet().iterator();
        while (ii.hasNext()) {
            Map.Entry m = (Map.Entry)ii.next();
            int z = ((int)m.getValue());
            if(z>(nums.length/3))  ll.add((int)m.getKey());
        }
        return ll;
        /*List base=Arrays.asList(nums);
        int n=0,p=0;
        ArrayList<Integer> ll=new ArrayList<Integer>();
        if(nums.length%3==0)
            n=nums.length/3;
        else
            n=(nums.length/3)-1;
        for(int i=0;i<nums.length;i++){
            System.out.println(Collections.frequency(Arrays.asList(nums),nums[i]));
            if(Collections.frequency(Arrays.asList(nums),nums[i])>n){
                if(!ll.contains(nums[i])){
                    ll.add(nums[i]);
                }
            }
        }
        return ll;
        */
    }
}