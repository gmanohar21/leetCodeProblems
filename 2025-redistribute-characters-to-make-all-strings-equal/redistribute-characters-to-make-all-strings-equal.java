class Solution {
    public boolean makeEqual(String[] words) {
       Map<Character,Integer> ans=new HashMap<>();
       for(String s:words){
           for(char c:s.toCharArray()){
              ans.put(c,ans.getOrDefault(c,0)+1);
           }
       }
       for(char ch:ans.keySet()){
           int c=ans.get(ch);
           if(c%words.length!=0) return false;
       }
       return true;
    }
}