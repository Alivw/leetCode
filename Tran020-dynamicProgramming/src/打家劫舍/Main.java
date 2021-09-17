package 打家劫舍;

import sun.security.util.Length;

/**
 * @Description: 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * @Author: shizuwei
 * @Create: 2021-09-17 14:14
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().rob(new int[]{2, 7, 9, 3, 1}));
    }


    public int rob(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum1 += nums[i];
            }else
                sum2 += nums[i];
        }
        return sum1 > sum2 ? sum1 : sum2;
    }
}
