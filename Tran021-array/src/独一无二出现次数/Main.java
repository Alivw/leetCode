package 独一无二出现次数;

import java.util.*;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/26 19:53
 */
public class Main {
    public static void main(String[] args) {


    }

    /**
     * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
     *
     * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
     * @param arr
     * @return
     */
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            set.add(item.getValue());
        }

        return set.size() == map.size();
    }
}
