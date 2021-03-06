/**
 * @Description:
 * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 *
 * 如果 x 是正数，返回 1 。
 * 如果 x 是负数，返回 -1 。
 * 如果 x 是等于 0 ，返回 0 。
 * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
 *
 * 返回 signFunc(product) 。
 * 实例1：
 * 输入：nums = [-1,-2,-3,-4,3,2,1]
 * 输出：1
 * 解释：数组中所有值的乘积是 144 ，且 signFunc(144) = 1
 *
 * 实例2：
 * 输入：nums = [1,5,0,2,-3]
 * 输出：0
 * 解释：数组中所有值的乘积是 0 ，且 signFunc(0) = 0
 * @Author: Awei
 * @Create: 2021-04-27 22:20
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        int result = arraySign(nums);
    }

    private static int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if(num==0) return 0;
            result *= num < 0 ? -1 : 1;
        }
        return result;
    }
}
