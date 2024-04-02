class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> m=new HashMap<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(m.isEmpty()){
                m.put(a,b);
            }else{
                if(m.containsKey(a)){
                 //   System.out.println(m+"_"+m.get(a)+"_"+b+"_"+(m.get(a)==b));
                    if(m.get(a)!=b) return false;
                }else{
                     if(m.containsValue(b)) return false;
                     m.put(a,b);
                }
            }
        }

        return ans;
    }
}