import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String[] strs = s.split(" ");
        System.out.println(strs[strs.length-1].length());

    }
}
