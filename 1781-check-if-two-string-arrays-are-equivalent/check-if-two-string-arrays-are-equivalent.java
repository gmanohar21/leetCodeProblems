class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     StringBuffer sb =new StringBuffer();
         StringBuffer sb1 =new StringBuffer();
        for(int i=0;i<word1.length;i++)
            sb.append(word1[i]);
        
        
        for(int i=0;i<word2.length;i++)
            sb1.append(word2[i]);
        
        String s1=sb.toString();
        String s2=sb1.toString();
        if(!s1.equals(s2)) {
            return false;
        }
        
        return true;
    }
}