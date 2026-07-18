class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n<=0) return original;
        int temp = 0;
        for(int i=0;i<n;i++){
            if(nums[i]== original){
                original = 2*original;
            }
        }
    return original;
    }
}