package easy;

public class BestTimeToBuy {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuy buy = new BestTimeToBuy();
        int[] prices = {1, 3, 1, 7, 6};
        int profit = buy.maxProfit(prices);
        System.out.println(profit);
    }

}
