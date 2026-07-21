class Solution {
    public double myPow(double x, int n) {
   
        long N =n;
        if(N<0){
            x=1/x;
            N = -N;

        }
        double  ans = 1.0;
        double currAns = x;

       while(N>0){
        if((N&1)==1){
            ans *= currAns;}
           
           currAns *=currAns;
           N>>=1;
        
    }
    return ans;
    }
}