package t540;

/**
 * @Description 有序数组中的单一元素
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/1/31 09:13
 */
public class Main {
    public static void main(String[] args) {
        new Main().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8});
    }


    /**
     * 给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。
     *
     * 请你找出并返回只出现一次的那个数。
     *
     * 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            /**
             * 从 mid 到 hi 的个数
             * 当 num[mid-1]== num[mid]
             *      个数为偶数时：搜索区间为右区间，
             *      个数为奇数时：搜索区间为左区间
             * 当 num[mid]==num[mid+1]
             *      个数为偶数时：搜索区间为左区间
             *      个数为奇数时：搜索区间为右区间
             *
             */
            boolean halvesAreEven = (hi - mid) % 2 == 0;

            if (nums[mid] == nums[mid + 1]) {
                //  i i i i i
                if (halvesAreEven) {
                    // 在右区间
                    lo = mid + 2;
                }else {
                    hi = mid - 1;
                }
            } else if (nums[mid] == nums[mid - 1]) {

                // i   i i i i
                if (halvesAreEven) {
                    // 在左区间
                    hi = mid - 2;
                } else {
                    lo = mid + 1;
                }
            } else {
                return nums[mid];
            }

        }


        return nums[hi];
    }
}
