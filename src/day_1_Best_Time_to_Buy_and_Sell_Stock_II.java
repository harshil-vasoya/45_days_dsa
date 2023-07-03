public class day_1_Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
    int[] profit={7,1,5,3,6,4};
    int ans=solution(profit);
        System.out.println(ans);
    }
    public static int solution(int[] prices) {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1])
                max_profit+=(prices[i]-prices[i-1]);
        }
        return max_profit;
    }

}

