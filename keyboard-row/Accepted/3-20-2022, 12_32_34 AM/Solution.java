// https://leetcode.com/problems/keyboard-row

class Solution {
    public String[] findWords(String[] words) {
        String[] base = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> list = new ArrayList<String>();
        for (String string : words) {
            for (String basStr : base) {
                boolean find = true;
                for (char c : string.toCharArray()) {
                    String low = String.valueOf(c).toLowerCase();
                    if (!basStr.contains(low)){
                        find = false;
                        break;
                    }
                }
                if (find) list.add(string);
            }
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < res.length; i++) res[i] = list.get(i);
        return res;
        /*ArrayList<String> sol=new ArrayList<String>();
        ArrayList<String> al1=new ArrayList<String>(Arrays.asList("q","w","e","r","t","y","u","i","o","p"));
        ArrayList<String> al2=new ArrayList<String>(Arrays.asList("a","s","d","f","g","h","j","k","l"));
        ArrayList<String> al3=new ArrayList<String>(Arrays.asList("z","x","c","v","b","n","m"));
        for(int i=0;i<words.length;i++){
            if(al1.contains(words[i].charAt(0))){
                if(check(al1,words[i])){
                    sol.add(words[i]);
                }
            }
            else if(al2.contains(words[i].charAt(0))){
                if(check(al2,words[i])){
                    sol.add(words[i]);
                }
            }
            else{
                if(check(al3,words[i])){
                    sol.add(words[i]);
                }
            }  
        }
        String[] ans= new String[sol.size()];int q=0;
        for(int w=0;w<sol.size();w++){
            ans[q++]= (String)sol.get(w);
        }
        return ans;
    }
    boolean check(ArrayList<String> ll, String str){
        boolean res= true;
        for(int i=0;i<str.length();i++){
            if(!ll.contains(String.valueOf(str.charAt(i)))){
                return false;
            }
        }
        return true;
    */
    }
}