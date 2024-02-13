class Solution {
    public String firstPalindrome(String[] words) {
        int length=0;
        boolean check=false;
        String ans="";
        for(String word:words){
            if(checkPal(word)){
                return word;
            }
        }
        return ans;
    }

    public boolean checkPal(String word){
        boolean check=true;
         int l=0,h=word.length()-1;
                while(l<h){
                    if(word.charAt(l)!=word.charAt(h)){
                        check=false;
                    }
                     l++;
                     h--;
                }
                return check;
    }
}