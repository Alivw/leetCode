package demo1;

/**
 * @Description:  有序数组的平方
 * @Author: shizuwei
 * @Create: 2021-08-28 08:27
 **/
public class Mian {

    public static void main(String[] args) {
        int[] nums = {-1};
        int[] squares = sortedSquares(nums);
        for (int i : squares) {
            System.out.print(i+",");
        }
    }
    
    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     * @param nums
     * @return int[]
     * @Author: shizuwei 2021/8/28 8:28
     */
    public static int[] sortedSquares(int[] nums) {
        int neg = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                neg = i;
                break;
            }
        }

        int left = neg - 1, right = neg, index = 0;
        int[] ans = new int[nums.length];
        while (left >= 0 && right < nums.length) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                ans[index++] = nums[left] * nums[left--];
            }else {
                ans[index++] = nums[right] * nums[right++];
            }
        }

        while (left >= 0) {
            ans[index++] = nums[left] * nums[left--];
        }

        while (right < nums.length) {
            ans[index++] = nums[right] * nums[right++];
        }
        return ans;
    }
}
