class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
       int sum=0,prof=0;
       for (int i=0;i<prices.length-1;i++){
        if(prices[i+1]>prices[i]){
            prof=prices[i+1]-prices[i];
            sum=sum+prof;
        }
       }
            return sum;
    }
}

