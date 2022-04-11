package lanqb.JC.t03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();
        int n = Integer.valueOf(input.substring(1));
        int i =0;
        // 1189mm × 841mm
        int len = 1189, width = 841;
        while (i < n) {
            int temp = Math.max(len, width) / 2;
            len = Math.max(temp, width);
            width = Math.min(temp, width);
            i++;
        }
        System.out.println(len);
        System.out.println(width);
    }
}
