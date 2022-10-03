// https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case

class Solution {
    public String greatestLetter(String s) {
        char ans = '\0';
        char[] str = s.toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> sol = new ArrayList<>();
        for(char x : str)   al.add(x);
        for(int i=0;i<s.length();++i){
            if(Character.isLowerCase(s.charAt(i))){
                //System.out.println((char)(s.charAt(i)-32));
                if(al.contains((char)(s.charAt(i)-32))){
                    sol.add(((char)(s.charAt(i)-32)));
                }       
            } 
        }
        Collections.sort(sol);
        return sol.size()==0 ? "" : String.valueOf((char)sol.get(sol.size()-1));
    }
}