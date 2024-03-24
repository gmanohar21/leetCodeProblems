class Solution {
    public int maxProfit(int[] prices) {
        int cmax=0,omax=0;

        for(int i=1;i<prices.length;i++){
            cmax+=prices[i]-prices[i-1];
            if(cmax<0) cmax=0;
            omax=Math.max(cmax,omax);
        }
        return omax;
    }
}