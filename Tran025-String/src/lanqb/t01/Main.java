package lanqb.t01;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int start = 5;
        int nn = (int) (Math.pow(20, 22) % 7);
        System.out.println(arr[start + nn % 7]);
    }
}
