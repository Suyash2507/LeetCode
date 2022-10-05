// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ll=new ArrayList<Boolean>();
        int[] rep=new int[candies.length];
        for(int j=0;j<candies.length;j++)
            rep[j]=candies[j];
        Arrays.sort(rep);
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=rep[candies.length-1])
            {
                ll.add(true);
            }
            else
            {
                ll.add(false);
            }
        }
        return ll;
    }
}