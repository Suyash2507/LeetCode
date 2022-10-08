// https://leetcode.com/problems/matchsticks-to-square

/*
class Solution {
    int[] ms;
    int n;
    //ban 817
    public boolean makesquare(int[] matchsticks) {
        ms = new int[16];
        int k = 4;
        int sum=0;
        for(int i=0;i<matchsticks.length;++i)   sum += matchsticks[i];
        if(sum%4 != 0)  return false;
        int subsum = sum/4, num = n-1, curr = matchsticks[num];
        n = matchsticks.length;
        ms[num] = 1;
        return check(matchsticks, subsum, num, curr, k);
    }
    boolean check(int[] matchsticks, int subsum, int num, int curr, int k){
        if(k==1)    return true;
        if(curr == subsum)  return check(matchsticks, subsum, n-1, 0, k-1);
        for(int i= num;i>=0;--i){
            if(ms[i] > subsum || (curr + matchsticks[i]) > subsum)  continue;
            ms[i] = 1;
            curr += matchsticks[i];
            if(check(matchsticks, subsum, i+1, curr, k))    return true;
            ms[i] = 0;
            curr -= matchsticks[i];
        }
        return false;
    }
}
*/
class Solution {
    public HashMap<Pair<Integer, Integer>, Boolean> memo;
    public int[] nums;
    public int possibleSquareSide;
    public Solution() {
        this.memo = new HashMap<Pair<Integer, Integer>, Boolean>();
    }
    public boolean recurse(Integer mask, Integer sidesDone) {
        int total = 0;
        int L = this.nums.length;
        Pair<Integer, Integer> memoKey = new Pair(mask, sidesDone);
        for(int i = L - 1; i >= 0; i--) {
            if ((mask&(1 << i)) == 0) {
                total += this.nums[L - 1 - i];
            }
        }
        if (total > 0 && total % this.possibleSquareSide == 0) {
            sidesDone++;
        }
        if (sidesDone == 3) {
            return true;
        }
        if (this.memo.containsKey(memoKey)) {
            return this.memo.get(memoKey);
        }
        boolean ans = false;
        int c = total / this.possibleSquareSide;
        int rem = this.possibleSquareSide * (c + 1) - total;
        for(int i = L - 1; i >= 0; i--) {
            if (this.nums[L - 1 - i] <= rem && (mask&(1 << i)) > 0) {
                if (this.recurse(mask ^ (1 << i), sidesDone)) {
                    ans = true;
                    break;
                }
            }
        }
        this.memo.put(memoKey, ans);
        return ans;
    }

    public boolean makesquare(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int L = nums.length;
        int perimeter = 0;
        for(int i = 0; i < L; i++) {
            perimeter += nums[i];
        }

        int possibleSquareSide =  perimeter / 4;
        if (possibleSquareSide * 4 != perimeter) {
            return false;
        }
        this.nums = nums;
        this.possibleSquareSide = possibleSquareSide;
        return this.recurse((1 << L) - 1, 0);
    }
}