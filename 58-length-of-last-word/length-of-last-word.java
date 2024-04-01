class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=0;
       for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))) last++;
            else break;
       }
       return last;
    }
}