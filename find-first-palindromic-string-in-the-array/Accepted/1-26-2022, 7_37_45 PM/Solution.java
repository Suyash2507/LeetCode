// https://leetcode.com/problems/find-first-palindromic-string-in-the-array

class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i]))
                return words[i];
        }
        return "";
    }
    public boolean isPalindrome(String str)
    {
        int i=0, j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}