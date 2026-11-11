class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2)return n;
        int count=1;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count<=2){
                    list.add(nums[i]);
                }
            }
            else{
                list.add(nums[i]);
                count=1;
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}