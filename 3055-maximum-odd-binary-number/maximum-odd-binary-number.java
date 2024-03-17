class Solution {
    public String maximumOddBinaryNumber(String s) {
         char[]ptr=s.toCharArray();
        Arrays.sort(ptr);
        int cnt=0;
        for(int i=ptr.length-1;i>=0;i--){
            if(ptr[i]=='1' && i<ptr.length-1 && cnt<i){
                char tmp=ptr[i];
                ptr[i]=ptr[cnt];
                ptr[cnt]=tmp;
                cnt++;
            }
        }
        return new String(ptr);
    }
}