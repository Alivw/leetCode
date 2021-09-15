package array.t07;

import java.util.Arrays;

/**
 * @Description:
 * @Author: shizuwei
 * @Create: 2021-09-14 13:47
 **/
public class Main {
    public static void main(String[] args) {
        /**
         * 输入：digits = [1,2,3]
         * 输出：[1,2,4]
         * 解释：输入数组表示数字 123。
         */
        Arrays.stream(new Main().plusOne(new int[]{1, 2, 3})).forEach(i -> System.out.print(i+" "));
    }

    /**
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     *
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     *
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * @param: digits
     * @return int[]
     * @author Shi Zuwei on 2021/9/14 13:48
     */
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] ans =new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}
