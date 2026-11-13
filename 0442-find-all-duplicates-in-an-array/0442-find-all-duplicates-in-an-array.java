class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer>check=new HashSet<>();
        List<Integer>duplicate=new ArrayList<>();
        for(int i:nums){
            if(check.contains(i))duplicate.add(i);
            else check.add(i);
        }
        return duplicate;
    }
}