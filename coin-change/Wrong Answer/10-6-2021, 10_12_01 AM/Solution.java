// https://leetcode.com/problems/coin-change

class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int curr=0,v=0;
        if(amount==0)
            return 0;
        for(int i=coins.length-1;i>=0;i--)
        {
            if(coins[i]<=amount){
                if(amount%coins[i]==0)
                {
                    v=v+amount/coins[i];
                    amount=0;
                    break;
                }
                else
                {
                    while(true)
                    {
                        amount=amount-coins[i];
                        v++;
                        if(amount<coins[i]){
                            break;
                        }
                    }
                }
            }
        }
        if(amount!=0)
            return -1;
        return v;
    }
}