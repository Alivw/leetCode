package lanqb.t05;

public class Main {


    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        System.out.println(has0Number(10_0000_0000L));
        System.out.println(System.currentTimeMillis() - l + " ms");


    }

    private static long has0Number(long k) {
        int n = 0;
        for (long i = 1; i <= k; i++) {
            if ((n += fun1(i)) == k) return i * 5;
            if (n > k) return -1;
        }
        return 0;
    }

    /**
     * 计算 i 这个数 有多少个因子是 5
     *
     * @param i
     * @return
     */
    private static int fun(long i) {
        int cnt = 1;
        while (i % 5 == 0) {
            cnt++;
            i /= 5;
        }
        return cnt;
    }

    static int[] arr = new int[50 * 1024 * 1024];       // 200 MB 内存

    private static int fun1(long i) {
        if (i <= 50 * 1024 * 1024) {
            int t = ((int) i);
            if (arr[t - 1] != 0) return arr[(t - 1)];
            int cnt = 1;
            while (t % 5 == 0) {
                cnt++;
                t /= 5;
            }
            arr[t - 1] = cnt;
            return cnt;
        } else
            return i % 5 == 0 ? fun1(i / 5) + 1 : 1;
    }

}
