package 打家劫舍2;

/**
 * @Description: 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * @Author: shizuwei
 * @Create: 2021-09-17 14:14
 **/
public class Main {
    /**
     * 写不出来
     * @param: args
     * @return void
     * @author Shi Zuwei on 2021/9/17 15:02
     */
    public static void main(String[] args) {
        System.out.println(new Main().rob(new int[]{1,2,3}));
    }


    public int rob(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        if (nums.length == 3) {
            return nums[0] > nums[1] ? nums[0] : nums[1] > nums[2] ?( nums[0] > nums[1] ? nums[0] : nums[1] ): nums[2];
        }

        int f = nums[1], s = Math.max(f, nums[2]);
        // s代表 索引为 i 的时候偷的最大值，f 代表 索引为 i-1 的时候偷的最大值
        for (int i = 3; i < nums.length-1; i++) {
            int temp = s;
            s = Math.max(f + nums[i], s);
            f = temp;
        }
        return s;
    }
}
