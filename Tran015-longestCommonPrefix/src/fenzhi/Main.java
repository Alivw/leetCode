package fenzhi;

/**
 * @Description: 分治法
 * @Author: Awei
 * @Create: 2021-05-03 15:28
 **/
public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private static String longestCommonPrefix(String[] strs, int start, int end) {
        if (start == end) {
            return strs[start];
        }else {
            int mid = start + (end - start) / 2;
            String lcpLeft = longestCommonPrefix(strs, 0, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, end);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    private static String commonPrefix(String lcpLeft, String lcpRight) {
        int minLen = Math.min(lcpLeft.length(), lcpRight.length());
        for (int i = 0; i < minLen; i++) {
            if (lcpLeft.charAt(i) != lcpRight.charAt(i)) {
                return lcpLeft.substring(0, i);
            }
        }
        return lcpLeft.substring(0, minLen);
    }

}

