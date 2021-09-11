package demo5;

import java.util.Arrays;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-11 15:13
 **/
public class Main {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        new Main().reverseString(s);
        System.out.println(new String(s));

    }

    /**
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     * @param s
     * @return void
     * @author: Shi Zuwei on 2021/9/11 15:13
     */
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            swap(s, left, right);
            left++;
            right--;
        }
    }
    /**
     * 交换索引位置的值
     * @param s
     * @param left
     * @param right
     * @return void
     * @author: Shi Zuwei on 2021/9/11 15:19
     */
    public void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
