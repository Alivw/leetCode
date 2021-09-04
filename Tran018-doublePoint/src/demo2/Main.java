package demo2;

import java.util.Arrays;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-08-28 09:04
 **/
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        new Main().rotate(nums, k);
        Arrays.stream(nums).forEach(item-> System.out.print(item));
    }

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * @param nums
     * @param k
     * @return void
     * @Author: shizuwei 2021/8/28 9:05
     */
    public void rotate(int[] nums, int k) {
        
    }
}
