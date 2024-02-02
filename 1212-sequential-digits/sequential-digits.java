class Solution {
    List<Integer> ls=new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
       for(int i=1;i<=9;i++){
           generatenos(low ,high,i,0);
       }
       Collections.sort(ls);
       return ls;
    }
    public void generatenos(int l,int h,int c,int n){
        if(n<=h && n>=l){
            ls.add(n);
        }
        if(n>=h || c>9) return;
        generatenos(l,h,c+1,n*10+c);
    }


    //  public List<Integer> sequentialDigits(int low, int high) {
    //     List<Integer> l =new ArrayList<>();
    //     int allpossibilites[]={12,23,34,45,56,67,78,89,123,234,345,456,567,678,789,1234,
    //                             2345,3456,4567,5678,6789,12345, 23456, 34567, 45678, 56789,
    //                              123456, 234567, 345678, 456789, 1234567, 2345678, 3456789,
    //                               12345678, 23456789, 123456789};
    //     for(int i=0;i<allpossibilites.length;i++){
    //         if(low<=allpossibilites[i] && high>=allpossibilites[i]){
    //           l.add(allpossibilites[i]);
    //         }
    //     }
    //     return l;
    // }
}