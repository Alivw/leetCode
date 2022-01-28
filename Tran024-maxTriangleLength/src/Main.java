import java.util.Arrays;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/11 09:28
 */
public class Main {



    /**
     * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
     *
     * 如果不能形成任何面积不为零的三角形，返回 0。
     */

    public static void main(String[] args) {
        System.out.println("组成最长的三角形周长为:" + largestPerimeter(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
