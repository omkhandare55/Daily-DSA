// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         if(nums.length==1)return nums;
//         ArrayList<Integer>arr=new ArrayList<>();
//         int max=Integer.MIN_VALUE;
//         int sum=0;
//         for(int i=0;i<k;i++){
//             sum+=nums[i];
//         }
//         max=sum;
//         arr.add(max);
//         for(int i=k;i<nums.length;i++){
//             sum-=nums[i-k];
//             sum+=nums[i];
//             max=Math.max(sum,max);
//              arr.add(max);
//         }
//         return arr.toArray();
//     }
// }
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n = nums.length;
//         int[] ans = new int[n - k + 1];
//         for (int i = 0; i <= n - k; i++) {
//             int max = Integer.MIN_VALUE;
//             for (int j = i; j < i + k; j++) {
//                 max = Math.max(max, nums[j]);
//             }
//             ans[i] = max;
//         }
//         return ans;
//     }
// }   
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>(); // stores indices, values decreasing

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!q.isEmpty() && q.peekFirst() <= i - k) {
                q.pollFirst();
            }
            // Remove indices whose values are <= nums[i] (they can never be max)
            while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.pollLast();
            }
            q.offerLast(i);

            // Once the window is full, record the max
            if (i >= k - 1) {
                ans[i - k + 1] = nums[q.peekFirst()];
            }
        }
        return ans;
    }
}   