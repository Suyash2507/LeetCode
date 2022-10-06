// https://leetcode.com/problems/license-key-formatting

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("[-]", "");
        s = s.toUpperCase();

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        int i=sb.length()-k;
        while(i>0) {
            sb.insert(i, '-');
            i = i-k;
        }

        return sb.toString();
        }
}