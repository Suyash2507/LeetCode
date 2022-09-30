// https://leetcode.com/problems/destination-city

class Solution {
    public String destCity(List<List<String>> paths) {
        ArrayList<String> ll=new ArrayList<String>();
        for(int i=0;i<paths.size();i++){
            if(!ll.contains((String)paths.get(i).get(0)))   ll.add((String)paths.get(i).get(0));
            if(!ll.contains((String)paths.get(i).get(1)))   ll.add((String)paths.get(i).get(1));
        }
        for(int j=0;j<paths.size();j++){
            if(ll.contains((String)paths.get(j).get(0)))   ll.remove((String)paths.get(j).get(0));
        }
        return (String)ll.get(0);
    }
}