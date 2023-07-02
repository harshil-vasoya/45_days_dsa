public class day_1_Best_Time_to_Buy_and_Sell_Stock {
    public static int solution(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
       int[] prices={7,1,5,3,6,4};
       int ans=solution(prices);
        System.out.println(ans);
    }
}
