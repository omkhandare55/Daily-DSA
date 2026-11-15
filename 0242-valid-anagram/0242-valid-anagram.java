class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int []abs=new int[26];
        for(int i=0;i<s.length();i++){
            int a='z'-s.charAt(i);
            int b='z'-t.charAt(i);
            abs[a]++;
            abs[b]--;
        }
        for(int i=0;i<abs.length;i++){
            if(abs[i]!=0)return false;
        }
        return true;

    }
}