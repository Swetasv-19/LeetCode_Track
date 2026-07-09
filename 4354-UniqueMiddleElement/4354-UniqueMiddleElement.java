// Last updated: 7/9/2026, 10:13:51 AM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums[nums.length/2],c=0;
        for(int x : nums)
            if(x==mid)c++;
        return c==1;
    }
}