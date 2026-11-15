class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int r=s.length()-1;
        while(left<r){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(r)))return false;
            left++;
            r--;
        }
        return true;
    }
}