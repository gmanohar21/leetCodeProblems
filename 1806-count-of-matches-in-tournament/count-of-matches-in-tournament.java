class Solution {
    public int numberOfMatches(int n) {
       //only one winner will come at the end 
       //TC=O(1)
       return n-1;
    }
}


//first approach simulation
/* 
tc=O(logn)  we can improve TC by O(1)
  public int numberOfMatches(int n) {
        int ans=0;
        while(n>1){
            if(n%2==0){
                ans+=n/2;
                n=n/2;
            }else{
                 ans+=(n-1)/2;
                n=(n-1)/2+1;
            }
        }
        return ans;
    }
*/