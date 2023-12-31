class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int i=0;
        int j=0;
        int ans=0;
        int diff=0;
        boolean check=false;
        List<Integer> allMatches=new ArrayList<>();
        for(i = 0; i < s.length(); i++){
            for(j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                     check=true;
                   allMatches.add(i);
                   allMatches.add(j);
                   
                }
            }
        }
         for(i=1;i<allMatches.size();i++){
            diff=allMatches.get(i)-allMatches.get(i-1);
            ans=Math.max(ans,diff);
        }

       
        if(check==false) return -1;
        return ans-1;
    }
}