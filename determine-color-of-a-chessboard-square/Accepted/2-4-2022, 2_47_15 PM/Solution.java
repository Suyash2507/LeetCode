// https://leetcode.com/problems/determine-color-of-a-chessboard-square

class Solution {
    public boolean squareIsWhite(String c) {
        if(c.charAt(0)=='a' || c.charAt(0)=='c' || c.charAt(0)=='e' || c.charAt(0)=='g'){
            if(Integer.parseInt(String.valueOf(c.charAt(1)))%2==0)
                return true;
        }
        if(c.charAt(0)=='b' || c.charAt(0)=='d' || c.charAt(0)=='f' || c.charAt(0)=='h'){
            if(Integer.parseInt(String.valueOf(c.charAt(1)))%2!=0)
                return true;
        }
        return false;
    }
}