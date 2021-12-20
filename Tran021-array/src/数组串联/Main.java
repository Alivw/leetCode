package 数组串联;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/18 11:22
 */
public class Main {


    public static void main(String[] args) {


    }


    /**
     *
     * 给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有 0 <= i < n 的 i ，满足下述所有要求：
     *
     * ans[i] == nums[i]
     * ans[i + n] == nums[i]
     * 具体而言，ans 由两个 nums 数组 串联 形成。
     *
     * @param nums
     * @return
     */
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[i % nums.length];
        }
        return res;
    }
}
