package p81.搜索旋转排序数组ii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    /**
     * 已知存在一个按非降序排列的整数数组 nums ，数组中的值不必互不相同。
     * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转 ，
     * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
     * 例如， [0,1,2,4,4,4,5,6,6,7] 在下标 5 处经旋转后可能变为 [4,5,6,6,7,0,1,2,4,4] 。
     * 给你 旋转后 的数组 nums 和一个整数 target ，请你编写一个函数来判断给定的目标值是否存在于数组中。如果 nums 中存在这个目标值 target ，则返回 true ，否则返回 false 。
     * 你必须尽可能减少整个操作步骤。
     *
     * @param args
     */
    public static void main(String[] args) {
        // new Main().search(new int[]{4, 5, 6, 6, 7, 7, 7, 0, 1, 2, 4, 4}, 3);


       re();

    }


    public boolean search(int[] nums, int target) {
        int idx = findMaxNumber(nums);
        System.out.println(idx);
        return false;
    }

    private int findMaxNumber(int[] nums) {
        // [0,1,2,4,4,4,5,6,6,7] ===> [4,5,6,6,7,0,1,2,4,4]
        int left = 0, right = nums.length - 1, ans = -1, mid;
        while (left <= right) {
            mid = left + (right - left >> 1);
            if (nums[mid] > nums[mid + 1]) return mid;

            if (nums[mid] < nums[mid + 1]) {
                ans = mid;
                left = mid + 1;
            } else
                left = mid + 1;
        }
        return ans;
    }

    static void reverse(char[] data) {
        int left = 0, right = data.length - 1;
        char temp;
        while (left < right) {
            temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
    }

    static void re() {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");

        List<String> list = new ArrayList<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String s = String.valueOf(word.charAt(i));
                if(!list.contains(s)){
                    list.add(s);
                }
            }
        }

        String[] ans = list.toArray(new String[list.size()]);

    }
}
