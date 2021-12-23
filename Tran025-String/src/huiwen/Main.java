package huiwen;

/**
 * @Description 最长回文字串
 * @Author jalivv
 * @Date 2021/12/16 15:33
 */
public class Main {

    public static void main(String[] args) {
//        System.out.println(new Main().longestPalindrome("babad"));



        System.out.println(new Main().countConsistentStrings("fstqyienx", new String[]{"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"}));
    }


    /**
     * 记 P(i,j) 表示字符串的第 i 到 j个字母组成的串（下文表示成 s[i:j]s[i:j]）是否为回文串
     *
     * P(i,j)=true  Si.....Sj  是一个回文串
     * P(i,j)=false S[i,j] 本身不是回文串 或者 i>j
     *
     * 状态转移方程 ： P(i,j) = P(i+1,j-1) && Si==Sj
     * 最终的答案即为所有 P(i,j)=true 中 j−i+1（即子串长度）的最大值。
     *
     */
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int L = 2; L <= len; L++) {
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= len) {
                    break;
                }

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }




    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        for(int i =0;i<words.length;i++){

            boolean flag = true;
            for(int j =0;j<words[i].length();j++){
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                res++;
            }

        }
        return res;
    }
}
