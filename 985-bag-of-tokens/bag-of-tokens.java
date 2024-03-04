class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int maxscore=0;
        int l=0;
        int h=tokens.length-1;
        while(l<=h){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                maxscore=Math.max(maxscore,score);
                l++;
                
            }else{
                if(score>=1){
                    power+=tokens[h];
                    score--;
                    h--;
                }else{
                    break;
                }
            }
           
        }
        return maxscore;
    }
}