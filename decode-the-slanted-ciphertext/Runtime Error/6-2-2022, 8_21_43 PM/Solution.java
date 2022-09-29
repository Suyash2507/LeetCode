// https://leetcode.com/problems/decode-the-slanted-ciphertext

class Solution {
    public String decodeCiphertext(String E, int rows) {
        if(E.length()==0)   return "";
        if(rows==1) return E;
        String[][] sol=new String[rows][(E.length()/rows)];
        String ans="";
        int a=0;
        int b=0;
        int start = -9999,bound =0 ;
        for(int i=0;i<E.length();i++){
            if(b>=(E.length()/rows)){
                a++;
                b=0;
            }
            sol[a][b]= String.valueOf(E.charAt(i));
            b++;
        }
        for(int q=(E.length()/rows)-1 ; q>=0;q--){
            if(sol[0][q]!=" "){
                bound = q;
                break;
            }
        }
        for(int k = 0;k<bound;k++){
            int k1= k ;
            int j1= 0;
            while(j1<rows && k1<(E.length()/rows)){
                ans = ans.concat(sol[j1][k1]);  
                j1++;k1++;
            }
        }
        int len = 0;
        for(int aa=ans.length()-1;aa>=0;aa--){
            if(ans.charAt(aa)!=' '){
                len = aa;
                break;
            }
        }
        return ans.substring(0,len+1);

    }
}