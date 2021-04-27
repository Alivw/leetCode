/**
 * @Description:给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * @Author: Awei
 * @Create: 2021-04-12 08:12
 **/
public class Main {
    public static void main(String[] args) {
//        String n = "9";
//        String m = "34";
//        System.out.println(n.compareTo(m)>0 ? "yes" : "no");

        int[] arr = {0,9,8,7,6,5,4,3,2,1};
        System.out.println(largestNumber(arr));;

    }

    /**
     * 输入：nums = [10,2]
     * 输出："210"
     * 输入：nums = [3,30,34,5,9]
     * 输出："9534330"
     *
     * @param nums
     * @return
     */
    public static String largestNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum == 0) {
            return "0";
        }
        String[] strs = new String[nums.length];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j <strs.length-i-1 ; j++) {
                if (compare(strs[j],strs[j+1]) > 0) {
                    String temp = strs[j];
                    strs[j] = strs[j+1];
                    strs[j+1] = temp;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = strs.length-1; i >= 0; i--) {
            builder.append(strs[i]);
        }
        return builder.toString();
    }

    public static int compare(String s1, String s2) {
        return (s1 + s2).compareTo(s2 + s1);
    }
}
