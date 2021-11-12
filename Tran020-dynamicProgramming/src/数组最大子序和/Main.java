package 数组最大子序和;

/**
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @Author: shizuwei
 * @Create: 2021-09-23 14:08
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * @param: nums
     * @return int
     * @author Shi Zuwei on 2021/9/23 14:25
     */
    public int maxSubArray(int[] nums) {
        /**
         * 1，定义dp[i]表示数组中前i+1（注意这里的i是从0开始的）个元素构成的连续子数组的最大和。
         * 2，如果要计算前i+1个元素构成的连续子数组的最大和，也就是计算dp[i]，只需要判断dp[i-1]是大于0还是小于0。
         * 如果dp[i-1]大于0，就继续累加，dp[i]=dp[i-1]+num[i]。如果dp[i-1]小于0，我们直接把前面的舍弃，也就是说重新开始计算，否则会越加越小的，直接让dp[i]=num[i]。
         * 所以转移公式如下
         * dp[i]=num[i]+max(dp[i-1],0);
         * 3，边界条件判断，当i等于0的时候，也就是前1个元素，他能构成的最大和也就是他自己，所以
         * dp[0]=num[0];
         */
        int length = nums.length, max = nums[0];
        for (int i = 1; i < length; i++) {
            //转移公式
            nums[i] = Math.max(nums[i - 1], 0) + nums[i];
            //记录最大值
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
