package day04;

import java.util.*;

/**
 * @Description
 * @Created: with IntelliJ IDEA.
 * @Author jalivv
 * @createTime 2022/2/7 19:24
 */
public class Test {

    public static void main(String[] args) {
        new Test().search2(new int[]{5, 7, 7, 8, 8, 10}, 8);
    }


    /**
     * 数组中重复的元素
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set =new HashSet<>();
        for(int item :nums){
            if(set.contains(item)){
                return item;
            }else{
                set.add(item);
            }
        }
        return 0;
    }

    public int findRepeatNumber1(int[] nums){
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * 统计数字在数组中出现的次数
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        return map.get(target) == null ? 0 : map.get(target);
    }

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int search2(int[] nums, int target) {
        int left = 0, right = nums.length - 1,res=0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int i = mid, j = mid+1;
                while (i>=0||j<nums.length) {
                    if(i>=0&&nums[i]==target)
                        res++;
                    if (j<nums.length&&nums[j] == target) {
                        res++;
                    }
                    i--;j++;
                }
                return res;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
