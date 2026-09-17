class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int result = nums[0];
        int maxEnding = nums[0];
        int minEnding = nums[0];
        for(int i=1;i<nums.length;i++){
            int tempMax = maxEnding;
            maxEnding = Math.max(nums[i],Math.max(maxEnding*nums[i],minEnding*nums[i]));
            minEnding  = Math.min(nums[i],Math.min(tempMax*nums[i],minEnding*nums[i]));
             result = Math.max(result,maxEnding);
        }
        return result;
    }
}