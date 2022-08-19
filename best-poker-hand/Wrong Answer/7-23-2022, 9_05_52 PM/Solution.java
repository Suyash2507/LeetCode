// https://leetcode.com/problems/best-poker-hand

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character, Integer> suit = new HashMap<>();
        for(int i=0;i<suits.length;++i){
            if(!suit.containsKey(suits[i]))  suit.put(suits[i], 1);
            else    suit.put(suits[i], (int)suit.get(suits[i]));
        }
        if(suit.size()==1)    return "Flush";
        int j=0,k=0;
        for(j=0;j<ranks.length-1;++j){
            int temp = 0;
            boolean three=false,two=false;
            for(k=j+1;k<suits.length;++k){
                if(ranks[j] == ranks[k] && suits[j] != suits[k])    temp++;
            }
            if(temp==3) return "Three of a Kind";
        }
        for(j=0;j<suits.length-1;++j){
            int temp1 = 0;
            for(k=j+1;k<ranks.length;++k){
                if(suits[j] == suits[k] && ranks[j]!=ranks[k]){
                    temp1++;
                }
            }
            if(temp1==2)    return "Pair";
        }
        return "High Card";
        
    }
}