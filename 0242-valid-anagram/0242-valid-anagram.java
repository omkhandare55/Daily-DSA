class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        if(s.length() != t.length())return false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int freq=map1.getOrDefault(c,0);
            map1.put(c,freq+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            int freq=map2.getOrDefault(c,0);
            map2.put(c,freq+1);
        }
        return map1.equals(map2);
        

    }
}