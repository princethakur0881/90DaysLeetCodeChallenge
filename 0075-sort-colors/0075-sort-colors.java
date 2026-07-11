class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
       int zeros=0,ones=0,twos=0;
       for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
            }
            else if(nums[i]==1){
                ones++;

            }
            else if(nums[i]==2){
                twos++;
            }
       } 
       int idx =0;

       for(int j=0;j<zeros;j++){
        nums[idx++]=0; }
        for(int j=0;j<ones;j++){
        nums[idx++]=1; }
        for(int j=0;j<twos;j++){
        nums[idx++]=2; }
       for(int j=0;j<n;j++){
        System.out.print(nums[j]+" "); }
    }
}