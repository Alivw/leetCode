package 搜索插入位置;

import java.lang.reflect.Member;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * @Author: shizuwei
 * @Create: 2021-09-28 11:35
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length, mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            if (target < nums[mid]) {
                right = mid;
            }else
                left = mid + 1;
        }
        return left;
    }
}
