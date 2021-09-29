package 斐波拉契数列;

/**
 *
 * @Author: shizuwei
 * @Create: 2021-09-29 13:57
 **/
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 0; i < 10; i++) {
            System.out.print(main.fib(i)+" ");
        }
    }

    /**
     * 递推实现斐波拉契数列
     * @param: n
     * @return int
     * @author Shi Zuwei on 2021/9/29 14:02
     */
    public int fib(int n){
        if (n==0) {
            return 0;
        }

        int start = 0, end = 1;
        for (int i = 2; i <= n; i++) {
            int temp =end;
            end = start + end;
            start = temp;
        }
        return end;
    }
}
