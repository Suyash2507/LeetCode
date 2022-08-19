// https://leetcode.com/problems/apply-discount-to-prices

class Solution {
    public String discountPrices(String sentence, int discount) {
        String sol="";
        sentence = sentence.concat(" ");
        String t ="";
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                if(check(t)){
                    sol = sol.concat(findval(t,discount));
                    sol = sol + " ";
                    t="";
                }
                else{sol = sol.concat(t);sol = sol + " ";   t="";}
            }
            else    t=t+String.valueOf(sentence.charAt(i));
        }
        return sol.trim();
    }
    boolean check(String t){
        t=t.trim();
        if(t.equals(""))    return false;
        if(t.charAt(0)!='$')    return false;
        t = t .substring(1,t.length());
        for(int i=0;i<t.length();i++){
            if(!Character.isDigit(t.charAt(i))) return false;
        }
        return true;
    }
    String findval(String t,int dis){
        if(t.equals(""))    return "";
        int  k = Integer.parseInt(t.substring(1,t.length()));
        double kk = k - (k*dis*0.01);
        return "$"+String.format("%.2f",kk);
    }
}