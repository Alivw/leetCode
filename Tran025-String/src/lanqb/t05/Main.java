package lanqb.t05;

public class Main {


    public static void main(String[] args) {

        System.out.println(has0Number((long) Math.pow(10,18)));

    }

    private static long has0Number(long k) {
        for (int i = 1; i < Long.MAX_VALUE; i++) {
            if (fun(i)% Math.pow(10,k)==0) {
                return i;
            }
        }
        return Long.MAX_VALUE;
    }

    public static long fun(int n ){
        if(n<3) return n;
        return n * fun(n - 1);
    }

}
