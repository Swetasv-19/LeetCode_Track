// Last updated: 7/9/2026, 10:18:05 AM
class Solution {
    public String largestNumber(int[] nums) {
        
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] + arr[i]).compareTo(arr[i] + arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if (arr[0].equals("0")) return "0";

        String result = "";
        for (String s : arr) {
            result += s;
        }
        return result;
    }
}