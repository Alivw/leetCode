import java.util.Arrays;

/**
 * @Description:给你一个数组nums和一个值val，你需要原地移除所有数值等于val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用o(1）额外空间并原地修改输入数组。元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @Author: Awei
 * @Create: 2021-04-19 18:52
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
    }
    public static int removeElement(int[] nums, int val) {
        int left= 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
            }
        }
        return left;
    }
}
