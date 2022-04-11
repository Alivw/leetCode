package lanqb.t02;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        // 2022222022 19 9999 9991
        for (int i = 2022; i <= 2022222022; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            if (isCan(chars)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean isCan(char[] chars) {
        int i = 0, j = chars.length-1;
        while (i < j) {
            if (chars[i] != chars[j] || chars[i] > chars[i + 1])
                return false;
            i++;
            j--;
        }
        return true;
    }

}
