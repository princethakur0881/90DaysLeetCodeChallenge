class Solution {
    public int maximumSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        
        int noDelete = arr[0];
        int oneDelete = 0; // Initialize to 0; it won't be used on the first element anyway
        int result = arr[0]; // Tracks the global maximum sum found so far
        
        for (int i = 1; i < arr.length; i++) {
            int prevNoDelete = noDelete;
            
            // Choice 1: Start a new subarray at arr[i] OR extend the previous no-delete subarray
            noDelete = Math.max(arr[i], noDelete + arr[i]);
            
            // Choice 2: Delete arr[i] (take prevNoDelete) OR keep a past deletion (extend prevOneDelete)
            if (i == 1) {
                oneDelete = prevNoDelete; // With only 2 elements, oneDelete can only be deleting the second element
            } else {
                oneDelete = Math.max(prevNoDelete, oneDelete + arr[i]);
            }
            
            // Keep track of the absolute maximum seen at any point in the array
            result = Math.max(result, Math.max(noDelete, oneDelete));
        }
        
        return result;
    }
}