// https://leetcode.com/problems/decode-the-slanted-ciphertext

class Solution {
    public String decodeCiphertext(String E, int rows) {
        if(E.length()==0)   return "";
        if(rows==1) return E;
        String[][] sol=new String[rows][(E.length()/rows)];
        String ans="";
        int a=0;
        int b=0;
        int start = -9999;
        for(int i=0;i<E.length();i++){
            if(b>=(E.length()/rows)){
                a++;
                b=0;
            }
            if(start==-9999 && E.charAt(i)!=' ')    start = b;
            sol[a][b]= String.valueOf(E.charAt(i));
            b++;
        }
        int bound = E.indexOf(" ");
        for(int k = start;k<bound;k++){
            int k1= k ;
            int j1= 0;
            while(j1<rows && k1<(E.length()/rows)){
                ans = ans.concat(sol[j1][k1]);  
                j1++;k1++;
            }
        }
        return ans;

    }
}