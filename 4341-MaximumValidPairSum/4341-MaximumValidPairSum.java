// Last updated: 7/9/2026, 10:13:56 AM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max = nums[0], ans = Integer.MIN_VALUE;
       
            for(int j=k;j<nums.length;j++){
                max = Math.max(max,nums[j-k]);
                ans = Math.max(ans,max+nums[j]);
    }
        return ans;
    }
}