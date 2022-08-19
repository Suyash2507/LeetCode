// https://leetcode.com/problems/build-an-array-with-stack-operations

class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list= new ArrayList<String>();
        int temp=0;
        int i=1;
        while(temp<(target.length))
        {
            if(i==target[temp])
            {
                list.add("Push");
                temp++;
            }
            else
            {
                list.add("Push");
                list.add("Pop");
            }
            i=i+1;
        }
        return list;
    }
}