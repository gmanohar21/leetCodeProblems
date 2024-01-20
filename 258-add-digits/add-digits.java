class Solution {
    public int addDigits(int num) {
        int sum=0;
        int val=0;
        while(num!=0){
            int fv=num%10;
            sum+=fv;
            num=num/10;
        }
     
        if(sum>9) {
         num=sum;
       
         sum=addDigits(num);
        } 
      
        else {
            return sum;
        }
           
        return sum;
    }
}