package 判断数组是否有序;

public class Test {


    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 5, 6, 7, 7, 8, 8};
        System.out.println(isOrderly(nums));
        System.out.println(isOrderlyByBinary(nums));
    }

    /**
     * 判断数组是否有序，整体复杂度为 O（n）
     *
     * @param nums
     * @return
     */
    private static boolean isOrderly(int[] nums) {
        int len = nums.length;
        // res >0 ：nums 是降序，
        // res <0 ：nums 是升序
        int res = 0, i;

        // 首先从头开始，判断 nums 是升序还是降序
        for (i = 0; i < len - 2; i++) {
            if (nums[i] == nums[i + 1]) continue;
            res = nums[i] - nums[i + 1] > 0 ? 1 : -1;
            break;
        }
        //从确定了 nums 的整体序列为升序还是降序的数开始，没必要再从头开始
        // 是否之后的数都为 该序列
        for (; i < len - 1; i++) {
            if (
                // 第一个判断 如果成立，说明两个数相等，直接跳过，后面判断不会执行，短路
                    (nums[i] - nums[i + 1] == 0) ||
                            (res > 0 && nums[i] - nums[i + 1] > 0) ||
                            (res < 0 && nums[i] - nums[i + 1] < 0)
            ) continue;

            break;
        }
        return i == len - 1;
    }

    private static boolean isOrderlyByBinary(int[] nums) {
        int len = nums.length;
        // res >0 ：nums 是降序，
        // res <0 ：nums 是升序
        int res = 0, i;

        // 首先从头开始，判断 nums 是升序还是降序
        for (i = 0; i < len - 2; i++) {
            if (nums[i] == nums[i + 1]) continue;
            res = nums[i] - nums[i + 1] > 0 ? 1 : -1;
            break;
        }

        return res == 0 ? true : isOrderlyByBinary(nums, 0, len / 2, res)
                && isOrderlyByBinary(nums, len / 2 + 1, len - 1, res);
    }

    private static boolean isOrderlyByBinary(int[] nums, int start, int end, int type) {
        if (start >= end) return true;
        if (start == end - 1) {     // 相邻的两个数，根据type 升序还是降序，直接判断两个数的大小
            if (type > 0 && nums[start] - nums[end] >= 0) return true;
            if (type < 0 && nums[start] - nums[end] <= 0) return true;
            return false;
        }

        if (start == end - 2) {     // 相邻的三个数，根据 type，看这三个数顺序 是否跟type 一致
            if (type > 0 && nums[start] - nums[start + 1] >= 0 && nums[start + 1] - nums[end] >= 0) return true;
            if (type < 0 && nums[start] - nums[start + 1] <= 0 && nums[start + 1] - nums[end] <= 0) return true;
            return false;
        }

        int mid = start + ((end - start) >> 1);
        return isOrderlyByBinary(nums, start, mid, type) && isOrderlyByBinary(nums, mid + 1, end, type);

    }


}


