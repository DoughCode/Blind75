class BuyandSellStock{

        public int maxProfit(int[] prices) {
            
            int minPrice = Integer.MAX_VALUE;
            int max = 0;
            
            for (int i = 0; i < prices.length; i++)
            {
                if(prices[i] < minPrice)
                {
                    minPrice = prices[i];
                }
                else if (prices[i] - minPrice > max)
                {
                    max = prices[i] - minPrice;
                }
            }
            return max;
        
        }

        //simple peak finding gives us an O(n)
}