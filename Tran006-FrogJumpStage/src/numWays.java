/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-19 14:45
 **/
public class numWays {
    public static void main(String[] args) {
        System.out.println(numWays(44));
    }


    /**
     * 多少种跳法
     * @param n
     */
    public static int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 3) {
            return n;
        }
        return numWays(n - 1)+numWays(n-2);
    }
}
