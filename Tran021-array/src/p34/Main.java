package p34;

import javax.sound.midi.MidiChannel;
import java.util.MissingFormatArgumentException;

public class Main {

    public static void main(String[] args) {
        //24,69,100,99,79,78,67,36,26,19
        System.out.println(peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }


    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回[-1, -1]。
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int leftIdx = findFirstPosition(nums, target);
        if (leftIdx == -1) {
            return new int[]{-1, -1};
        }
        int rightIdx = findLastPosition(nums, target);
        return new int[]{leftIdx, rightIdx};
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    private int findFirstPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (target == nums[mid]) {
                right = mid;
            } else right = mid - 1;

        }

        return nums[left] == target ? left : -1;
    }

    private int findLastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right + 1 - left >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (target == nums[mid]) {
                left = mid;
            } else right = mid - 1;
        }
        return left;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left < right) {
            int mid = left + (right - left >> 1);
            if (nums[mid] < target) {

            }
        }
        return ans;
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left >> 1);
            if (arr[mid] > arr[mid + 1] && arr[mid - 1] < arr[mid]) return mid;

            if(arr[mid]<arr[mid+1]) left=mid+1;
            else right = mid - 1;
        }
        return -1;
    }
}
