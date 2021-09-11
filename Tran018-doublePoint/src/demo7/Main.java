package demo7;

import java.util.Arrays;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-11 16:31
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 2, 3};
        System.out.println(new Main().removeDuplicates(nums));
        Arrays.stream(nums).forEach(i -> System.out.print(i+" "));
    }

    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left++;
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
            } else {
                right++;
            }
        }
        return left+1;
    }
}
