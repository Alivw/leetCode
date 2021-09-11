package demo6;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-11 16:05
 **/
public class Main {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(new Main().reverseWords(str));
    }

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            for (int j = strs[i].length() - 1; j >= 0; j--) {
                builder.append(strs[i].charAt(j));
            }
            if (i != strs.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
