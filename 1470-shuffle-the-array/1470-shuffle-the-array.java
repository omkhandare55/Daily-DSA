class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int[nums.length];
        int pointer=0;
        for(int i=0;i<nums.length/2;i++){
            arr[pointer]=(nums[i]);
            arr[pointer+1]=(nums[i+n]);
            pointer+=2;
        }
        return arr;
    }
}