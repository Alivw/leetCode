package 数组的中心索引;

import com.sun.javafx.sg.prism.web.NGWebView;

import javax.swing.plaf.metal.MetalIconFactory;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-23 15:00
 **/
public class Main {
    /**
     * 给你一个整数数组nums ，请计算数组的 中心下标 。
     *
     * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
     *
     * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
     *
     * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
     * @param: args
     * @return void
     * @author Shi Zuwei on 2021/9/23 15:01
     */
    public static void main(String[] args) {
//        System.out.println(new Main().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1.hashCode() == o2.hashCode()?"Y":"N");

        System.out.println("-==============");
        new Child("mike");
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (s == sum - s) {
                return 0;
            }
        }

        return -1;
    }
}
