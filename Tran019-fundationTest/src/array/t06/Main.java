package array.t06;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-11 17:08
 **/
public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 1};
        int[] b = new int[]{2, 2};
        Arrays.stream(new Main().intersect(a, b)).forEach(i -> System.out.print(i + " "));
    }


    /**
     * 两个数组的交集
     *
     * @param nums1
     * @param nums2
     * @return int[]
     * @author: Shi Zuwei on 2021/9/11 17:10
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0, right = 0;
        List<Integer> list = new ArrayList<>();
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                list.add(nums1[left]);
                left++;
                right++;
            }else if (nums1[left] < nums2[right]) {
                left++;
            } else right++;


        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
