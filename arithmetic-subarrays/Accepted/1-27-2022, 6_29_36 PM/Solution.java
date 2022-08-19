// https://leetcode.com/problems/arithmetic-subarrays

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ll =new ArrayList<Boolean>();
        for(int i=0;i<l.length;i++){
            int[] temp= new int[1+(r[i]-l[i])];
            int z=0;
            for(int j=l[i];j<=r[i];j++){
                temp[z++]=nums[j];
            }
            Arrays.sort(temp);
            if(temp.length<2){
                ll.add(false);
                continue;
            }
            boolean res=false;
            int diff= temp[1]-temp[0];
            for(int k=0;k<temp.length-1;k++){
                if((temp[k+1]-temp[k])!=diff){
                    res=true;
                    break;
                }
            }
            if(res){
                ll.add(false);
                continue;
            }
            ll.add(true);
        }
        return ll;
    }
}