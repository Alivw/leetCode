package demo2;

import java.util.Arrays;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-28 09:04
 **/
public class Main {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        new Main().rotate(nums, k);
        Arrays.stream(nums).forEach(item -> System.out.print(item + " "));
    }

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     *
     * @param nums
     * @param k
     * @return void
     * @author: Shi Zuwei on 2021/9/11 10:37
     */
    public void rotate(int[] nums, int k) {
        reverseArr(nums, 0, nums.length - 1);
        reverseArr(nums, 0, k%nums.length-1 );
        reverseArr(nums, k%nums.length, nums.length - 1);
    }

    /**
     * 反转数组元素
     *
     * @param nums
     * @param start
     * @param end
     * @return void
     * @author: Shi Zuwei on 2021/9/11 10:53
     */
    private void reverseArr(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
