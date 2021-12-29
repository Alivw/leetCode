package judgesubqueue;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/29 13:07
 */
public class Main {


    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     *
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        // 双指针实现
        int m = s.length(), n = t.length(), i = 0, j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == m;
    }


    /**
     * 基于动态规划
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence1(String s, String t) {
        // TODO 不会写
    }
}
