package lanqb.t03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxCntWord("BABBACACCDD"));
    }

    public static String maxCntWord(String s) {
        char[] chars = s.toCharArray();
        // AAABBBCC
        Arrays.sort(chars);
        Map<Character, Integer> map = new TreeMap<>();
        // 初始化 map
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxTarget = 0;
        for (Character c : map.keySet()) {
            maxTarget = Math.max(maxTarget, map.get(c));
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : map.keySet()) {
            if (map.get(c) == maxTarget) {
                sb.append(c);
            }
        }
        return sb.toString();


    }
}
