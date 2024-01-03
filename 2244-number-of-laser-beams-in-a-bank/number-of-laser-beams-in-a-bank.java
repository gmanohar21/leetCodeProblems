class Solution {
    public int numberOfBeams(String[] bank) {
       int count=0;
       int prev=0;
       for(int i=0;i<bank.length;i++){
           int ones=countOnes(bank[i]);
           if(ones!=0){
               count+=ones*prev;
                prev=ones;
           }
       }

        return count;
    }
    public int countOnes(String floor){
        int oneCount=0;
        for(char c:floor.toCharArray()){
            if(c=='1') oneCount++;
        }
        return oneCount;
    }
}