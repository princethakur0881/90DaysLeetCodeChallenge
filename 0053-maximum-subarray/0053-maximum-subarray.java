class Solution {
    public int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int result = nums[0];
    for(int i=1;i<nums.length;i++){
        int currSum = maxSum+nums[i];
        int curr = nums[i];
        maxSum = Math.max(curr,currSum);
        result = Math.max(maxSum,result);
    }
    return result;
}
}