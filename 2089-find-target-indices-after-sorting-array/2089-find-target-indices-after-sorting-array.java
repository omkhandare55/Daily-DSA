class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer>list=new ArrayList<>();
        // Arrays.sort(nums);
        int lesscount=0;
        int targetcount=0;
        for(int n:nums){
            if(n<target)lesscount++;
            if(n==target)targetcount++;
        }
        for(int i=0;i<targetcount;i++){
            list.add(i+lesscount);
        }
        return list;
    }
}