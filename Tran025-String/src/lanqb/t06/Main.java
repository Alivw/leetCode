package lanqb.t06;

public class Main {
    public static void main(String[] args) {
        double ans = 1;
        for (int i = 0; i < 22; i++) {
            ans *= 20;
        }

        System.out.println(ans);

        System.out.println(Math.pow(20,22));
    }
}
