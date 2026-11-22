class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if((sum-(temp+nums[i]))==temp)return i;
            temp+=nums[i];
        }
        return -1;
    }
}