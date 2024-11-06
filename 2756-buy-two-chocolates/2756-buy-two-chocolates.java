class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i = 0; i+1 < prices.length; i++){
            int sum = prices[i] + prices[i+1];
            if(sum <= money){
                return (money-sum);
            }
            
            
        }
        return money;
        
    }
}