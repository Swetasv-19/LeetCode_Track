// Last updated: 7/9/2026, 10:13:54 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);

        long total = 0;
        int n = nums.length;

        for(int i = n - 1 ; i >= n - k ; i--) {
            if(mul > 1) {
                total += (long) nums[i] * mul;
            } else {
                total += nums[i];
            }
            mul--;
        }

        return total;
    }
}