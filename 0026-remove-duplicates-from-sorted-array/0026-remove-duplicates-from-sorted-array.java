class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int n=nums.length;
        for(int r=1;r<n;r++){
            if(nums[r]!=nums[left]){
                left++;
                nums[left]=nums[r];
            }
        }
        return left+1;
    }
}