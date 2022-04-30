package 三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    public static List<List<Integer>> threeSum(int[] nums){
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int a = 0; a < len; a++) {
            // 需要和上一次枚举的数不同
            if (a > 0 && nums[a] == nums[a - 1]) continue;

            // c 对应的指针初始指向数组的最右端
            int c = len - 1;

            int target = -nums[a];
            // 枚举 b
            for (int b = a + 1; b < len; b++) {
                if(b>a+1&&nums[b]==nums[b-1]) continue;

                while (b < c && nums[b] + nums[c] > target) {
                    c--;
                }

                if(b==c) break;

                if (nums[b] + nums[c] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[a]);
                    list.add(nums[b]);
                    list.add((nums[c]));
                    ans.add(list);
                }
            }

        }

        return ans;
    }
}
