/**
 * @Description: 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 * @Author: Awei
 * @Create: 2021-04-12 15:47
 **/
public class Main {
    public static void main(String[] args) {
        int n = 2144;
        System.out.println(subtractProductAndSum(n));;
    }
    public static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }
        return product - sum;
    }
}
