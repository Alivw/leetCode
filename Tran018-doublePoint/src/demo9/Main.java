package demo9;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-14 10:52
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;


//        Set<Character> set = new HashSet<>();
//        int n = s.length(), rk = -1, ans = 0;
//        for (int left = 0; left < n; left++) {
//            if (left != 0) {
//                set.remove(s.charAt(left - 1));
//            }
//
//            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
//                set.add(s.charAt(rk + 1));
//                rk++;
//            }
//            ans = Math.max(ans, rk - left + 1);
//        }
//        return ans;
    }
}
