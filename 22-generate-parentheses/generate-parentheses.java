class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        bt(ans,"",0,0,n);
        return ans;
    }
   public void bt(List<String> l,String s,int open,int close,int max){
       if(s.length()==max*2){
           l.add(s);
           return;
       }
       if(open<max) bt(l,s+"(",open+1,close,max);
       if(close<open) bt(l,s+")",open,close+1,max);
    }
}