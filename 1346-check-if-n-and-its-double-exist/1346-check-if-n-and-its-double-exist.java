class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr.length<=0)return false;
        Set<Integer> hs = new HashSet<>();
        for(int num :arr){
           if(hs.contains(num*2)||(num%2==0 && hs.contains(num/2))){
            return true;
           }
           hs.add(num);
        }
    
//         while(set.contains(num))
//         {
//             int target = 2*num;
//           if(target ==num){
// return true;
//           }
//         }
//         return false;
return false;
    }
}