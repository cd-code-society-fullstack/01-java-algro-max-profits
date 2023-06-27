import java.util.Arrays;

public class Problem01 {

    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int sell = 0, buy = -prices[0];
        for (int i = 1; i < n; i++) {
            sell = Math.max(sell, buy + prices[i] - fee);
            buy = Math.max(buy, sell - prices[i]);
        }
        return sell;
    }

    
    public static void main(String[] args) {
        String[] pricesString = args[0].split(",");
        int[] prices = new int[pricesString.length];
        for (int i = 0; i < pricesString.length; i++) {
            prices[i] = Integer.parseInt(pricesString[i]);
            System.out.println(i +" : "+ pricesString[i]);
        }

        // parse fee from command line arguments
        int fee = Integer.parseInt(args[1]);
        System.out.println(fee);
        System.out.println(maxProfit(prices, fee));
    }


}
