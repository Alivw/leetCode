/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-19 19:10
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
//        if (n == 0) {
//            return 0;
//        }
//        while (n % 10 == 0) {
//            n /= 10;
//        }
//        StringBuilder sb = new StringBuilder();
//        if (n < 0) {
//            sb.append("-");
//        }
//        n = n < 0 ? n * (-1) : n;
//        char[] num = new StringBuffer(n + "").reverse().toString().toCharArray();
//
//        for (int i = 0; i < num.length; i++) {
//            sb.append(num[i]);
//        }
//        return Integer.parseInt(sb.toString());
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}
