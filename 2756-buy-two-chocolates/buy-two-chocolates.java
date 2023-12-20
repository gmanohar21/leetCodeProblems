class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans=0;
        if(prices[0]+prices[1]==money){
            ans= 0;
        }else if(prices[0]+prices[1]>money){
            ans= money;
        }else if(prices[0]+prices[1]<money){
            ans= money-(prices[0]+prices[1]);
        }
        return ans;
    }
}