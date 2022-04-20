package 让字符串变好;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-100,-98,-1,2,3,4}));
        for (int i : sortAndDistinct1(new int[]{2, 1, 9, 5, 4, 6, 5, 1, 2, 8, 13, 9})) {
            System.out.print(i+ "  ");
        }
    }

    /**
     * 给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
     *
     * @param nums
     * @return
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0] * nums[1] * nums[2], nums[len - 1] * nums[len - 2] * nums[0]);
    }


    /**
     * 实现对数组[2,1,9,5,4,6,5,1,2,8,13,9]排序和去重，输出[1,2,4,5,6,8,9,13]
     * @param nums
     */
    public static int[] sortAndDistinct(int[] nums) {

        // 去重
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        int[] sort = list.stream().mapToInt(i -> i).toArray();

        // 冒泡排序
        int len = sort.length;
        for (int i = 1; i <len; i++) {
            boolean flag = true;
            for (int j = 0; j < len - i; j++) {
                if (sort[j] > sort[j + 1]) {
                    swap(sort, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        return sort;
    }

    /**
     * 交换 数组 i ，j 索引位置的值
     * @param nums
     * @param i
     * @param j
     */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static int[] sortAndDistinct1(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return set.stream().mapToInt(i->i).toArray();
    }
}
