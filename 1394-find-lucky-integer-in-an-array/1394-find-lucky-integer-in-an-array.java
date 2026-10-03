class Solution {
    public int findLucky(int[] arr) {
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int x:arr){
        map.put(x, map.getOrDefault(x, 0) + 1);
      }
      int luckynum=-1;
      for(int x:map.keySet()){
        if(x>luckynum){
        if(x==map.get(x)){
            luckynum=x;
        }
        }
      }
      return luckynum;
}
}