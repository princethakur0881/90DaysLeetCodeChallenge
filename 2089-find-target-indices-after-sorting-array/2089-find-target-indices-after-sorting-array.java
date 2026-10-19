class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans  = new ArrayList<>();
      int n = nums.length;
      Arrays.sort(nums);
      for (int i =0;i<n;i++){
        int key = nums[i];
        if(key==target){
            ans.add(i);
        }
        else if(key>target){
            return ans;
        }
      }  
      return ans;
    }
}