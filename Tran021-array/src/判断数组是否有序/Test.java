package 判断数组是否有序;

public class Test {


    public static void main(String[] args) {
        System.out.println(isOrderly(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 7, 8, 7}));

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


}


