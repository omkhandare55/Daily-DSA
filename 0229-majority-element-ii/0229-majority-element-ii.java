class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }

        Arrays.sort(nums);

        int n = nums.length;
        int first = nums[0];
        int count = 1;

        if (count > n / 3) {
            list.add(first);
        }

        for (int i = 1; i < n; i++) {
            if (first == nums[i]) {
                count++;
            } else {
                count = 1;
                first = nums[i];
            }

            if (count > n / 3) {
                if (!list.contains(first)) {
                    list.add(first);
                }
            }
        }

        return list;
    }
}