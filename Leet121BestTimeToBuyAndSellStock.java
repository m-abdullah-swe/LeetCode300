import java.util.*;
public class Leet121BestTimeToBuyAndSellStock {
    
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Leet121BestTimeToBuyAndSellStock leet = new Leet121BestTimeToBuyAndSellStock();

        int[] arr = { 7, 1, 5, 3, 6, 4};


        System.err.println(leet.maxProfit(arr));
    }
}
