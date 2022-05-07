import java.util.Random;
import java.util.Scanner;

public class Number {

    public static final int NUM= new Random().nextInt(10);

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您猜的数：");
        int t = in.nextInt();
        while (t != NUM) {
            if (t < NUM) {
                System.out.println("遗憾，太小了！");
            }else
                System.out.println("遗憾，太大了！");
            n++;
            System.out.println("请输入您猜的数：");
            t = in.nextInt();
        }

        n++;
        System.out.println("预测"+n+"次，您猜中了！");

    }



}
