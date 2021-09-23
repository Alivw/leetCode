package 买股票时机;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-23 13:31
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }



    /**
     * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
     *
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     *
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     *
     * 输入：[7,1,5,3,6,4]
     * 输出：5
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     *
     * 输入：prices = [7,6,4,3,1]
     * 输出：0
     * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
     * @param: prices
     * @return int
     * @author Shi Zuwei on 2021/9/23 13:31
     */
    public int maxProfit(int[] prices) {
        if (null == prices || prices.length == 0) {
            return 0;
        }

        int length = prices.length;
        int[][] dp = new int[length][2];
        int nohold = 0;
        int hold = -prices[0];
        for (int i = 1; i < length; i++) {
            nohold = Math.max(nohold,hold + prices[i]);
            hold= Math.max(hold, -prices[i]);

        }
        return nohold;
    }

}
