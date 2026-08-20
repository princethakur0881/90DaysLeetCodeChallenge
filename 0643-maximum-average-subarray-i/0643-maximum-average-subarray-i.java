class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int n = nums.length;
        if(k>n|| nums==null||k<=0) return 0.0;
       
        double windowmax = 0;
        for(int i=0;i<k;i++){
               windowmax+=nums[i];
        }
        double maxAvg = windowmax;
       for(int i=k;i<n;i++){
         windowmax +=nums[i]-nums[i-k];
        if(windowmax>maxAvg){
            maxAvg = windowmax;
        }
               
           
        
      
        
       }
       return maxAvg/k;
    }
}