// https://leetcode.com/problems/construct-target-array-with-multiple-sums

class Solution {
    public boolean isPossible(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> (b - a));
        long total = 0;
        for (int a : A) {
            total += a;
            pq.add(a);
        }
        while (true) {
            int a = pq.poll();
            total -= a;
            if (a == 1 || total == 1)
                return true;
            if (a < total || total == 0 || a % total == 0)
                return false;
            a %= total;
            total += a;
            pq.add(a);
        }
        /*int max=0,index=0;
        for(int q=0;q<target.length;q++){
            if(target[q]>max){
                max = target[q];
                index = q;
            }
        }
        if(max==1)    return true;
        for(int i=0;i<target.length;i++){
            if(i!=index){
                max = max % 1000000000;
                max = max - target[i];
                if(max<=0)  return false;
            }
        }
        target[index] = max ; 
        return isPossible(target);
        */
    }
}