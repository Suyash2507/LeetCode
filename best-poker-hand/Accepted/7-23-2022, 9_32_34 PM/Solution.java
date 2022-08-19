// https://leetcode.com/problems/best-poker-hand

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> rank = new HashMap<>();
        HashMap<Character,Integer> suit = new HashMap<>();
        boolean pair = false;
        for(char ch : suits)    suit.put(ch,suit.getOrDefault(ch,0)+1);
        for(int i : ranks)  rank.put(i,rank.getOrDefault(i,0)+1);
        if(suit.size() == 1)
            return "Flush";
        for(int i : rank.values())
        {
            if(i >= 3)  return "Three of a Kind";
            if(i >= 2)  pair = true;
        }
        if(pair == true)    return "Pair";
        return "High Card";
        
    }
}