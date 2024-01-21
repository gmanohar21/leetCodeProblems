class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcnt=0;
        for(int i:nums){
            if(i==0) {
               
                if(maxcnt<count){
                    maxcnt=count;
                } 
                count=0;
            }else{
                 count++;
            }            
        }
        return count>maxcnt?count:maxcnt;
    }
}