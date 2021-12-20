package 按照频率将数组升序排序;

import javax.management.MXBean;
import java.util.*;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/18 12:52
 */
public class Main {


    public static void main(String[] args) {

        //int[] answer = new Main().frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1});
        //Arrays.stream(answer).forEach(i -> System.out.print(i + " "));


        System.out.println(new Main().maxPower("ccbccbb"));
    }


    /**
     * 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
     * <p>
     * 请你返回排序后的数组。
     *
     * @param nums
     * @return
     */
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        //for (int item : nums) {
        //    System.out.print(item+"   ");
        //}
        System.out.println();
        int[] res = new int[nums.length];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int count = 0;

        // 构建map
        for (Integer item : nums) {
            map.merge(item, 1, Integer::sum);
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        //while (iterator.hasNext()) {
        //    Integer key = iterator.next();
        //    System.out.print(key + ":" + map.get(key) + " ");
        //
        //
        //}
        //
        //System.out.println();
        //ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(map.entrySet());
        //Collections.sort(arrayList, (o1,o2)-> o1.getValue().equals(o2.getValue()) ? (o2.getKey()-o1.getKey() ): (o1.getValue().compareTo(o2.getValue())));
        //
        //int z=0;
        //for(int i=0;i<arrayList.size();i++){
        //    for(int j=0;j<arrayList.get(i).getValue();j++){
        //        res[z++]=arrayList.get(i).getKey();
        //    }
        //}
        int index = 0;
        while (map.size() != 0) {
            // find maxValue in map
            Map<Integer, Integer> hash = maxValue(map);
            Set<Integer> set = maxValue(map).keySet();
            // fill the key of maxValue into res

            for (Integer s : set) {
                for (int i=0; i < s; i++) {

                    res[index++] = hash.get(s);
                }
                // delte key
                map.remove(hash.get(s));

            }



        }



        return res;


    }

    private Map<Integer,Integer> maxValue(Map<Integer, Integer> map) {
        Set<Integer> set = map.keySet();
        Map<Integer, Integer> hash = new HashMap<>();
        int max = 0;
        for (Integer item : set) {
            max = map.get(item) > max ? map.get(item) : max;
        }

        for (Integer it : set) {
            if (map.get(it) == max) {
                hash.put(map.get(it), it);
            }
        }

        return hash;
    }


    /**
     * 给你一个字符串s，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
     *
     * 请你返回字符串的能量。
     *
     *
     * 示例 1：
     *
     * 输入：s = "leetcode"
     * 输出：2
     * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
     *
     * @param s
     * @return
     */
    public int maxPower(String s) {
        int ans = 0, cnt = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                cnt++;
                ans = Math.max(cnt, ans);
            }else {
                cnt = 1;
            }
        }
        return ans;

    }


    /**
     * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
     *
     * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
     * 输入：arr = [1,2,2,1,1,3]
     * 输出：true
     * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同
     *
     * @param arr
     * @return
     */
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);

        // 1 1 2 2 3

        return false;


    }


    /**
     * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
     * @param nums
     * @return
     */
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int item : nums) {
            int cnt = 1;
            while (item / 10 != 0) {
                cnt++;
            }
            if (cnt % 2 == 0) {
                res++;
            }
        }
        return res;
    }

}
