class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<num.length()){

            //whenever we get a digit less than previous
            while(!s.isEmpty() && s.peek()>num.charAt(i) && k>0){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
            i++;
        }

        // for cases like 1111
        while(k>0){
            s.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()) sb.append(s.pop());

        sb.reverse();

        while(sb.charAt(0)=='0' && sb.length()>1) sb.deleteCharAt(0);

        return sb.toString();
    }
}