// https://leetcode.com/problems/integer-to-roman

class Solution {
    public String intToRoman(int num) {
        int temp=num;String sol="";
        int thous=temp/1000;
        temp=temp-(thous*1000);
        int hund=temp/100;
        temp=temp-(hund*100);
        int ten=temp/10;
        temp=temp-(ten*10);
        int ones=temp;
        String[] th={"M","MM","MMM","MMMM"};
        String[] hun={"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] on={"I","II","III","IV","V","VI","VII","VIII","IX"};
        if(thous>0){
            sol=sol.concat(th[thous-1]);
        }
        if(hund>0){
            sol=sol.concat(hun[hund-1]);
        }
        if(ten>0){
            sol=sol.concat(tens[ten-1]);
        }
        if(ones>0){
            sol=sol.concat(on[ones-1]);
        }
        return sol;
    }
}