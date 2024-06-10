package neetcode.s3_sliding_window;

public class S1_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {3,1,2,4,0,5};
        System.out.println(bestTimeToBuyAndSellStock(prices));
    }
    // this solution is for buying and selling stock only once.
    private static int bestTimeToBuyAndSellStock(int[] prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
           if(prices[i] <= min)
               min = prices[i];
           else
               profit = Math.max(prices[i] - min, profit);
        }
        return profit;
    }
}
