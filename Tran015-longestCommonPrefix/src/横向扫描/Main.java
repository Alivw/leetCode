package 横向扫描;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/23 09:37
 */
public class Main {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 横向扫描遍历整个数组，记 lcp(S1,S2,S3....Sn) 为 字符串 S1，S2，S3的 最长公共子串
     * 那么 lcp(S1,S2,S3....Sn)=lcp( lcp( lcp(S1,S2), S3) ... Sn )
     * 通俗来讲就是，S1跟S2的最长公共字串 记为 A1， A1 跟S3 的最长公共字串记为A2......
     * S1,S2....Sn 的最长公共字串即为An-1  An-1=An-2和Sn的最长公共前缀
     * @param strs
     * @return
     */
    private static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);

        }
        return prefix;
    }

    private static String longestCommonPrefix(String s1, String s2) {

        // 最长公共字串 只需要最短长度即可
        int len = Math.min(s1.length(), s2.length());

        int index = 0;
        while (index < len && s1.charAt(index) == s2.charAt(index)) {
            index++;
        }
        return s1.substring(0, index);
    }

}
