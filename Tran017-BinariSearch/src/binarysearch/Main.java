package binarysearch;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-08-17 18:21
 **/
public class Main {
    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 3, 3, 5, 9, 12};
        for (int i = 0; i < a.length; i++) {
            System.out.println(rightSearch(a, a[i]));
        }
    }


    /**
     * @Description: 寻找一个数（基本的二分搜索）
     * @Param:
     * @return:
     * @Author: shizuwei
     * @Date: 2021/8/22
     */
    public static int search(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * @Description: 寻找左侧边界的二分搜索
     * @Param:
     * @return:
     * @Author: shizuwei
     * @Date: 2021/8/22
     */
    public static int leftSearch(int[] nums, int target) {
        int mid, left = 0, right = nums.length;
        // 搜索区间 [left,right) 所以循环条件 left==right 时，搜索区间为空
        while (left < right) {
            mid = left + (right - left) / 2;
            // 如果 mid 元素跟 target 相等，则去左边区间搜索, [left,mid)
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    /**
     * @Description: 寻找右侧边界的二分搜索
     * @Param:
     * @return:
     * @Author: shizuwei
     * @Date: 2021/8/22
     */
    public static int rightSearch(int[] nums, int target) {
        int mid, left = 0, right = nums.length;
        // 搜索区间 [left,right) 所以循环条件 left==right 时，搜索区间为空
        while (left < right) {
            mid = left + (right - left) / 2;
            // 如果 mid 元素跟 target 相等，则去右边区间搜索, [left,mid),[mid+1,right)
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }

}
