package neetcode.s3_sliding_window;

public class S1_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {3,1,2,4,0,5};
        System.out.println(TimeToBuyAndSellStock(prices));
    }
    // this solution is for buying and selling stock only once.
    private static int TimeToBuyAndSellStock(int[] prices){
        int min = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
           if(prices[i] < min)
               min = prices[i];

               // we will come to else part only if current price is not less then our min price,
               // It helps if our prices are ordered in decreasing.
               // we don't calculate price that time as prices continuously decreasing
           else
               profit = Math.max(prices[i] - min, profit);
        }
        return profit;
    }
}
