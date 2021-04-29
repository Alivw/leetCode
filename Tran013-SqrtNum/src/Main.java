/**
 * @Description: 实现int sqrt(int x函数。
 * 计算并返回x的平方根，其中x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 示例 1:
 * 输入: 4
 * 输出: 2
 *
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 * @Author: Awei
 * @Create: 2021-04-29 14:32
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }

    /**
     * 二分查找 n的平方<= x 的最大值
     *
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int left = 1, right = x;
        return binarySearch(x, left, right);
    }

    private static int binarySearch(int x, int left, int right) {
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return ans;
    }
}


//          if (mid * mid <= x && (mid + 1) * (mid + 1) > x)
