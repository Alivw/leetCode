package 数字翻译字符串;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 *
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 * @Author: shizuwei
 * @Create: 2021-09-30 09:18
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().translateNum(25));
    }

    /**
     *  同样成功
     * @param: num
     * @return int
     * @author Shi Zuwei on 2021/9/30 14:20
     */
    public int translateNum(int num) {
        if (num < 10)
            return 1;
        int length = String.valueOf(num).length();
        int[] nums = new int[length];
        int index = length;
        while (num  != 0) {
            nums[--index] = num % 10;
            num /= 10;
        }
//        nums[index] = num;
        int[] dp = new int[length+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < length; i++) {
            int temp = 10 * nums[i - 1] + nums[i];
            if (temp >= 10 && temp <= 25) {
                dp[i+1] = dp[i] + dp[i - 1];
            } else
                dp[i+1] = dp[i];
        }
        return dp[length];
    }


    /**
     * 题解
     * @param: num
     * @return int
     * @author Shi Zuwei on 2021/9/30 14:27
     */
    public int translateNum1(int num) {
        // 转为字符串，后面使用切片操作
        String str = String.valueOf(num);
        //dp
        int a = 1,b = 1; // 初始a和b表示长度为0和1的情况。a <= b
        int res = b; // 别丢
        String tmp;
        for (int i=2; i <= str.length(); ++i){ // 注意i <= str.length(),而不是<
            tmp = str.substring(i-2,i);
            if (tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0)
                res = a + b; // dp[i] = dp[i-2] + dp[i-1]
            else
                res = b; // dp[i] = dp[i]
            a = b;
            b = res;
        }
        return res;
    }



}
