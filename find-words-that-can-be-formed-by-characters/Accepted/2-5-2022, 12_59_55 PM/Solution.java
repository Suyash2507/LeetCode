// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters

class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        HashMap<Character, Integer> copyMap;
        for (String word : words) {
            copyMap = (HashMap<Character, Integer>) countMap.clone();
            boolean fail = false;
            for (char c : word.toCharArray()) {
                if (copyMap.get(c) == null || copyMap.get(c) <= 0) {
                    fail = true;
                    break;
                } else {
                    copyMap.put(c, copyMap.get(c) - 1);
                }
            }
            if (!fail) res += word.length();
        }
        return res;
    }
}