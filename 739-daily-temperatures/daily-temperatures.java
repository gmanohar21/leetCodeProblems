class Solution {
    public int[] dailyTemperatures(int[] t) {
    int n=t.length;
    int ans[]=new int[t.length];
    Stack<Integer> s=new Stack<>();
        for(int i=0;i<t.length;i++){
          while(!s.isEmpty() && t[i]>t[s.peek()]){
              ans[s.peek()]=i-s.peek();
              s.pop();
          } 
          s.push(i);  
        }
        return ans;
    }
}