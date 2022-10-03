// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters

class Solution {
    public int countCharacters(String[] words, String chars) {
        List<String> ll=new ArrayList<>();
        for(int i=0;i<chars.length();i++){
            ll.add(String.valueOf(chars.charAt(i)));
        }
        int sum=0;
        for(int j=0;j<words.length;j++){
            int z=0;
            for(int k=0;k<words[j].length();k++){
                if(!ll.contains(String.valueOf(words[j].charAt(k)))){
                    z=1;
                    break;
                }
            }
            if(z==0)    sum=sum+words[j].length();
        }
        System.out.println(ll);
        return sum;
    }
}