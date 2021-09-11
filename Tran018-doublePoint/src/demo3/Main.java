package demo3;

import java.util.Arrays;

/**
 * @Description: 移动零
 * @Author: shizuwei
 * @Create: 2021-09-11 14:01
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new Main().moveZeroes(nums);
        Arrays.stream(nums).forEach(item -> System.out.print(item+" "));
    }

    /**
     * 移动零
     * @param nums
     * @return void
     * @author: Shi Zuwei on 2021/9/11 14:10
     */
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    /**
     * 交换索引位置的值
     * @param nums
     * @param left
     * @param right
     * @return void
     * @author: Shi Zuwei on 2021/9/11 14:09
     */
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
