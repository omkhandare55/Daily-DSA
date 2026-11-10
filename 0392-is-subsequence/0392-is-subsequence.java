class Solution {
    public boolean isSubsequence(String s, String t) {
        int len=s.length();
        if(len==0)return true;
        int i=0;
        int j=0;
        while(i<t.length() && j<len){
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==len)return true;
            }
            i++;
        }
        return false;
    }
}