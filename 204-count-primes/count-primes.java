class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int limit=(int)Math.sqrt(n);
        int count=0;
        //true represent composite and false is prime
        boolean composite[]=new boolean[n];
        for(int i=2;i<=limit;i++){
            if(composite[i]==false){
                //mark all multiples of i as true

                for(int j=i*i;j<n;j+=i){
                    composite[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(composite[i] == false) count++;
        }
        return count;
    }
}