class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int result = Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            maxSum = Math.max(nums[i],maxSum+nums[i]);
           
            minSum = Math.min(nums[i],minSum+nums[i]);
              int maxAbs = Math.abs(maxSum);
            int minAbs = Math.abs(minSum);
            result = Math.max(result,Math.max(maxAbs,minAbs));
        }
        return result;
    }
}