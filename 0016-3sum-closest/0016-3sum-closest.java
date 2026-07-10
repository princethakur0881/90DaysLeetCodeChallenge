class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int currSum = nums[i]+nums[l]+nums[r];
                if(currSum==target){
                    return currSum;
                }
                if(Math.abs(currSum-target)< Math.abs(closestSum -target)){
                    closestSum = currSum;
                }
                if(currSum <target){
                    l++;

                }
                else{
                    r--;
                }
            }
        }
        return closestSum;
    }
}