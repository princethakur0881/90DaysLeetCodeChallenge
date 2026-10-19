class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    //     List<Integer> ans  = new ArrayList<>();
    //   int n = nums.length;
    //   Arrays.sort(nums);
    //   for (int i =0;i<n;i++){
    //     int key = nums[i];
    //     if(key==target){
    //         ans.add(i);
    //     }
    //     else if(key>target){
    //         return ans;
    //     }
    //   }  
    //   return ans;

    int lessCount =0;
    int targetCount =0;
    for(int num: nums){
        if(num<target){
            lessCount++;
        }
        else if(num==target){
            targetCount++;
        }
    }

    List<Integer> ans = new ArrayList<>();
    for(int i=0;i<targetCount;i++){
        ans.add(lessCount + i);
    }
    return ans;
    }
}