// https://leetcode.com/problems/decode-the-slanted-ciphertext

class Solution {
    public String decodeCiphertext(String E, int rows) {
        if(E.length()==0)   return "";
        String[][] sol=new String[rows][(E.length()/rows)];
        String ans="";
        int a=0;
        int b=0;
        for(int i=0;i<E.length();i++){
            if(b>=(E.length()/rows)){
                a++;
                b=0;
            }
            sol[a][b]= String.valueOf(E.charAt(i));
            b++;
        }
        int bound = E.indexOf(" ");
        for(int k = 0;k<bound;k++){
            int k1= k ;
            int j1= 0;
            while(j1<rows && k<(E.length()/rows)){
                ans = ans.concat(sol[j1][k1]);  
                j1++;k1++;
            }
        }
        return ans;

    }
}