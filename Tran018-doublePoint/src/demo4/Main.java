package demo4;

import java.util.Arrays;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-11 14:30
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        Arrays.stream(new Main().twoSum2(nums, 13)).forEach(i -> System.out.print(i + " "));
    }

    /**
     * 给定一个已按照 非递减顺序排列 的整数数组numbers ，请你从数组中找出两个数满足相加之和等于目标数target 。
     * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
     * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素
     *
     * @param numbers
     * @param target
     * @return int[]
     * @author: Shi Zuwei on 2021/9/11 14:45
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left, right};
            }
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else
                right--;
        }
        return new int[]{left, right};
    }

    /**
     * 利用二分查找完成功能
     *
     * @param numbers
     * @param target
     * @return int[]
     * @author: Shi Zuwei on 2021/9/11 14:45
     */
    public int[] twoSum2(int[] numbers, int target) {
        int i = 0, mid = 0;
        for (; i < numbers.length; i++) {
            int left = i + 1, right = numbers.length - 1;
            while (left <= right) {
                mid = left + (right - left >> 1);
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                }
                if (numbers[mid] < target - numbers[i]) {
                    left = mid + 1;
                } else
                    right = mid - 1;
            }
        }
        return new int[]{i + 1, mid + 1};
    }

}
