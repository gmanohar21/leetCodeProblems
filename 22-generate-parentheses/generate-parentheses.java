class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        genFn(ans,0,0,n,"");
        return ans;
    }
    public void genFn( List<String> ans,int open,int close,int n,String data){
        if(data.length()==n*2){
            ans.add(data);
            return;
        }
         
       if(open<n) genFn(ans,open+1,close,n,data+"(");
        if(close < open)genFn(ans,open,close+1,n,data+")");
    }
}