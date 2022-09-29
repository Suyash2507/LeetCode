// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    public String defangIPaddr(String address) {
        String sol="",temp="";
        int i=0;
        for(i=0;i<address.length();i++)
        {
            if(address.charAt(i)!='.')
            {
                temp=temp.concat(String.valueOf(address.charAt(i)));
            }
            else
            {
                sol=sol.concat(temp);
                if(i<address.length())
                {
                    sol=sol.concat("[.]");   
                }
                temp="";
            }
        }
        if(!temp.equals(""))
            sol=sol.concat(temp);
        return sol;
    }
}