// https://leetcode.com/problems/find-the-difference

class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = new char[26];
        int len = s.length();
        for(int i = 0; i < len; i++){
            int indexS = s.charAt(i) - 'a';
            int indexT = t.charAt(i) - 'a';
            arr[indexS]++;
            arr[indexT]++;
        }
        int lastOfT = t.charAt(len) - 'a';
        arr[lastOfT]++;
        
        char c = ' ';
        for(int i = 0; i < 26; i++){
            if(arr[i] % 2 != 0){
                c = (char) ( i + 'a');
            }
        }
        return c;
    }
}